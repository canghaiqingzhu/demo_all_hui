package com.xiehui93.service;

import com.xiehui93.bean.User;

import java.util.List;

public interface UserService {
    public List<User> find();
    public User get(Integer id);
}
