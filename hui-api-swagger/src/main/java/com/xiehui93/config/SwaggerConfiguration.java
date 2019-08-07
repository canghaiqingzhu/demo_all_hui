package com.xiehui93.config;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashSet;
import java.util.Set;


@Configuration
@EnableSwagger2
//@EnableWebMvc  //这个注解spring4.0+用
//@ConditionalOnProperty(name = "swagger.open", havingValue = "true")这个配置主要为了生产环境不生成swagger文档
public class SwaggerConfiguration {
	@Bean
	public Docket createRestApi() {
		Set<String> producesList = new HashSet<>();
		producesList.add("application/json");
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())//调用apiInfo方法,创建一个ApiInfo实例,里面是展示在文档页面信息内容
				//.groupName("app_interface")//移动端接口文档
				.produces(producesList)
				.select()
				//.apis(RequestHandlerSelectors.basePackage("com.xiehui93.controller"))
				//.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))//这是注意的代码
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
				.paths(PathSelectors.any())
				.build();
	}

	//文档信息说明和个人信息配置
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("xxx接口文档")
				.description("测试API")
				.termsOfServiceUrl("http://www.xxx.com")
				.contact(new Contact("xiehui", "", "xiehui93@qq.com"))
				.version("1.0")
				.build();
	}
}