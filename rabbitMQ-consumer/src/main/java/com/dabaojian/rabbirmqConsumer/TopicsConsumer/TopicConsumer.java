package com.dabaojian.rabbirmqConsumer.TopicsConsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumer {

    @RabbitListener(queues = "topics.message")
    public void getMessage(String Message){
        System.out.println("topics.message："+Message);
    }

    @RabbitListener(queues = "topics.messages")
    public void getMessages(String Message){
        System.out.println("topics.messages："+Message);
    }

}
