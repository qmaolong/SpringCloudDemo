package com.springcloud.nacosclient2.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springcloud.dubbo.IDubboTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qmaolong on 2020/6/23
 */
@RestController
public class IndexController {
    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;
    @Reference(version = "1.0")
    private IDubboTestService dubboTestService;

    @GetMapping("/test/{msg}")
    public String index(@PathVariable("msg") String msg){
        dubboTestService.printHello();
        return restTemplate.getForObject("http://nacos-client-1/echo/" + msg, String.class);
    }
}
