package com.springboot.nacosclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qmaolong on 2020/6/23
 */
@RestController
public class EchoController {
    @Value("${nacos.client1.test:local}")
    private String testValue;

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        System.out.println(testValue);
        return "Hello Nacos Discovery " + string;
    }

}