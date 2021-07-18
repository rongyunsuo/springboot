package com.springboot.redis.controller;

import com.springboot.redis.entity.RedisUser;
import com.springboot.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    RedisUtil redisUtil;
    String key = null;

    @RequestMapping("/set")
    public String set() {
        RedisUser redisUser = new RedisUser(1, "david", "123");
        int i = new Random().nextInt(100);
        key = "user" + i;
        redisUtil.set(key, redisUser);
        return "success saved user !";
    }

    @RequestMapping("/get")
    public String get() {
        RedisUser redisUser = (RedisUser) redisUtil.get(key);
        return redisUser.toString();
    }
}
