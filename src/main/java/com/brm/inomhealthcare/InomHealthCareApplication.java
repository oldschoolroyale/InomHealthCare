package com.brm.inomhealthcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class InomHealthCareApplication {

    public static void main(String[] args) {
        SpringApplication.run(InomHealthCareApplication.class, args);
    }

}
