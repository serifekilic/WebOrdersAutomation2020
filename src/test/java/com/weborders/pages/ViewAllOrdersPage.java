package com.weborders.pages;

import com.weborders.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewAllOrdersPage extends AbstractBasePage {

    @FindBy(linkText = "View all orders")
    private WebElement viewAllOrdersComponent;


    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/th")
    private List<WebElement> columnNames;







        public List<String>   getColumnNames (){

       BrowserUtilities.wait(20);
       return    BrowserUtilities.getTextFromWebElements(columnNames);
        }


}
