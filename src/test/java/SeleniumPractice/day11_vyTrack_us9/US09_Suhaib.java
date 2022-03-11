package SeleniumPractice.day11_vyTrack_us9;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US09_Suhaib {

    @Test
    public void calendarWrongInteger(){

        Driver.getDriver().get("https://qa1.vytrack.com/calendar/event");

        WebElement activities = Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']//i[@class='fa-puzzle-piece menu-icon']"));
        activities.click();




    }

}
