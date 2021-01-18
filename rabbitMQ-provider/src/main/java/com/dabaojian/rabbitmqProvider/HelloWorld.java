package com.dabaojian.rabbitmqProvider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendHelloWorld(String message){
        this.rabbitTemplate.convertAndSend("helloWorldQueue",message);
        System.out.println("生产者消息："+message);
    }

}
