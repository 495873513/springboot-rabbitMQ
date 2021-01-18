package com.dabaojian.comConfig;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PubSubConfig {

    // 声明两个队列
    @Bean
    public Queue pubsubQueue1(){
        return new Queue("pubsub-Queue1");
    }

    @Bean
    public Queue pubsubQueue2(){
        return new Queue("pubsub-Queue2");
    }

    // 申明一个交换机
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("pubsub-Exchange");
    }

    // 将队列绑定到交换机
    @Bean
    public Binding bindExchangeMan(Queue pubsubQueue1,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(pubsubQueue1).to(fanoutExchange);
    }

    @Bean
    public Binding bindExchangeWoMan(Queue pubsubQueue2,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(pubsubQueue2).to(fanoutExchange);
    }
}
