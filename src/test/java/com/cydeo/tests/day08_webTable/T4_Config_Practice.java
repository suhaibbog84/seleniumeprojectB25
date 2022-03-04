package com.cydeo.tests.day08_webTable;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

    public WebDriver driver;

    @Test
    public void setupMethod(){

        //TC #4: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com/

        String browserType = ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browserType);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }

    @Test
    public void google_search_teat(){
        //3- Write “apple” in search box
        String browserType = ConfigurationReader.getProperty("browser"); // this is the method we created in conf.reader class
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com ");
    }
    /*
    @Test
    public void google_search_test(){
        //3- Write “apple” in search box
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        // googleSearchBox.sendKeys("apple" + Keys.ENTER); // apple is passed here as a hard code
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);
        // this way is better so that apple now is not hardcoded

        //4- Verify title:
        //Expected: apple - Google Search
        // String expectedTitle = "apple" + " - Google Search"; we can change the expected title so it will match whatever we pass
        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Google Search";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

     */


    //Use configuration.properties for the following:
    //1. The browser type
    //2. The URL
    //3. The search keyword
    //4. Make title verification dynamic. If search value changes, title
    //assertion should not fail.

}
