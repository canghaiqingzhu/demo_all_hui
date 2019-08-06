package com.xiehui93.bean;

import java.io.Serializable;
//置，Mybatis自动生成文件配置，Mybatis自动生成实体Bean配置https://fanshuyao.iteye.com/blog/2412996
public class User  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String password;
    /*@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
