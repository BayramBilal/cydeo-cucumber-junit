package com.cydeo.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class GoogleSearchPage {

    //create constructor
    // initialize the driver instance and this class' instance using PageFactory.initElements
    public GoogleSearchPage(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
    }

    //We can start locating web elements using @FindBy annotation
    @FindBy(name = "q")
    public WebElement searchBox;


}
