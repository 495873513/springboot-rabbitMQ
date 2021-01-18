package com.dabaojian.comConfig;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicsConfig {

    @Bean
    public Queue topicsMessageQueue(){
        return new Queue("topics.message");
    }

    @Bean
    public Queue topicsMessagesQueue(){
        return new Queue("topics.messages");
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topic-Exchange");
    }

    @Bean
    public Binding bindExchangeUser(Queue topicsMessageQueue,TopicExchange topicExchange){
        return BindingBuilder.bind(topicsMessageQueue).to(topicExchange).with("topics.message");
    }

    @Bean
    public Binding bindExchangeOrder(Queue topicsMessagesQueue,TopicExchange topicExchange){
        return BindingBuilder.bind(topicsMessagesQueue).to(topicExchange).with("topics.messages.#");
    }

}
