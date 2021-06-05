package com.springcloud.eurekaclient1.fallback;

import com.springcloud.common.feign.UserFeignService;
import org.springframework.stereotype.Component;

/**
 * Created by qmaolong on 2020/6/16
 */
@Component
public class UserFeignFallbackImpl implements UserFeignService {
    @Override
    public String userHello() {
        return "fallback";
    }

    @Override
    public String index() {
        return null;
    }
}
