package com.example.licensesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LicensesserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LicensesserviceApplication.class, args);
    }

}

