package com.springcloud.eurekaclient2.config;

import com.springcloud.common.annotation.MyLoadBalance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qmaolong on 2020/6/15
 */
@Configuration
public class BeanConfiguration {

    @Bean
    @MyLoadBalance
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
