package com.ffq.kafka;

import com.ffq.kafka.consumer.MsgConsumer;
import com.ffq.kafka.producer.MsgProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaApplicationTests {

    @Autowired
    private MsgConsumer msgConsumer;

    @Autowired
    private MsgProducer msgProducer;

    @Test
    public void contextLoads() throws InterruptedException {
        int i = 1;
        while (true) {
            if (i++ == 9) {
                break;
            }
            Thread.sleep(1000);
            msgProducer.sendMessage("topic-1", LocalDateTime.now().toString() + " " + i);
        }
    }

}

