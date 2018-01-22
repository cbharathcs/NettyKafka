package com.integ.util;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.integ.model.QueryProto;
import com.integ.model.QueryProto.QueryParam;

import io.netty.handler.codec.http.QueryStringDecoder;

public class NettyKafkaUtil {
	public static Map<String, List<String>> getQueryMap(QueryStringDecoder queryDecoder){
		return queryDecoder.parameters();
	}
	public static String getQueryProto(Map<String, List<String>> queryMap){
		
		List<QueryParam.Builder> queryLit  = queryMap.entrySet().stream().map(
				map->QueryProto.QueryParam.newBuilder().setQueryKey(map.getKey()).setQueryValue(map.getValue().toString())).collect(Collectors.toList());
		
		return queryLit.toString();
		
	}
}
