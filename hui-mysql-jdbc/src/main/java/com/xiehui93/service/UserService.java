package com.xiehui93.service;

import java.util.Map;

public interface UserService {
    void create(String name, String password);
    Map hasUser(String name, String password);
    void deleteByName(String name);
    Integer getUserSize();
    void deleteAllUsers();
}
