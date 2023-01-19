package com.kafka.demo.controller;

import com.kafka.demo.service.KafkaSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApacheKafkaController {

    @Autowired
    KafkaSenderService kafkaSenderService;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("message") String message) {
        kafkaSenderService.send(message);

        return "Message sent Successfully";
    }

}