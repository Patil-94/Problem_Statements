package com.bridgelabz.selenium.objectrepository;

import com.bridgelabz.selenium.utility.ReadObjectRepo;
import org.openqa.selenium.By;

import java.io.IOException;

public class HomePage extends ReadObjectRepo  {

    public void logoutTo_Application() throws InterruptedException, IOException {

        Thread.sleep(3000);
        driver.findElement(By.xpath(ReadObjectRepo.getLocatorProperty(filePath,"ClickOnAccount.xpath"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(ReadObjectRepo.getLocatorProperty(filePath,"signOut.xpath"))).click();
        Thread.sleep(1000);
    }

}
