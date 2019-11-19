package com.example.demofeign;

import com.example.demofeign.feign.DemoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class DemoFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFeignApplication.class, args);
    }

}
