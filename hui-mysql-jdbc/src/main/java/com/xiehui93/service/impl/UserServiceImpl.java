package com.xiehui93.service.impl;

import com.xiehui93.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void create(String name, String password) {
        jdbcTemplate.update("insert into USER(NAME, PASSWORD ) values(?, ?)", name, password);
    }

    @Override
    public Map hasUser(String name, String password) {

        //将结果集数据行中的数据抽取到forum对象中
        /*jdbcTemplate.query("select * from USER where name = ? and password = ?", new Object[]{name,password}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                //orum.setForumName(rs.getString("forum_name"));
                //forum.setForumDesc(rs.getString("forum_desc"));
            }
        });*/
        /*return List<Map> jdbcTemplate.query("select * from USER where name = ? and password = ?", new Object[]{name,password}, new RowMapper<Map>() {
            public Map mapRow(ResultSet rs, int rowNum) throws SQLException {
                Map map = new HashMap<String,Object>();
                map.put("id",rs.getInt("id"));
                map.put("name",rs.getString("name"));
                map.put("password",rs.getString("password"));
                return map;
            }
        });*/
        return jdbcTemplate.queryForMap("select * from USER where name = ? and password = ?", name,password);
        //return jdbcTemplate.queryForMap("select * from user where name='"+name+"' and password ='"+password+"'");
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from USER where NAME = ?", name);
    }

    @Override
    public Integer getUserSize() {
        return  jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from USER");
    }
}
