package com.bridgelabz.selenium.utility;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFile extends BaseClass {

    @FindBy(xpath = "//div[@class = 'display-flex align-items-center mt2 mr4 ml4']")
    WebElement post;
    @FindBy(xpath = "//li-icon[@type='image-icon']//*[local-name()='svg']")
    WebElement photo;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]/span[1]")
    WebElement done;
    @FindBy(className = "share-box_actions")
    WebElement share;
    @FindBy(xpath = "//img[@id='ember35']")
    WebElement profile_dropdown;
    @FindBy(xpath = "//a[normalize-space()='Sign Out']")
    WebElement Sign_out;

    public UploadFile(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void post_with_valid() throws InterruptedException
    {
        Thread.sleep(3000);
        post.click();
        Thread.sleep(5000);
        photo.click();
        Thread.sleep(1000);
        autoIT();
        Thread.sleep(3000);

    }

    private void autoIT() {
        try {
            Runtime.getRuntime().exec("C:\\Users\\sachin\\Documents\\AutoItScript\\Auto2.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
