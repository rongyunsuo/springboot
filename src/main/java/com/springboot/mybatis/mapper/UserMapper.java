package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.MybatisUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//指定这是一个操作数据库的mapper
public interface UserMapper {
    List<MybatisUser> findAll();
}
