package com.xiehui93.controller;

import com.xiehui93.bean.User;
import io.swagger.annotations.*;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.jws.WebResult;
/*
*
*
* @Api： 描述 Controller
@ApiIgnore： 忽略该 Controller，指不对当前类做扫描
@ApiOperation： 描述 Controller类中的 method接口
@ApiParam： 单个参数描述，与 @ApiImplicitParam不同的是，他是写在参数左侧的。如（ @ApiParam(name="username",value="用户名")Stringusername）
@ApiModel： 描述 POJO对象
@ApiProperty： 描述 POJO对象中的属性值
@ApiImplicitParam： 描述单个入参信息
@ApiImplicitParams： 描述多个入参信息
@ApiResponse： 描述单个出参信息
@ApiResponses： 描述多个出参信息
@ApiError： 接口错误所返回的信息
* */
@Api(value = "平台操作员接口")
@RequestMapping("/api")
@RestController
public class TestController {

    @ApiOperation(value = "根据id查询人口信息", notes = "json数据取出id作为查询条件", produces = "application/json")
    @ApiImplicitParam(name = "doc", value = "json数据", required = true, dataType = "String", paramType = "query")
    //@RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String index(String doc) {
        return doc;
    }

    @ApiOperation(value = "添加人口数据前检验身份证", notes = "json数据一条人口信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "user", value = "人员内容", required = true, dataType = "User")
    })
    @RequestMapping(value = "/test", method = RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public String test(@RequestParam("token")String token,@RequestParam("user")User user) {
        return token + "\t" + user.toString();
    }

    @RequestMapping(value = "/swagger")
    //@RequestMapping("/swagger")
    //@RequestMapping(value = "/swagger",method = RequestMethod.POST)
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ">>>>"+name;
    }

    @RequestMapping(value = "/del", method = {RequestMethod.POST, RequestMethod.GET})// 方法说明
    @ApiOperation(value = "删除学生记录学生记录")// 定义返回值意义
    @ApiResponses({
            @ApiResponse(code = 400, message = "服务器内部异常"),
            @ApiResponse(code = 500, message = "权限不足") })
    public int del(int id){
        System.out.println("del id = " + id);
        return 1;
    }
}
