package com.xiehui93.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * swagger  @ApiModel 中
 * 如int类型变量 要换成Integer  并设置example
 */
/*
 * @ApiModel(不能使用“/”)
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel( value = "用户",description="用户对象user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="ID",name="id", dataType = "Long",example="1")
    private Long id;
    @ApiModelProperty(value = "姓名",name="name", dataType = "String", required = true)
    private String name;
    @ApiModelProperty(value = "年纪", dataType = "Integer", required = true,example = "18")
    private Integer age;
    @ApiModelProperty(value = "性别", required = true)
    private Character sex;
    @ApiModelProperty(value = "描述", required = true)
    private String miaosu;
    @ApiModelProperty(value = "生日", dataType = "Date", required = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    @ApiModelProperty(value="id数组",hidden=true)
    private String[] ids;
}
