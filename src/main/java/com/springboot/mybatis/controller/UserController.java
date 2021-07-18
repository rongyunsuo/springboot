package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.MybatisUser;
import com.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<MybatisUser> findAll(){
        return userService.findAll();
    }

}