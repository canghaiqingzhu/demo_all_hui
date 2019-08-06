package com.xiehui93.controller;

import com.alibaba.fastjson.JSON;
import com.xiehui93.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("msg")
public class JsonController {
    @Autowired
    private UserService userService;

    @RequestMapping("set")
    @ResponseBody
    public String setUser(String name,String password){
        //userService.create(name, password);
        Map map =  new HashMap<String,Object>();
        System.out.println(name +"   "+ password);
        Map user = userService.hasUser(name, password);
        System.out.println(JSON.toJSONString(user));
        if(user!=null){
            map.put("result","true");
            map.put("user",user);
        }else{
            map.put("result","false");
            map.put("msg","插入失败！");
        }
        return JSON.toJSONString(map);
    }
}
