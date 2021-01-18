package com.dabaojian.rabbitmqProvider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicQueue {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void topicMessage(String routeKey,String message){
        rabbitTemplate.convertAndSend("topic-Exchange",routeKey,message);
    }

}
