package com.bridgelabz.selenium.objectrepository;

import com.bridgelabz.selenium.utility.ReadObjectRepo;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginPage extends ReadObjectRepo {

    public void loginTo_Application() throws InterruptedException, IOException {

        Thread.sleep(1000);
        driver.findElement(By.id(ReadObjectRepo.getLocatorProperty(filePath,"userEmailID.id"))).sendKeys("ankitakhairnar10@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id(ReadObjectRepo.getLocatorProperty(filePath,"userPassword.id"))).sendKeys("anki@123");
        Thread.sleep(1000);
        driver.findElement(By.xpath(ReadObjectRepo.getLocatorProperty(filePath,"loginBtn.xpath"))).click();
        Thread.sleep(1000);

    }

}
