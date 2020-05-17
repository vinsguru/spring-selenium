package com.udemy.spring.springselenium.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakerConfig {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }

}
