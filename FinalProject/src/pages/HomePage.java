package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }
   
    String baseURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    
    
    By numberOfBestSellersBy = By.cssSelector("html body#index.index.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div.tab-content ul#blockbestsellers.product_list.grid.row.blockbestsellers.tab-pane.active li.ajax_block_product");  
    By numberOfMostPopularBy = By.cssSelector("html body#index.index.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div.tab-content ul#homefeatured.product_list.grid.row.homefeatured.tab-pane.active li.ajax_block_product");
    By signInButtonBy = By.xpath("//*[@id= header']/div[2]/div/div/nav/div[1]");
    By bestSellersButtonBy = By.xpath("//*[@id=home-page-tabs']/li[2]/a");
    By cartButtonBy = By.xpath("//*[@id= header']/div[3]/div/div/div[3]/div/a/b");
    By tShirtButtonBy = By.xpath("//*[@id=block_top_menu']/ul/li[3]/a");
    By tShirtProductNameBy = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a"); 
    By addToCartButtonBy = By.xpath("//*[@id='add_to_cart']/button/span");
    By contactUsButtonBy = By.id("contact-link");
    
    
    public HomePage basePage(){
        driver.get(baseURL);
        return this;
    }

    public HomePage clickOnbestSellersButton(){
        click(bestSellersButtonBy);
        return this;
    }
    public HomePage bestSellersProducts(int expected){
        int actualNumberOFProducts = countItems(numberOfBestSellersBy);
        assertIntegerEquals(expected, actualNumberOFProducts);
        return this;
    }

    public HomePage mostPopularProducts(int expected){
        int actualNumberOFProducts = countItems(numberOfMostPopularBy);
        assertIntegerEquals(expected, actualNumberOFProducts);
        return this;
    }

    public HomePage clickOnTshirtButton(){
       click(tShirtButtonBy);
       return this;
    }

    public HomePage clickOnProductName(){
        click(tShirtProductNameBy);
        return this;
    }
   
    public HomePage clickOnAddToCartIcon(){
        click(addToCartButtonBy);
        return this;
    }  
    
    public HomePage clickOnCartButton(){
        click(cartButtonBy);
        return this;
    }  
    
    public HomePage clickOnSignInButton(){
        click(signInButtonBy);
        return this;
    }     






















}
