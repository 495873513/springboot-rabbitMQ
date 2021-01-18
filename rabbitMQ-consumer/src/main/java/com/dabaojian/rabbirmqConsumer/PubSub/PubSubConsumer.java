package com.dabaojian.rabbirmqConsumer.PubSub;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PubSubConsumer {

    @RabbitListener(queues = "pubsub-Queue1")
    public void subManQueue(String message){
        System.out.println("发布订阅模式-pubsub-Queue1:"+message);
    }

    @RabbitListener(queues = "pubsub-Queue2")
    public void subWoManQueue(String message){
        System.out.println("发布订阅模式-pubsub-Queue1:"+message);
    }

}
