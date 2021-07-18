package com.springboot.redis.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;

import java.io.Serializable;

@Data
public class RedisUser implements Serializable {
    private int id;
    private String userName;
    private String password;

    public RedisUser(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public RedisUser() {
    }
}
