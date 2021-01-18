package com.dabaojian.rabbirmqConsumer.HelloWorld;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloWorldQueue")
public class HelloConsumer {

    @RabbitHandler
    public void getHelloWorld(String message) throws Exception{
        System.out.println("简单队列模式: "+message);
    }

}
