package com.springboot.rabbitmq.service.cumtomer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HelloReceiver {
    /**
     * 19      * 指定监听队列的名字
     * 20
     */
    @RabbitListener(queues = "test-queue-name")
    public void process(String msg) {
        log.info("接受到消息：{}", msg);
    }
}
