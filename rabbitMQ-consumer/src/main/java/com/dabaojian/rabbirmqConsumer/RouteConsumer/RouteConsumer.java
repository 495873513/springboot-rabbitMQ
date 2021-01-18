package com.dabaojian.rabbirmqConsumer.RouteConsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RouteConsumer {

    @RabbitListener(queues = "routQueue1")
    public void getRoute1Message(String Message){
        System.out.println("routQueue1消息："+Message);
    }

    @RabbitListener(queues = "routQueue2")
    public void getRoute2Message(String Message){
        System.out.println("routQueue1消息："+Message);
    }

}
