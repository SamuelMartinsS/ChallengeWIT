package com.ca.calculatorappchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ca"})
public class CalculatorAppChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorAppChallengeApplication.class, args);
    }

}
