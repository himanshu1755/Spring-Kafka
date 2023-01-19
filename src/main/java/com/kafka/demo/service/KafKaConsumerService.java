package com.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumerService
{

    @KafkaListener(topics = "test-topic",
            groupId = "group_id")
    public void consume(String message)
    {
        System.out.println(String.format("Message recieved -> %s", message));
    }
}