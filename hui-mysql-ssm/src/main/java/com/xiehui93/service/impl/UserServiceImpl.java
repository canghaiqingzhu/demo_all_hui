package com.xiehui93.service.impl;

import com.xiehui93.bean.User;
import com.xiehui93.dao.UserMapper;
import com.xiehui93.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> find() {
        return userMapper.find();
    }
    public User get(Integer id){
        return userMapper.get(id);
    }
}