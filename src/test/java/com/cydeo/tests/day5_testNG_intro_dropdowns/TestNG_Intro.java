package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @Test (priority = 1)
    public void test1(){
        System.out.println("Test 1 is running...");

        //Assert Equals: we compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);

    }

    @Test (priority = 2)
    public void Test2(){
        System.out.println("Test 2 is running...");

        //AssertTrue
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));

    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");
    }

    @BeforeClass
    public void setUpClass(){
        System.out.println("------> BeforeClass is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running");
    }


}
