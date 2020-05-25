package com.udemy.spring.springselenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.udemy.spring.springselenium.bdd",
        plugin = {
                "pretty",
                "html:/home/vins/Documents/udemy/temp/"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
