package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSchedulerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedulerDemoApplication.class, args);
		System.out.println("test1");
	}

}