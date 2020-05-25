package com.udemy.spring.springselenium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class SpringSeleniumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSeleniumApplication.class, args);
	}

}
