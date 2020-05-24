package com.udemy.spring.springselenium.page.visa;

import com.udemy.spring.springselenium.kelvin.annotation.Page;
import com.udemy.spring.springselenium.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.util.Objects;

@Page
public class VisaRegistrationPage extends Base {

    @FindBy(id ="first_4")
    private WebElement firstName;

    @FindBy(id ="last_4")
    private WebElement lastName;

    @FindBy(id = "input_46")
    private WebElement fromCountry;

    @FindBy(id = "input_47")
    private WebElement toCountry;

    @FindBy(id = "input_24_month")
    private WebElement month;

    @FindBy(id = "input_24_day")
    private WebElement day;

    @FindBy(id = "input_24_year")
    private WebElement year;

    @FindBy(id = "input_6")
    private WebElement email;

    @FindBy(id = "input_27_phone")
    private WebElement phone;

    @FindBy(id = "input_45")
    private WebElement comments;

    @FindBy(id = "submitBtn")
    private WebElement submit;

    @FindBy(id = "requestnumber")
    private WebElement requestNumber;

    public void goTo(){
        this.driver.get("https://vins-udemy.s3.amazonaws.com/sb/visa/udemy-visa.html");
    }

    public void setNames(String firstName, String lastName){
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
    }

    public void setCountryFromAndTo(String countryFrom, String countryTo){
        new Select(this.fromCountry).selectByValue(countryFrom);
        new Select(this.toCountry).selectByValue(countryTo);
    }

    public void setBirthDate(LocalDate localDate){
        new Select(this.year).selectByVisibleText(String.valueOf(localDate.getYear()));
        new Select(this.day).selectByVisibleText(String.valueOf(localDate.getDayOfMonth()));
        new Select(this.month).selectByValue(localDate.getMonth().toString());
    }

    public void setContactDetails(String email, String phone){
        this.email.sendKeys(email);
        this.phone.sendKeys(phone);
    }

    public void setComments(String comments){
        this.comments.sendKeys(Objects.toString(comments, ""));
    }

    public void submit(){
        this.submit.click();
    }

    public String getConfirmationNumber(){
        this.wait.until((d) -> this.requestNumber.isDisplayed());
        return this.requestNumber.getText();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.firstName.isDisplayed());
    }
}
