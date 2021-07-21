package com.bridgelabz.selenium.listener;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.LogClass;
import com.bridgelabz.selenium.utility.ScreenshotClass;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class CustomListener extends BaseClass implements ITestListener
{
    ScreenshotClass screenshot =new ScreenshotClass();
    public void onTestFailure(ITestResult result)
    {
        System.out.println("Failed Test");
        screenshot.failed();
        LogClass.info(result.getMethod().getMethodName()+":take failed screenshot ");
        Allure.addAttachment(result.getName(),new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }

    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Success Test");
        screenshot.success();
        LogClass.info(result.getMethod().getMethodName()+":take success screenshot");
        Allure.addAttachment(result.getName(),new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));

    }
}
