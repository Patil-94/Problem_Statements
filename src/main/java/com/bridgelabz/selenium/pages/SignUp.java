package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp extends BaseClass {

    /*@Desc - Used FindBy Annotations for finding elements on web page
     * using various locators*/

    @FindBy(id = "join_now")
    WebElement join_now;

    @FindBy(name = "email-or-phone")
    WebElement userEmail;

    @FindBy(name = "password")
    WebElement userPwd;

    @FindBy(id = "join-form-submit")
    WebElement AgreeAndJoin;

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "join-form-submit")
    WebElement continueBtn;

    @FindBy(name = "countryCode")
    WebElement Country;


    @FindBy(id= "register-verification-phone-number")
    WebElement userPhone;

    @FindBy(linkText = "Submit")
    WebElement submit;

    /*Called Constructor*/
    public SignUp(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * 1.Using click method , signing up for account
     * 2.Entering credentials by using send key method
     * 3.Used click for submitting the credentials
     */

    public void  signupToApp() throws InterruptedException {

        join_now.click();

        userEmail.sendKeys("latika10@gmail.com");
        Thread.sleep(500);
        userPwd.sendKeys("latika@123");
        Thread.sleep(500);
        AgreeAndJoin.click();
        Thread.sleep(1000);

        firstName.sendKeys("Latika");
        Thread.sleep(500);
        lastName.sendKeys("Khaire");
        Thread.sleep(500);
        continueBtn.click();
        Thread.sleep(1000);

        Select select = new Select(Country);
        select.selectByVisibleText("India");
        WebElement India = select.getFirstSelectedOption();
        String selectedOption = India.getText();
        System.out.println("Selected option is : "+ selectedOption);

        userPhone.sendKeys("9146293698");

    }
}
