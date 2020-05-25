package com.udemy.spring.springselenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        strict = true,
        features = "classpath:features",
        glue = "com.udemy.spring.springselenium.bdd",
        tags = { "@visa" },
        plugin = {
                "pretty",
                "html:/home/vins/Documents/udemy/temp/"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
