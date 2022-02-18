package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Window_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        //1. Create a new class called: T5_WindowsPractice
        driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }

    //2. Create new test and make set ups
    @Test
    public void multiple_window_test(){

        //storing the main pages window handle is a good practice
        // for future practice re-usable purposes
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        //5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));

        clickHereLink.click();

        //6. Switch to new Window.


        //7. Assert: Title is “New Window”

    }


}
/*
TC #5: Window Handle practice


 */
