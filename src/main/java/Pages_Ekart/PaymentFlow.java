package Pages_Ekart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Base_Ekart.Base;
import utils_Ekart.GeneralUtilsSS;
import utils_Ekart.waitutility;

public class PaymentFlow extends Add_to_cart
{
	WebDriver driver;
	
	 public PaymentFlow(WebDriver driver)
	 {
		 super(driver);
		this.driver=driver;
	}


	
	
	 By name_of_card = By.xpath("//input[@name='name_on_card']");
	 By card_number = By.xpath("//input[@name='card_number']");
	 By card_cvv = By.xpath("//input[@name='cvc']");
	 By card_exp_month = By.xpath("//input[@name='expiry_month']");
	 By card_exp_year = By.xpath("//input[@name='expiry_year']");
	 By pay_and_confirm_order = By.xpath("//button[@id='submit']");
	 
	
	
	
	public void name_of_card()
	{
		 try 
		    {

		     // driver.findElement(name_of_card).sendKeys("Nitin Yadav");
		      //wait.until(ExpectedConditions.visibilityOfElementLocated(name_of_card)).sendKeys("Nitin Yadav");
		      waitutility.waitForElementClickable(driver, name_of_card, 15).sendKeys("Nitin Yadav");
		    }
		    catch(Exception e9)
		    {
		      System.out.println(e9.getMessage());
		    }
	}

	
	public void card_number()
	{
		 try
		    {

		      //driver.findElement(card_number).sendKeys("9874958265421020");
			 //wait.until(ExpectedConditions.visibilityOfElementLocated(card_number)).sendKeys("9874958265421020");
			 waitutility.waitForElementVisible(driver, card_number, 15).sendKeys("9874958265421020");
		      
		    }
		    catch(Exception e10) 
		    {
		      System.out.println(e10.getMessage());
		    }
	}
	
	public void card_cvv()
	{
		try 
	    {

	      //driver.findElement(card_cvv).sendKeys("987");
	      //wait.until(ExpectedConditions.visibilityOfElementLocated(card_cvv)).sendKeys("987");
			waitutility.waitForElementVisible(driver, card_cvv, 15).sendKeys("987");
	    }
	    catch(Exception e11) 
	    {
	      System.out.println(e11.getMessage());
	    }
	}
	
	public void card_exp_month()
	{
		try 
	    {

	      //driver.findElement(card_exp_month).sendKeys("11");
	      //wait.until(ExpectedConditions.visibilityOfElementLocated(card_exp_month)).sendKeys("11");
			waitutility.waitForElementVisible(driver, card_exp_month, 15).sendKeys("11");
	    }
	    catch(Exception e12) 
	    {
	      System.out.println(e12.getMessage());
	    }
	 
	}
	
	public void card_exp_year()
	{
		try 
	    {

	      //driver.findElement(card_exp_year).sendKeys("2026");
	      //wait.until(ExpectedConditions.visibilityOfElementLocated(card_exp_year)).sendKeys("2026");
			waitutility.waitForElementVisible(driver, card_exp_year, 15).sendKeys("2026");
	    }
	    catch(Exception e13) 
	    {
	      System.out.println(e13.getMessage());
	    }
	}
	
	
	public void pay_and_confirm_order()
	{
		 try 
		    {

		     // driver.findElement(pay_and_confirm_order).click();
		      //wait.until(ExpectedConditions.visibilityOfElementLocated(pay_and_confirm_order)).click();
		      waitutility.waitForElementVisible(driver, pay_and_confirm_order, 15).click();
		   
		     
		      
		    }
		    catch(Exception e14) 
		    {
		      System.out.println(e14.getMessage());
		     
		    }
		
	}
	
	
	 
	

}
