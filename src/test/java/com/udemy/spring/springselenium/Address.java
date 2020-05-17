package com.udemy.spring.springselenium;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Autowired
    private Faker faker;

    public String getStreet() {
        return this.faker.address().streetAddress();
    }
}
