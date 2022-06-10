package com.automation.test;


import com.automation.pages.HomePage;
import com.automation.pages.LoginSignPage;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase{
  @Test
  public  void testSign() throws InterruptedException  {
      HomePage homePage = new HomePage(driver);
      LoginSignPage loginSignPage = new LoginSignPage(driver);
      homePage.navigateToSignUpPageFromHome();
      loginSignPage.createAcc(driver);

  }
}
