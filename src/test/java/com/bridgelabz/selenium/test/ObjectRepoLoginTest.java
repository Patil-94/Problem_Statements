package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.objectrepository.HomePage;
import com.bridgelabz.selenium.objectrepository.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ObjectRepoLoginTest extends BaseClass {

    @Test
    public void login_Application() throws IOException, InterruptedException {
        LoginPage loginObject = new LoginPage();
        loginObject.loginTo_Application();


        String expectedUrl = driver.getCurrentUrl();
        System.out.println(expectedUrl);
        String actualUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(actualUrl, expectedUrl);

    }

    @Test
    public void logout_Application() throws IOException, InterruptedException {
        LoginPage loginObject = new LoginPage();
        loginObject.loginTo_Application();

        HomePage logout = new HomePage();
        logout.logoutTo_Application();

        String expectedUrl = driver.getCurrentUrl();
        System.out.println(expectedUrl);
        String actualUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

}

