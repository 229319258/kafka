package com.ffq.kafka;

import com.ffq.kafka.producer.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class KafkaApplication {

    @Autowired
    private MsgProducer msgProducer;

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }


    @RequestMapping("/producer")
    public void producer() {
        msgProducer.sendMessage("topic-1", LocalDateTime.now().toString() + " ");
    }

}

