package com.dabaojian.rabbitmqProvider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorkQuene {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendsendMessage(String messgae) {
        this.rabbitTemplate.convertAndSend("WorkQueues", messgae);
    }
}
