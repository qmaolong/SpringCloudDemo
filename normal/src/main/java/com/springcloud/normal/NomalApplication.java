package com.springcloud.normal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NomalApplication {

    public static void main(String[] args) {
        SpringApplication.run(NomalApplication.class, args);
    }

    @RestController
    class IndexController {

        @RequestMapping("/")
        public String index(){
            return "Welcome My Bro!";
        }
    }

}
