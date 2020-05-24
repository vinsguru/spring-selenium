package com.udemy.spring.springselenium;

import com.udemy.spring.springselenium.entity.User;
import com.udemy.spring.springselenium.page.visa.VisaRegistrationPage;
import com.udemy.spring.springselenium.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

public class UserVisaTest extends SpringBaseTestNGTest {

    @Autowired
    private VisaRegistrationPage registrationPage;

    @Autowired
    private UserRepository repository;

    @Test
    public void visaTest(){
        List<User> users = this.repository.findByDobBetween(Date.valueOf("1995-01-01"), Date.valueOf("1999-01-01"))
                .stream()
                .limit(3)
                .collect(Collectors.toList());
        for(User u : users){
            this.registrationPage.goTo();
            this.registrationPage.setNames(u.getFirstName(), u.getLastName());
            this.registrationPage.setCountryFromAndTo(u.getFromCountry(), u.getToCountry());
            this.registrationPage.setBirthDate(u.getDob().toLocalDate());
            this.registrationPage.setContactDetails(u.getEmail(), u.getPhone());
            this.registrationPage.setComments(u.getComments());
            this.registrationPage.submit();

            System.out.println(
                    this.registrationPage.getConfirmationNumber()
            );
        }

    }


}
