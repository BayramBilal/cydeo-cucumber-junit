package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage () throws StaleElementReferenceException {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id ="searchInput")
    public WebElement searchBox;

    @FindBy(className= "sprite svg-search-icon")
    public WebElement searchButton;

    @FindBy(id = "firstHeading")
    public WebElement mainHeader;


}
