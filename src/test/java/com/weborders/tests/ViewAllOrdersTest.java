package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.pages.ViewAllOrdersPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewAllOrdersTest extends AbstractBaseTest {




    @Test
    public void verifyColumnNames(){
        ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        List<String> expectedList=new ArrayList<>(Arrays.asList(" ","Name","Product","#","Date","Street", "City","State","Zip","Card","Card Number","Exp"," "));


       Assert.assertEquals( viewAllOrdersPage.getColumnNames(),expectedList );
    }

}
