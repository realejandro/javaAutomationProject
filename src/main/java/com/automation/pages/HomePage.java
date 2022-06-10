package com.automation.pages;

import com.automation.test.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  extends TestBase {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@href=\"/login\"]")
    private WebElement signLoginPage;

    public void navigateToSignUpPageFromHome()
    {
        signLoginPage.click();
    }
}
