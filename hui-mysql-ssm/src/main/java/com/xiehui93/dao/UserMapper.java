package com.xiehui93.dao;

import com.xiehui93.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    //调用xml方式
    public List<User> find();

    //调用注解方式
    @Select("select * from user where id=#{id}")
    public User get(@Param("id") Integer id);
}