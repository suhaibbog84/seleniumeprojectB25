package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    /*
    creating a private constructor, so we are closing the
    access of this class from  outside this class
     */
    private Driver(){}
    /*
    we make Webdriver private, because we want to close access from outside the class.
    we make it static because we want to use it in a static method.
     */
    private static WebDriver driver;

    /*
    Create a reusable utility method which
    will return same driver instance when we call it
     */

    public static WebDriver getDriver(){
        if (driver == null){

        }

        return driver;
    }
}
