package com.dabaojian.comConfig;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkQueueConfig {

    @Bean
    public Queue WorkQueues(){
        return new Queue("WorkQueues");
    }

}
