package com.example.demoeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoEurekaClientApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DemoEurekaClientApplication.class, args);
       Thread.sleep(5000);
    }

}
