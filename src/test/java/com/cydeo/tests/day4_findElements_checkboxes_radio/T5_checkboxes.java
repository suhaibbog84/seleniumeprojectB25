package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {

    public static void main(String[] args) throws InterruptedException {

        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");

        //We have to locate checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkbox1.is not Selected() = " + checkbox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        //4. Click checkbox #1 to select it.
        checkbox1.click();
        Thread.sleep(2000);

        //5. Click checkbox #2 to deselect it.
        checkbox2.click();
        Thread.sleep(2000);

        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        /*
         if(checkBox1.isSelected()){
           System.out.println("Verication passed");
       }else{
           System.out.println("verification fail");
       }
       //   7. Confirm checkbox #2 is NOT selected.

        if(!checkBox2.isSelected()){
           System.out.println("verification passed");
       }else{
           System.out.println("verification fail");
       }
         */

        Thread.sleep(3000);
        driver.quit();



    }
}