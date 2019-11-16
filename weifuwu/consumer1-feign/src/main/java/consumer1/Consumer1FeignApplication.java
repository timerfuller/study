package consumer1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class Consumer1FeignApplication {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    public static void main(String[] args) {
        SpringApplication.run( Consumer1FeignApplication.class, args );
    }


    @RequestMapping("/consumerfeign/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
