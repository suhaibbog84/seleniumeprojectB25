package SeleniumPractice.day7_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "myData")
    public Object[][] provideData(){

        return new Object[][]{
                {"Adam"} ,
                {"Zona"} ,
                {"Kimo"} ,
                {"Luka"} ,
        };
    }

    @Test(dataProvider = "myData")
    public void testMultipleData(String name){

        System.out.println(name);

    }

    @DataProvider(name = "TwoSetOfData")
    public Object[][] provide2Data(){

        return new Object[][]{
                {"Adam", 20},
                {"Suhaib", 22},
                {"Layan", 25}
        };

    }

    @Test(dataProvider = "TwoSetOfData")
    public void testNameAndBatch(String name, int batchNumber){

        System.out.println(name + " is from batch " + batchNumber);

    }

}
