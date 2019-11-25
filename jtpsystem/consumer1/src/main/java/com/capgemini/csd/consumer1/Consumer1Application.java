package com.capgemini.csd.consumer1;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@RestController
public class Consumer1Application {

//    private static final String rest_url="http://localhost:8762";
    private static final String rest_url="http://SERVICE-HI";

    @Autowired
    RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run( Consumer1Application.class, args );
    }


    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping("/consumer/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return restTemplate.getForEntity(rest_url+"/hi?name="+name,String.class).getBody();
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
