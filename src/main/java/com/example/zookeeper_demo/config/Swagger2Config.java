package com.example.zookeeper_demo.config;/**
 * @author wj
 * @date 2022/3/23
 * @version 1.0
 */

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 15961
 * @create 2022-03-23
 * @desc Swagger2Config
 **/
@Configuration // 告诉Spring容器，这个类是一个配置类
@EnableSwagger2 // 启用Swagger2功能
@EnableSwaggerBootstrapUI
public class Swagger2Config {
    /**
     * 配置Swagger2相关的bean
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Zookeeper")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.zookeeper_demo.controller"))// com包下所有API都交给Swagger2管理
                .paths(PathSelectors.any()).build();
    }

    /**
     * API文档地址：http://127.0.0.1:8080/doc.html
     * <p>
     * 此处主要是API文档页面显示信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Zookeeper练习API") // 标题
                .description("主要用于练习框架构建：SpringBoot+mybatis+swagger2+zookeeper") // 描述
                .termsOfServiceUrl("http://www.wangjun123.com") // 服务网址，一般写公司地址
                .version("1.0") // 版本
                .build();
    }
}
