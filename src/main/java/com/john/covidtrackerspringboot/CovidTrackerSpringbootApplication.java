package com.john.covidtrackerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidTrackerSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CovidTrackerSpringbootApplication.class, args);
    }

}
