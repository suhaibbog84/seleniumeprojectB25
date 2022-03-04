package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
    creating a private constructor, so we are closing the
    access of this class from  outside this class
     */
    private Driver(){}
    /*
    we make Webdriver private, because we want to close access from outside the class.
    we make it static because we want to use it in a static method.
     */
    private static WebDriver driver;

    /*
    Create a reusable utility method which
    will return same driver instance when we call it
     */

    public static WebDriver getDriver(){
        if (driver == null){
            /*
            we read our browser type from configuration.properties
            This way, we can control which browser is opened from outside our code,
            from configurations.properties
             */
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }

        return driver;
    }
}
