package com.bridgelabz.selenium.base;
import com.bridgelabz.selenium.utility.EmailReport;
import com.bridgelabz.selenium.utility.LogClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class BaseClass  {
    public static WebDriver driver;
    //execute before test
    @BeforeTest
    @Description("Used setUp method for setting the browser")

    public void setup() throws InterruptedException
    {

        try {
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Internet is connected");
        } catch (MalformedURLException e) {
            System.out.println("Internet is not connected");
        } catch (IOException e) {
            System.out.println("Internet is not connected");
        }

        //Handling browser level show notification popup window
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");

        LogClass.info("Test is starting");
        //launch chromedriver
        WebDriverManager.chromedriver().setup();

        LogClass.info("chrome is starting");
        driver=new ChromeDriver(chromeOptions);

        LogClass.info("navigating to url : https://www.linkedin.com/");
        driver.get("https://www.linkedin.com/");

        /*  launch facebook url and maximize windows */
        driver.manage().window().maximize();
        LogClass.info("Launched the web application.");
        Thread.sleep(500);
    }

    //execute after test

   @AfterTest
   @Description("used tearDown method for closing the browser")


     //teardown method for close the browser
    public void tearDown()
    {
        EmailReport.sendMail();
        LogClass.info("Browser is closed");
        driver.close();
        LogClass.info("Test is ended");
        Reporter.log("====Application Launched====");
    }
}
