package com.springboot.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitmqConfig {
    /**
     * 创建消息队列
     *
     * @return
     */
    @Bean
    public Queue queue() {
        //设置队列名称叫 test-queue-name
        return new Queue("test-queue-name");
    }
}
