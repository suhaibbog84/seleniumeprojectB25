package SeleniumPractice.day08_TC01_Login_Suhaib;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC01_LoginTestAutomation_Suhaib {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://login2.nextbasecrm.com/");
    }

    @Test
    public void LoginPageTitle(){

        String expectedTitle = "Authorization";
        String actualTitle = driver.getTitle();

        driver.quit();
    }

    @Test
    public void homePageAfterLogin(){

        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("marketing66@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();

        String expectedHomePageTitle = "Portal";
        String actualHomePageTitle = driver.getTitle();

        Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);

        driver.quit();
    }

    @Test
    public void incorrectUsernameOrPassword(){

        WebElement userName = driver.findElement(By.xpath("//input[@class='login-inp']"));
        userName.sendKeys("marketing666@cydeo.com");
        //incorrect username so I can create a negative testing

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();

        String expectedIncorrectLoginMessage = "Incorrect username or password";

        String actualIncorrectLoginMessage = driver.findElement(By.xpath("//div[@class='errortext']")).getText();

        //System.out.println("actualIncorrectLoginMessage = " + actualIncorrectLoginMessage);

        Assert.assertEquals(actualIncorrectLoginMessage, expectedIncorrectLoginMessage);
    }


}
