package com.xiehui93.controller;

import com.alibaba.fastjson.JSON;
import com.xiehui93.bean.User;
import com.xiehui93.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/find")
    @ResponseBody
    public String find() {
        System.out.println("--------------find---------------");
        String msg = JSON.toJSONString(userService.find());
        System.out.println(msg);
        return msg;
    }
    @RequestMapping("/get/{id}")
    @ResponseBody
    public String get(@PathVariable Integer id){
        String msg = JSON.toJSONString(userService.get(id));
        System.out.println(msg);
        return msg;
    }
}
