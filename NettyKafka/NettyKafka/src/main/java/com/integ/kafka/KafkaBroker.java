package com.integ.kafka;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.google.common.io.Resources;
import com.integ.model.QueryProto;
import com.integ.model.QueryProto.QueryParam;

public class KafkaBroker {

	// private static KafkaBroker kafkaBroker;

	private static KafkaProducer<String, String> producer;

	private static Long key = 0L;

	private KafkaBroker() {

	}

	/*
	 * public static KafkaBroker getInstance() {
	 * 
	 * if (kafkaBroker == null) { synchronized (kafkaBroker) { if (kafkaBroker
	 * == null) kafkaBroker = new KafkaBroker(); } } return kafkaBroker;
	 * 
	 * }
	 */

	public static KafkaProducer<String, String> createProducer() {
		if (producer == null) {
			if (producer == null) {
				Properties props = new Properties();
				props.put("bootstrap.servers", "localhost:9092");
				props.put("acks", "all");
				props.put("retries", 0);
				props.put("batch.size", 16384);
				props.put("linger.ms", 1);
				props.put("buffer.memory", 33554432);
				props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
				props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
				props.put("group.id", "auzmorGroup");
				producer = new KafkaProducer<String, String>(props);
				producer = new KafkaProducer<>(props);

			}
		}
		return producer;
	}

	public static void sendMsg(KafkaProducer<String, String> producer, String queryProto, String topicName) {

		System.out.println(key);
		System.out.println("producer  " + producer);
		// System.out.println("queryProto "+queryProto);
		// producer.send("",new ProducerRecord<String,
		// String>((++key).toString(), queryProto));

		producer.send(new ProducerRecord<String, String>(topicName, (++key).toString(), queryProto));
		// producer.send(new ProducerRecord<String, String>((++key).toString(),
		// queryProto));
		producer.flush();
		System.out.println("out from Kafka");
		// producer.close();
	}

}
