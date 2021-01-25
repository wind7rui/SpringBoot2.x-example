package com.example.service.impl;

import org.example.custom.spring.boot.autoconfigure.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomStarterTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void test(){
        helloService.sayHello();
    }
}
