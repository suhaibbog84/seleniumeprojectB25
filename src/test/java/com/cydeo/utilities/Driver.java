package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
    creating a private constructor, so we are closing the
    access of this class from  outside this class
     */
    private Driver() {

    }
    /*
    we make Webdriver private, because we want to close access from outside the class.
    we make it static because we want to use it in a static method.
     */
        private static WebDriver driver;

    /*
    Create a reusable utility method which
    will return same driver instance when we call it
     */

    public static WebDriver getDriver() {
        if (driver == null) {
            /*
            we read our browser type from configuration.properties
            This way, we can control which browser is opened from outside our code,
            from configurations.properties
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            Depending on the browser type that will be
            returned from configuration properties file.
            switch statement will determine the case and open browser
             */

            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    //driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }

        return driver;
    }

    //this method will make sure our driver value is null after closing
    //driver method

    public static void closeDriver(){

        if (driver != null){
            driver.quit(); //this will terminate the existing session. value will not be even null
            driver = null;
        }

    }

}
