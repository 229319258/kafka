package com.ffq.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.SuccessCallback;

/**
 * @Author: ffq
 * @Description:生产者
 * @Date: Create in 16:28 2019/2/15
 */
@Slf4j
@Component
public class MsgProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage(String topicName, String jsonData) {
        log.info("topic{}发送数据:{}", topicName, jsonData);
        kafkaTemplate.send(topicName, jsonData);
    }
}
