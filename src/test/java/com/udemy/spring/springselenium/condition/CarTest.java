package com.udemy.spring.springselenium.condition;

import com.udemy.spring.springselenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class CarTest extends SpringBaseTestNGTest {

    @Autowired
    private Car car;

    @Test
    public void carTest(){
        this.car.run();
    }

}
