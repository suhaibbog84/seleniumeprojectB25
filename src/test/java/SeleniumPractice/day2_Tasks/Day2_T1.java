package SeleniumPractice.day2_Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_T1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement userNameInput = driver.findElement(By.name("USER_LOGIN"));
        userNameInput.sendKeys("incorrect@mail.com");

        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("IncorrectPassword");

        WebElement signInButton = driver.findElement(By.className("login-btn"));
        signInButton.click();






    }
}
