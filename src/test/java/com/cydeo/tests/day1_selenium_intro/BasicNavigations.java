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

        //this line will maximize the browser size
        driver.manage().window().maximize();

        //this is mac functionality
        //driver.manage().window().fullscreen();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get current title
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //get Tesla URL
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

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

        //get current Google URL
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //this will close the currently opened window
        driver.close();

        //this will close all of the opened windows
        //driver.quit();

    }
}
