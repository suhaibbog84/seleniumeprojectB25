package SeleniumPractice.day4_TestNG;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Facebook {

     WebDriver driver;

     @BeforeMethod

    public void setUpMethod(){

        //TC #1: Facebook title verification
        //1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
    }
    @Test

    public void titleVerification(){

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void incorrectLogIn(){

        WebElement userNameBox = driver.findElement(By.cssSelector("input#email"));
        userNameBox.sendKeys("incorrect");

        WebElement passwordBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordBox.sendKeys("incorrect");

        WebElement loginBtn = driver.findElement(By.xpath("//button"));
        loginBtn.click();

        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    public void fbHeaderVerify(){

         String expectedHeaderText = "Connect with friends and the world around you on Facebook.";
         String actualHeaderText = driver.findElement(By.cssSelector("h2._8eso")).getText();

         Assert.assertEquals(actualHeaderText, expectedHeaderText);
    }

    public void registrationLinkVerification(){

         String expectedLinkPageValue = "registration_form";
         WebElement createPageLink = driver.findElement(By.cssSelector("a._8esh"));
         String actualPageLinkValue = createPageLink.getAttribute("href");

         Assert.assertTrue(actualPageLinkValue.contains(expectedLinkPageValue));

    }

}
/*
TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook – log in or sign up”
TC #2: Facebook incorrect login title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook”
TC #3: Facebook header verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify header text is as expected:
Expected: “Facebook helps you connect and share with the people in your life.”
TC #4: Facebook header verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify “Create a page” link href value contains text:
Expected: “registration_form”
 */