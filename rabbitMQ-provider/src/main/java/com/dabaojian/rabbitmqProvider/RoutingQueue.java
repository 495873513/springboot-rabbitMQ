package com.dabaojian.rabbitmqProvider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoutingQueue {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void routeMessage(String routeKey,String message){
        rabbitTemplate.convertAndSend("routing-Exchange",routeKey,message);
    }

}
