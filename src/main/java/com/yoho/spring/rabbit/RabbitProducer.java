package com.yoho.spring.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class RabbitProducer {
    private AmqpTemplate amqpTemplate;

    public void sendQueue(String exchange_key, String queue_key, Object object) {
        // convertAndSend 将Java对象转换为消息发送至匹配key的交换机中Exchange
        amqpTemplate.convertAndSend(exchange_key, queue_key, object);
    }

    public void setAmqpTemplate(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }
}
