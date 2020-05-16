package com.udemy.spring.springselenium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {

    @Value("${amount:500}")
    private int amount;

    public int getAmount() {
        return amount;
    }
}
