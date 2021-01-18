package com.dabaojian.rabbirmqConsumer.WorkQueue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "WorkQueues")
public class WorkConsumer1 {

    @RabbitHandler
    public void getHelloWorld(String message) throws Exception{
        System.out.println("工作队列模式1: "+message);
    }

}
