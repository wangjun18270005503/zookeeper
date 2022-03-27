package com.example.zookeeper_demo;

import com.example.zookeeper_demo.config.CrossFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAsync
@MapperScan(basePackages = {"com.example.zookeeper_demo.mapper"})
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class ZookeeperDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZookeeperDemoApplication.class, args);
    }

    @Bean
    @Profile("dev")
    public FilterRegistrationBean registrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.addUrlPatterns("/*");
        bean.setFilter(new CrossFilter());
        return bean;
    }


}
