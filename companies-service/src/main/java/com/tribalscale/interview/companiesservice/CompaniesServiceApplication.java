package com.tribalscale.interview.companiesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableEurekaClient
public class CompaniesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompaniesServiceApplication.class, args);
    }

}
