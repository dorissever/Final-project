package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
       super(driver);
    }

    By emailBy = By.id("email");
    By passwordBy = By.id("passwd");
    
    By errorMessageBy = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");
    By signInButtonBy = By.xpath("//*[@id= header']/div[2]/div/div/nav/div[1]"); 
    By signOutButtonBy = By.xpath("//*[@id= header']/div[2]/div/div/nav/div[1]");
    By createAnAccountBy = By.xpath("//*[@id= email_create']");
    By emailAddressFieldBy = By.xpath("//*[@id= email_create']");
    By createAnAccountButtonBy = By.xpath("//*[@id= Submit create/span']");
    By firstNameBy = By.xpath("//*[@id= customer_firstname']");
    By lastNameBy = By.xpath("//*[@id= customer_lastname']");
    By myselectedElement = By.xpath("//*[@id= ']");
    
    By addressBy = By.xpath("//*[@id= address1']");
    By cityBy = By.xpath("//*[@id= city']");
    By postCodeBy = By.xpath("//*[@id= postcode']");
    By mobPhoneBy = By.xpath("//*[@id= phone_mobile']");
    By registerButtonBy =By.xpath("//*[@id= submitAccount/span']"); 
    
    String state = "Alaska";
    By stateButtonBy = By.xpath("//*[@id= city']");
    
        public LoginPage createAnAccount(String emailAddress, String lastName){
           writeText(emailAddressFieldBy, emailAddress);
           return this;
        }
    
        public LoginPage createFirstAndLastName(String firstName, String lastName){
            writeText(firstNameBy, firstName);
            writeText(lastNameBy, lastName);
            return this;
        }
    
        public LoginPage createEmailAndPassword(String email, String password){
            writeText(emailBy, email);
            writeText(passwordBy, password);
            return this;
        }
    
        public LoginPage createDwelling(String address, String city){
            writeText(addressBy, address);
            writeText(cityBy, city);
            return this;
        } 
    
        public LoginPage roleDropdown(){
            WebElement mySelectedElement = driver.findElement(By.xpath("//*[@id= id_state']"));       
            new Select (mySelectedElement);
    
            return this;
        }
    
        public LoginPage createPostCodeAndMobPhone(String postCode , String mobPhone){
            writeText(postCodeBy, postCode);
            writeText(mobPhoneBy, mobPhone);
            return this;
        } 
    
    
        public LoginPage login (String email, String password){
             writeText(emailBy, email);
             writeText(passwordBy, password);
             click(signInButtonBy);
             return this;
    }

         public LoginPage verifyUnsucessfullLogin(String expectedText){
            String actualTitle = readText(errorMessageBy);
            assertTextEquals(expectedText, actualTitle);
            return this;
    }
        
}


