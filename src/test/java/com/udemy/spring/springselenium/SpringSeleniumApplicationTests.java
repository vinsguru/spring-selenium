package com.udemy.spring.springselenium;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSeleniumApplicationTests {

	@Autowired
	private User user;

	@Value("${TEST_URL:https://www.google.com}")
	private String path;

	@Value("${fruits}")
	private List<String> fruits;

	@Value("${myusername}")
	private String username;

	@Test
	void contextLoads() {
		this.user.printDetails();
	}

}
