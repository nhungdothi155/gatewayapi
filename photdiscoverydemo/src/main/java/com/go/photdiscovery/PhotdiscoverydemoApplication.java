package com.go.photdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotdiscoverydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotdiscoverydemoApplication.class, args);
    }

}
