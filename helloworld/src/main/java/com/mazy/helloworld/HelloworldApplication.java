package com.mazy.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController        //@RestController 是responsebody + controller
public class HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }


    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "what",required = false,defaultValue = "world") String what){
        return "Hello" + what;
    }

}
