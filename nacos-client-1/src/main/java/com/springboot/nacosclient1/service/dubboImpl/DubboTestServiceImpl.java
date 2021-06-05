package com.springboot.nacosclient1.service.dubboImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.springcloud.dubbo.IDubboTestService;

@Service(version = "1.0")
public class DubboTestServiceImpl implements IDubboTestService {
    @Override
    public void printHello() {
        System.out.println("hello");
    }
}
