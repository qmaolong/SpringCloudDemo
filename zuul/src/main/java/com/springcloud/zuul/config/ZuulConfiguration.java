package com.springcloud.zuul.config;

import com.netflix.zuul.ZuulFilter;
import filter.IpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by qmaolong on 2020/6/17
 */
@Configuration
public class ZuulConfiguration {

    @Bean
    public ZuulFilter IpFilter(){
        return new IpFilter();
    }

}
