package com.capgemini.csd.consumer1;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule getRule(){
//        return  new RoundRobinRule();  RandomRule AvailabilityFilteringRule WeightedResponseTimeRule RetryRule BestAvailableRule ZoneAvoidanceRule
        return new RoundRobinRule();
    }
}
