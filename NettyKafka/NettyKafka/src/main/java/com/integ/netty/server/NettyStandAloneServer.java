package com.integ.netty.server;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.integ.kafka.KafkaBroker;
import com.integ.model.QueryProto.QueryParam;
import com.integ.util.NettyKafkaUtil;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.QueryStringDecoder;
import io.netty.util.CharsetUtil;

public class NettyStandAloneServer {

	private ChannelFuture channel;
	private final EventLoopGroup masterGroup;
	private final EventLoopGroup slaveGroup;
	private static final Integer port=9292;
	private static String topicName = "auzmor";
	

	public NettyStandAloneServer() {
		masterGroup = new NioEventLoopGroup();
		slaveGroup = new NioEventLoopGroup();
		
	}

	public void start() // #1
	{
		System.out.println("Server started with Port::"+port);
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				
				shutdown();
			}
		});

		try {
			// #3
			final ServerBootstrap bootstrap = new ServerBootstrap().group(masterGroup, slaveGroup)
					.channel(NioServerSocketChannel.class).childHandler(new ChannelInitializer<SocketChannel>() // #4
					{
						
						@Override
						public void initChannel(final SocketChannel ch) throws Exception {
							
							ch.pipeline().addLast("codec", new HttpServerCodec());
							ch.pipeline().addLast("aggregator", new HttpObjectAggregator(512 * 1024));
							ch.pipeline().addLast("request", new ChannelInboundHandlerAdapter() // #5
							{
								@Override
								public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
									
									
									
									if (msg instanceof FullHttpRequest) {
										final FullHttpRequest request = (FullHttpRequest) msg;
										ByteBuf jsonBuf = request.content();
										String jsonStr = jsonBuf.toString(CharsetUtil.UTF_8);

										System.out.println("request  " + jsonStr);

										QueryStringDecoder queryDecoder = new QueryStringDecoder(request.getUri(),
												true);
										Map<String, List<String>> parameters = queryDecoder.parameters();

										
										String queryLit = NettyKafkaUtil
												.getQueryProto(NettyKafkaUtil.getQueryMap(queryDecoder));
										
										System.out.println("QUERY LIST"+queryLit);
												
									
										
										KafkaBroker.sendMsg(KafkaBroker.createProducer(), queryLit,topicName);

										System.out.println("Query " + parameters);

										String uri = request.getUri();

										System.out.println("uri  " + uri);

										final String responseMessage = "Msg Sent to Kafka!";

										FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1,
												HttpResponseStatus.OK, copiedBuffer(responseMessage));

										if (HttpHeaders.isKeepAlive(request)) {
											response.headers().set(HttpHeaders.Names.CONNECTION,
													HttpHeaders.Values.KEEP_ALIVE);
										}
										response.headers().set(HttpHeaders.Names.CONTENT_TYPE, "text/plain");
										response.headers().set(HttpHeaders.Names.CONTENT_LENGTH,
												responseMessage.length());

										ctx.writeAndFlush(response);
									} else {
										super.channelRead(ctx, msg);
									}
								}

								@Override
								public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
									ctx.flush();
								}

								@Override
								public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
										throws Exception {
									ctx.writeAndFlush(new DefaultFullHttpResponse(HttpVersion.HTTP_1_1,
											HttpResponseStatus.INTERNAL_SERVER_ERROR,
											copiedBuffer(cause.getMessage())));
								}
							});
						}
					}).option(ChannelOption.SO_BACKLOG, 128).childOption(ChannelOption.SO_KEEPALIVE, true);
			channel = bootstrap.bind(port).sync();
		} catch (final InterruptedException e) {
		}
	}

	public void shutdown() // #2
	{
		slaveGroup.shutdownGracefully();
		masterGroup.shutdownGracefully();

		try {
			channel.channel().closeFuture().sync();
		} catch (InterruptedException e) {
		}
	}

	public static ByteBuf copiedBuffer(String msg) {

		return Unpooled.wrappedBuffer(msg.getBytes());

	}

}
