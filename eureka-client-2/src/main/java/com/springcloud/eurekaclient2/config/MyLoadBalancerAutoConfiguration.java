package com.springcloud.eurekaclient2.config;

import com.springcloud.common.intercepter.MyLoadBalanceIntercepter;
import com.springcloud.common.annotation.MyLoadBalance;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

/**
 * Created by qmaolong on 2020/6/15
 */
@Configuration
public class MyLoadBalancerAutoConfiguration {

    @MyLoadBalance
    @Autowired(required = false)
    private List<RestTemplate> restTemplates = Collections.emptyList();

    @Autowired
    private MyLoadBalanceIntercepter myLoadBalanceIntercepter;

    @Bean
    public SmartInitializingSingleton smartInitializingSingleton(){
        return () -> {
            for (RestTemplate restTemplate: MyLoadBalancerAutoConfiguration.this.restTemplates){
                List<ClientHttpRequestInterceptor> list = restTemplate.getInterceptors();
                list.add(myLoadBalanceIntercepter);
                restTemplate.setInterceptors(list);
            }
        };
    }
}
