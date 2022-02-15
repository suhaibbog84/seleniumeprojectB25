package SeleniumPractice.day4_TestNG;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestNG {

    @BeforeClass
    public void init(){
        System.out.println("@BeforeClass Run once before all tests");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("@BeforeMethod Run once before each test");
    }

    @Test
    public void testOnePlusFive(){
        //1 + 5 = 6
        assertEquals(1+5, 6);
        System.out.println("@Test Test 1 is running");
    }

    @Test
    public void test10Minus4(){
        assertEquals(10-4, 6);
        System.out.println("@Test Test 2 is running");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("@AfterMethod Run once after test");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("@AfterClass Run once after all tests");
    }

}
