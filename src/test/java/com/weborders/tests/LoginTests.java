package com.weborders.tests;
import com.weborders.pages.LoginPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

//assert i static yapinca onune kymamiza gerek yok
public class LoginTests extends AbstractBaseTest {
    @Test
    public void login(){
        extentTest = extentReports.createTest("Verify page logo");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        assertEquals(loginPage.getPageLogoText(), "Web Order");
        extentTest.pass("Logo verified!");
    }
}