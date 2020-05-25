package com.udemy.spring.springselenium.bdd;

import com.udemy.spring.springselenium.kelvin.annotation.LazyAutowired;
import com.udemy.spring.springselenium.kelvin.service.ScreenshotService;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class CucumberHooks {

    @LazyAutowired
    private ScreenshotService screenshotService;

    @AfterStep
    public void afterStep(Scenario scenario){
        if(scenario.isFailed()){
            scenario.embed(this.screenshotService.getScreenshot(), "image/png", scenario.getName());
        }
    }

}
