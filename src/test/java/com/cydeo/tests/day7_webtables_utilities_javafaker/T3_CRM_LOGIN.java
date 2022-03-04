package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {

    @Test
    public void crm_login_test(){
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver, "Helpdesk1@cybertekschool.com","UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");
    }

    @Test
    public void crm_login_test_3(){

        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //calling my utility method to login helpdesk2
        CRM_Utilities.crm_login(driver, "Helpdesk2@cybertekschool.com", "UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "(2) Portal");

    }



}
