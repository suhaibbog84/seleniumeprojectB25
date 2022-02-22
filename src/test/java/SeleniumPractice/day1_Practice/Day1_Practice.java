package SeleniumPractice.day1_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Practice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.Google.com");

        //Thread.sleep(1500);

        //driver.navigate().back();

        //Thread.sleep(1500);

        //driver.navigate().forward();

        //Thread.sleep(1500);

        //driver.navigate().refresh();

        Thread.sleep(1500);

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle " + pageTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);



        //driver.close(); //to close the current open driver after open it

        driver.quit(); //to close the entire browser


    }
}
