package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver){
       super(driver);
    }

By signInButtonBy = By.xpath("//*[@id= header']/div[2]/div/div/nav/div[1]"); 
By signOutButtonBy = By.xpath("//*[@id= header']/div[2]/div/div/nav/div[1]");

    public MyAccountPage clickOnSignOutButton(){
        click(signOutButtonBy);
        return this;
    }

     public MyAccountPage verifySucessfullLogin(){
       assertElementVisible(signInButtonBy);
       return this;
    }

    public MyAccountPage verifySucessfullSignOut(){
        assertElementVisible(signInButtonBy);
        return this;
     }
 


    public void basePage() {
    }
}



   
