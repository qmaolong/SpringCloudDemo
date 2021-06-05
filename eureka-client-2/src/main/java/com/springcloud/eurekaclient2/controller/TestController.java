package com.springcloud.eurekaclient2.controller;

import com.springcloud.common.feign.UserFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qmaolong on 2020/6/15
 */
@RestController
@Slf4j
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserFeignService userFeignService;

    @GetMapping("/client2/testHello")
    public String hello(){
        log.info(Thread.currentThread().getName());
//        return restTemplate.getForObject("http://eureka-client-1/user/hello", String.class);
        return userFeignService.userHello();
    }

}
