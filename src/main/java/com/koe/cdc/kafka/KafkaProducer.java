package com.koe.cdc.kafka;

import io.debezium.data.Json;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class KafkaProducer {
//    @Resource
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    @Value("${kafka.topic.user}")
//    private String topicUser;//topic名称
//
//    public void sendUserMessage(Json json) {
//
//        String message = json.toString();
//        kafkaTemplate.send(topicUser, message);
//    }
}
