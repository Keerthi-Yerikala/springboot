package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaApplication.class, args);
	}
	 @Bean
	    public ServletWebServerFactory servletWebServerFactory() {
	        return new TomcatServletWebServerFactory(); // Manually configure Tomcat
	    }

	    @GetMapping("/hello")
	    public String hello() {
	        return "Hello, Tomcat is Running";
	    }

}