package com.springcloud.common.intercepter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerRequestFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;

/**
 * 自定义RestTemplate拦截器
 * Created by qmaolong on 2020/6/15
 */
@Component
@Slf4j
public class MyLoadBalanceIntercepter implements ClientHttpRequestInterceptor {
    @Autowired
    private LoadBalancerClient client;
    @Autowired
    private LoadBalancerRequestFactory loadBalancerRequestFactory;

    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] bytes, ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {
        log.info("intercepter here");
        final URI URL = httpRequest.getURI();
        String serverName = URL.getHost();
        return this.client.execute(serverName, loadBalancerRequestFactory.createRequest(httpRequest, bytes, clientHttpRequestExecution));
    }
}
