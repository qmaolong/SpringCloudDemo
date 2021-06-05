package com.springcloud.eurekaclient1.controller;

import com.springcloud.common.feign.UserFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qmaolong on 2020/6/15
 */
@RestController
@Slf4j
@Api("用户")
public class UserController implements UserFeignService {
    @Value("${foo:local}")
    private String foo;

    @Override
    @ApiModelProperty("哈罗")
    public String userHello() {
        log.info(foo);
        return "hello";
    }

    @Override
    public String index(){
        return "index";
    }

}
