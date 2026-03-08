package Pages_Ekart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Base_Ekart.Base;

import utils_Ekart.waitutility;


public class Add_to_cart extends Base
{
 
    WebDriver driver;



public Add_to_cart(WebDriver driver)
{
	   
		this.driver=driver;
		
}


   
   By elementToBeClickable = By.xpath("//div[@class='productinfo text-center']//a[@data-product-id='5']");
   By continue_shopping = By.xpath("//button[text()='Continue Shopping']");
   By add_to_cart = By.xpath("//a[text()=' Cart']");
   By Proceed_to_checkout = By.xpath("//a[text()='Proceed To Checkout']");
   By Placed_order = By.xpath("//a[text()='Place Order']");
   
  
  
   
   
  
   public void elementToBeClickable()
   {
	   try 
	    {

	      
	      waitutility.waitForElementVisible(driver, elementToBeClickable, 15).click();
	      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementToBeClickable);
	    }
	    catch(Exception e4)
	    {
	      System.out.println(e4.getMessage());
	    }
   }
      
   public void continue_shopping()
   {
	   try 
	   {
		  // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", continue_shopping);
		  waitutility.waitForElementVisible(driver, continue_shopping, 15).click();
		  //((JavascriptExecutor) driver).executeScript("arguments[0].click();", continue_shopping);
	   }
	   catch(Exception e5) 
	   {
	     System.out.println(e5.getMessage());
	   }
   }
     
   public void add_to_cart()
   {
	   try 
	   {

	     //driver.findElement(add_to_cart).click();
	     //wait.until(ExpectedConditions.visibilityOfElementLocated(add_to_cart)).click();
	     waitutility.waitForElementVisible(driver, add_to_cart, 10).click();
	   }
	   catch(Exception e6) 
	   {
	     System.out.println(e6.getMessage());
	   }
   }
   
   public void Proceed_to_checkout()
   {
	   try 
	   {

	     //driver.findElement(Proceed_to_checkout).click();
		  // wait.until(ExpectedConditions.visibilityOfElementLocated(Proceed_to_checkout)).click();
		   waitutility.waitForElementVisible(driver, Proceed_to_checkout, 15).click();
	   }
	   catch(Exception e7) 
	   {
	     System.out.println(e7.getMessage());
	   }
   }
   
   public void Placed_order()
   {
	   try
	   {

	     //driver.findElement(Placed_order).click();
		  // wait.until(ExpectedConditions.visibilityOfElementLocated(Placed_order)).click();
		   waitutility.waitForElementVisible(driver, Placed_order, 15).click();
	   }
	   catch(Exception e8) 
	   {
	     System.out.println(e8.getMessage());
	   }
	    
   
   }
}
