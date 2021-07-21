package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.LogClass;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Description("Created Login class and ")

public class Login extends BaseClass {
    /** Description - Using FindBy for locating elements */

    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement userSignIn;

    @FindBy(id = "username")
    WebElement userEmailID;

    @FindBy(id = "password")
    WebElement userPassword;

    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    WebElement loginBtn;


    /** create a parameterized constructor.
     * initialization
     */
    public Login(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    /** We have used send keys method for entering credentials
     *  Using click method  to Login in page
     */

    public void loginTo_Application() throws InterruptedException {
        Thread.sleep(500);
        userSignIn.click();
        Thread.sleep(500);
        LogClass.info("Sending email using sendKeys");
        userEmailID.sendKeys("ankitakhairnar10@gmail.com");
        Thread.sleep(500);
        LogClass.info("sending password using sendKeys");
        userPassword.sendKeys("anki@123");
        Thread.sleep(500);
        LogClass.info("clicking on signIn for logging into application");
        loginBtn.click();
        Thread.sleep(2000);

    }

}
