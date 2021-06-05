package com.springcloud.nacosclient2;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.springcloud.dubbo")
public class NacosClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosClient2Application.class, args);
    }

}
