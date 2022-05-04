package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTests extends BaseTest{

    public LoginPage signinPage;
    public HomePage homePage;

    String email = "dorissever@gmail.com";
    String password = "Dokil12";
    int expected = 7;

 
@Test
    public void verifyHomePageDisplayed(){
        
    homePage = new HomePage(driver);

    homePage.basePage();
    }

 @Test
    public void countMostPopular(){
        
    homePage = new HomePage(driver);
    
    homePage.basePage();
    homePage.mostPopularProducts(expected);
    }
    
@Test
    public void countBestSellers(){
            
    homePage = new HomePage(driver);
        
    homePage.basePage();
    homePage.bestSellersProducts(expected);
    } 
    
    
        










}