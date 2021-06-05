package com.springboot.nacosclient1;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo(scanBasePackages = "com.springcloud.dubbo")
public class NacosClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosClient1Application.class, args);
    }

}
