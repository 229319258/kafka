package com.ffq.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author: ffq
 * @Description:
 * @Date: Create in 16:32 2019/2/15
 */
@Slf4j
@Component
public class MsgConsumer {
    @KafkaListener(topics = "topic-1")
    public void processMessage(String message) {
        log.info("接收到消息：{}", message);
    }
}
