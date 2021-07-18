package com.springboot.rabbitmq.controller;

import com.springboot.rabbitmq.service.procedurer.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rabbit")
public class RabbitController {

    @Autowired
    private HelloSender helloSender;
    @Autowired

    @RequestMapping
    public void hello() {
        helloSender.send();
    }
}