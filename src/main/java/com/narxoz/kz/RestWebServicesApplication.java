package com.narxoz.kz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(exclude = {SecurityAutoConfiguration.class})
public class RestWebServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestWebServicesApplication.class, args);
    }

}
