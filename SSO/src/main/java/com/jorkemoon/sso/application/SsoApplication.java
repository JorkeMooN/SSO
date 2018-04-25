package com.jorkemoon.sso.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

//@RestController

@SpringBootApplication
@ComponentScan(basePackages = {"com.jorkemoon.sso"})
public class SsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoApplication.class, args);
    }

    /*@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
    String index() {
        return "Hello Spring Boot!";
    }*/

}
