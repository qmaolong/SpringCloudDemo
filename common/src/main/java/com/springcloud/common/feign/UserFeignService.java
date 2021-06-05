package com.springcloud.common.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by qmaolong on 2020/6/15
 */
@FeignClient(value = "eureka-client-1")
public interface UserFeignService {

    @GetMapping("/user/hello")
    String userHello();

    @GetMapping("/")
    String index();
}
