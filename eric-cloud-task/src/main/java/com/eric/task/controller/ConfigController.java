package com.eric.task.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RefreshScope
public class ConfigController {

    @Value("${user.name}")
    private String name;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public String get() {
        return name;
    }

    @GetMapping("/product/findAll")
    @ResponseBody
    public Map<String, Object> findAll() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "服务调用成功，服务提供的名称为：" + name + "kkkkd");
        map.put("status", true);
        return map;
    }
}
