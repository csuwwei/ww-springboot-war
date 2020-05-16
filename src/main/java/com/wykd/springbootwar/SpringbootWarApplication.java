package com.wykd.springbootwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootWarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWarApplication.class, args);
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }


    @GetMapping("/helloworld")
    public String helloworld() {
        return "hello world helloworld helloworld helloworld";
    }


}
