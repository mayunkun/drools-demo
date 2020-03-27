package com.aeert.droolsdemo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class DroolsDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DroolsDemoApplication.class, args);
    }
}
