package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.MybatisUser;

import java.util.List;

public interface UserService {
    List<MybatisUser> findAll();
}
