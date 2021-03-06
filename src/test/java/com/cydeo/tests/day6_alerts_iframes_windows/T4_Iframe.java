package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        //1. Create a new class called: T4_Iframes
        driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe ");
    }

    //2. Create new test and make setups

    @Test
    public void iframe_test() throws InterruptedException {

        //we need to switch driver focus to iframe
        //option #1 switching to iframe using id attribute value
        //driver.switchTo().frame("mce_0_ifr");

        //option2: passing index # of iframe
        //driver.switchTo().frame(0);

        //option #3: locate a webElement and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //locate the p tage
        WebElement yourContentHereText = driver.findElement(By.xpath("//p"));

        //4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(yourContentHereText.isDisplayed());

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        //To be able to verify the header we must switch back from the
        //"main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerText.isDisplayed());


        driver.quit();


    }

}
/*
TC #4: Iframe practice
 */
