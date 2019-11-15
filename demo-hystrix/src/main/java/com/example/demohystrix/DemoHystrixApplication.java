package com.example.demohystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@SpringBootApplication
@EnableHystrix
public class DemoHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoHystrixApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
@RestController
class HystrixDemo {
    @Resource
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping(value = "/echo/{s}")
    public String echo(@PathVariable(value = "s") String s){
        return  restTemplate.getForObject("www.baidu.com",String.class);
    }
    public String fallback(String s){
        return "Hystrix fallback:"+s;
    }
}