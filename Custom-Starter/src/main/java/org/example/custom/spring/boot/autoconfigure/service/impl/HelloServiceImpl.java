package org.example.custom.spring.boot.autoconfigure.service.impl;

import org.example.custom.spring.boot.autoconfigure.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloServiceImpl implements HelloService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public void sayHello() {
        LOGGER.info("hello");
    }
}
