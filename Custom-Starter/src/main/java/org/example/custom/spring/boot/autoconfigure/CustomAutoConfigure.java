package org.example.custom.spring.boot.autoconfigure;

import org.example.custom.spring.boot.autoconfigure.service.HelloService;
import org.example.custom.spring.boot.autoconfigure.service.impl.HelloServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloServiceImpl.class)
public class CustomAutoConfigure {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomAutoConfigure.class);

    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService() {
        LOGGER.info("Init helloService");
        return new HelloServiceImpl();
    }
}
