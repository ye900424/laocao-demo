package com.spring.demo.laocao.controller;

import com.spring.demo.laocao.api.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author C.A.O
 * @date 2020/4/9
 */
@RestController
public class DemoController {

    @Autowired
    private HelloWorld helloWorld;

    @GetMapping("/helloWorld")
    public String helloWorld(){
        helloWorld.sayHello();
        return "Hello World!";
    }
}
