package com.dabaojian.comConfig;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    // 声明一个队列即可
    @Bean
    public Queue helloWorldQueue(){
        return new Queue("helloWorldQueue");
    }

}
