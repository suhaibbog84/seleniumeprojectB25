package SeleniumPractice.day1_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsLocators_ID {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        //identify and sane the element

        WebElement inputBox = driver.findElement(By.id("yschsp"));

        //enter text hello
        inputBox.sendKeys("Hello");

        WebElement searchBtn = driver.findElement(By.id("yschsp"));

        searchBtn.click();

        Thread.sleep(1500);

        driver.quit();



    }
}
