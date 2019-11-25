package com.capgemini.jtp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
		 * @ Description   :
		 * @ Author        :  HASI
		 * @ CreateDate    :  2019/10/24 0024 10:24
		 * @ UpdateUser    :  HASI
		 * @ UpdateDate    :  2019/10/24 0024 10:24
		 * @ UpdateRemark  :  修改内容
		 * @ Version       :  1.0
		 * Inherited
		 * EnableAutoConfiguration
		 * ComponentScan
		 * Target
		 * Retention
		 */
@SpringBootApplication
@MapperScan("com.capgemini.jtp.mapper")
@EnableCaching
@EnableEurekaClient
@EnableDiscoveryClient
public class JtpSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtpSysApplication.class, args);
	}
}
