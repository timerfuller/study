package com.capgemini.service2;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyaohui
 * @date 2018-8-6
 */

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RestController
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, MybatisAutoConfiguration.class})
public class CloudDockerTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudDockerTest2Application.class, args);
    }


    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
