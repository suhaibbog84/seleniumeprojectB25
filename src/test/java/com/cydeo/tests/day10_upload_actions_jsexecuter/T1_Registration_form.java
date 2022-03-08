package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Registration_form {

    @Test
    public void registration_form_test(){

        //TC#1: Registration form confirmation
        //Note: Use JavaFaker OR read from configuration.properties file when possible.
        //1. Open browser
        // 2. Go to website: https://practice.cydeo.com/registration_form

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //Create a Java Faker
        Faker faker = new Faker();

        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());


        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //or String user = faker.bothify("helpdesk###")
        //userName.sendKeys(user);
        userName.sendKeys(faker.name().username().replace(".", ""));

        //6. Enter email address
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        //or email.sendKeys( userName + "@gmail.com
        email.sendKeys(faker.internet().emailAddress());

        // 7. Enter password
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());

        // 8. Enter phone number
        WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.phoneNumber().cellPhone().replace(".", "-"));

        // 9. Select a gender from radio buttons
//10. Enter date of birth
//11. Select Department/Office
//12. Select Job Title
//13. Select programming language from checkboxes
//14. Click to sign up button
//15. Verify success message “You’ve successfully completed registration.” is
//displayed.
//
//
//Note:
//1. Use new Driver utility class and method
//2. User JavaFaker when possible
//3. User ConfigurationReader when it makes sense


    }

}
