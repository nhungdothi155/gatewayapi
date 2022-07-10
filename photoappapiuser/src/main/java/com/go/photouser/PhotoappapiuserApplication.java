package com.go.photouser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoappapiuserApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoappapiuserApplication.class, args);
    }

}
