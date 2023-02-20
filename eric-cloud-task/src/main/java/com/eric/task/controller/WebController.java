package com.eric.task.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sentinel")
public class WebController {
    @SentinelResource(value = "getName",blockHandler = "blockHandlerMethodByLimit")
    @GetMapping(value = "/{name}")
    public String getName(@PathVariable("name") String name){
        return name;
    }

    public String blockHandlerMethodByLimit(BlockException e){
        return "被限流";
    }
}
