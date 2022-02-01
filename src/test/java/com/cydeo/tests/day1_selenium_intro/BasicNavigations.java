package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {


        //1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of the selenium Webdriver
        //this will open an empty browser
        WebDriver driver = new ChromeDriver();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get current title
        String currentTitle = driver.getTitle();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to refresh
        driver.navigate().refresh();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate().to()
        driver.navigate().to("https://www.google.com");

        //get the current title after getting the Google page
        currentTitle = driver.getTitle();

        //get the title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

        //get current URL
        String currentURL = driver.getCurrentUrl();



    }
}
