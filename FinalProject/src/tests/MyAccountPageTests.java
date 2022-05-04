package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import pages.HomePage;
import pages.MyAccountPage;
import pages.LoginPage;

public class MyAccountPageTests extends BaseTest {

    public MyAccountPage myAccountPage;  
    public HomePage homePage;
    public LoginPage signinPage;
     
    By emailBy = By.id("email");
    By passwordBy = By.id("passwd");
    By signInButtonBy = By.id("SubmitLogin");
    By signOutButtonBy = By.xpath("//*[@id= header']/div[2]/div/div/nav/div[1]");
   
    @Test
    public void verifySucessfullLogi(){
    
    homePage = new HomePage(driver);

    myAccountPage.basePage();
    myAccountPage.clickOnSignOutButton();
    myAccountPage.verifySucessfullLogin();
    }



@Test
    public void verifySucessfullLogout(){
    
    homePage = new HomePage(driver);

    myAccountPage.basePage();
    myAccountPage.clickOnSignOutButton();
    myAccountPage.verifySucessfullSignOut();
    }

} 