package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.listener.CustomListener;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.pages.SignUp;
import com.bridgelabz.selenium.utility.HomePage;
import com.bridgelabz.selenium.utility.PageLogout;
import com.bridgelabz.selenium.utility.UploadFile;
import org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(CustomListener.class)
public class TestOfLinkedin extends BaseClass {
    /** test for Login Page
     and also check actual result and expected result */
    @Test
    public void loginTo_Application_with_valid_credentials() throws InterruptedException
    {

        //create object of Login Class
        Login login=new Login(driver);
        login.loginTo_Application();

        //validation
        String actualUrl= driver.getCurrentUrl();
        String expected="https://www.linkedin.com/feed/?trk=guest_homepage-basic_nav-header-signin";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expected);
    }
    @Test
    public void  signup_ToApplication() throws InterruptedException {
        SignUp sign =new SignUp(driver);
        sign.signupToApp();
    }
    @Test
     public void homePage_Application() throws InterruptedException{
        Login login=new Login(driver);
        login.loginTo_Application();
        HomePage homePage =new HomePage(driver);
        homePage.setTo_Home();

        //validation
        String actualUrl= driver.getCurrentUrl();
        String expected="https://www.linkedin.com/feed/";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expected);
     }

    @Test
    public void logoutPage() throws InterruptedException, IOException {

        //create object of Login Class
        Login login=new Login(driver);
        login.loginTo_Application();

        PageLogout logout =new PageLogout(driver);
        logout.logoutTO_Page();

        //validation
        String actualUrl= driver.getCurrentUrl();
        String expected="https://www.linkedin.com/home";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expected);
    }

    @Test
    public void postPage() throws InterruptedException, IOException {

        //create object of Login Class
        Login login = new Login(driver);
        login.loginTo_Application();

        UploadFile post = new UploadFile(driver);
        post.post_with_valid();
    }
}



