package com.spring.demo.laocao.service;

import com.spring.demo.laocao.api.HelloWorld;
import org.springframework.stereotype.Service;

/**
 * @author C.A.O
 * @date 2020/4/9
 */
@Service
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
