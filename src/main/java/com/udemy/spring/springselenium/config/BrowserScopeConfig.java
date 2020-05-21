package com.udemy.spring.springselenium.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BrowserScopeConfig {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor(){
        return new BrowserScopePostProcessor();
    }

}
