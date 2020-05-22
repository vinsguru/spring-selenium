package com.udemy.spring.springselenium.flights;

import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = "app.locale=en")
public class EnTest extends FlightTest{
}
