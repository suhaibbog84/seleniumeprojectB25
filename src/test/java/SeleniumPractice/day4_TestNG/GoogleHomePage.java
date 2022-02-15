package SeleniumPractice.day4_TestNG;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleHomePage {

    @Test
    public void testHomepage() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://google.com");
        Thread.sleep(2000);

        //assert the title is Google

        Assert.assertEquals(driver.getTitle(), "Google");
        Thread.sleep(2000);

        driver.close();

    }



}
