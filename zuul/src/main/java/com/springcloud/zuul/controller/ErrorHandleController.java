package com.springcloud.zuul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qmaolong on 2020/6/17
 */
@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class ErrorHandleController implements ErrorController {
    @Value("${server.error.path:${error.path:/error}}")
    public String errorPath;

    @Override
    public String getErrorPath() {
        return errorPath;
    }

    @RequestMapping
    @ResponseBody
    public String error(){
        return "error";
    }
}
