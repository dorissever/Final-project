package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    public LoginPage loginPage;
    public HomePage homePage;
   

    String email = "dorissever@gmail.com";
    String password = "Dokil12";
    String expectedTitle = "MY ACCOUNT";
    String expectedLogoutTittle = "Accepted usernames are:";
    String errorMessageMissingPassword = "There is 1 error. Password is required";
    String errorMessageMissingEmail = "There is 1 error. An email address required.";

    @Test
    public void verifyLoginWithoutEmail(){
         
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
       
        homePage.basePage();
        loginPage.login("", password);
        loginPage.verifyUnsucessfullLogin(errorMessageMissingEmail);
    }

    @Test
    public void verifyLoginWithoutPassword(){
        
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        homePage.basePage();
        loginPage.login(email,"");
        loginPage.verifyUnsucessfullLogin(errorMessageMissingPassword);
    }

}

