package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.MybatisUser;
import com.springboot.mybatis.mapper.UserMapper;
import com.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<MybatisUser> findAll() {
        return userMapper.findAll();
    }
}
