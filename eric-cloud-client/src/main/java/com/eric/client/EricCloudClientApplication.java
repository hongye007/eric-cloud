package com.eric.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EricCloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EricCloudClientApplication.class, args);
    }

}
