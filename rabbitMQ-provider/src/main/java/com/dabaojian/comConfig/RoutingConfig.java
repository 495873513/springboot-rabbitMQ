package com.dabaojian.comConfig;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutingConfig {

    // 声明队列
    @Bean
    public Queue routQueue1(){
        return new Queue("routQueue1");
    }

    @Bean
    public Queue routQueue2(){
        return new Queue("routQueue2");
    }

    // 声明交换机
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("routing-Exchange");
    }

    // 绑定队列
    @Bean
    public Binding bindExchangeRout1(Queue routQueue1,DirectExchange directExchange){
        return BindingBuilder.bind(routQueue1).to(directExchange).with("rout1");
    }

    @Bean
    public Binding bindExchangeRout2(Queue routQueue1,DirectExchange directExchange){
        return BindingBuilder.bind(routQueue1).to(directExchange).with("rout2");
    }
}
