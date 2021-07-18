package com.springboot.rabbitmq.service.procedurer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class HelloSender {

    /**
     * 19      * spring整合的操作类
     * 20      * Message 发送的消息对象
     * 21      * void send(Message var1) throws AmqpException;
     * 22      * <p>
     * 23      * var1 路由键 Message 发送的消息对象
     * 24      * void send(String var1, Message var2) throws AmqpException;
     * 25      * <p>
     * 26      * var1 指定交换器名称 var2 路由键 Message 发送的消息对象
     * 27      * void send(String var1, String var2, Message var3) throws AmqpException;
     * 28      *
     * 29      *
     * 30      * void convertAndSend() 方法不需要指定MessageProperties属性即可发布
     * 31
     */
    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void send() {
        String msg = "111111";
        Message message = new Message(msg.getBytes(), new MessageProperties());
        rabbitTemplate.send("test-queue-name", message);
    }

}

