package com.ca.modulerest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ca.modulecalc"})
public class ModuleRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ModuleRestApplication.class, args);
    }
}
