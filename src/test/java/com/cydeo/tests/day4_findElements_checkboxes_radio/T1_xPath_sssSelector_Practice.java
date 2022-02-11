package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xPath_sssSelector_Practice {

    public static void main(String[] args) {


        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link... locate homeLink using cssSe - class value
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a.nav-link"));

        //syntax #2 locating the home button using class value
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //locate home link using cssS using href
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));


        //b. “Forgot password” header
        //locate header using cssS: locate parent element and move down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("a[href='/']"));

        //locate header using xPath, and element text
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement header_ex3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box using xPath by name
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        //locate inputBox using xPath by contains method
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z0-9')]"));

        //e. “Retrieve password” button
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button/i[.='Retrieve password']"));

        //f. “Powered by Cydeo text
        //4. Verify all web elements are displayed.
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible

    }
}
