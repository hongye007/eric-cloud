package com.eric.client.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    //注入客户端对象
    @Autowired
    private ProductClient productClient;

    @GetMapping("/user/findAllFeignClient")
    public String findAllFeignClient(){
        String msg = productClient.findAll();
        return msg;
    }

}

@FeignClient("eric-cloud-task")
interface ProductClient {
    @GetMapping("/product/findAll")
    String findAll();
}
