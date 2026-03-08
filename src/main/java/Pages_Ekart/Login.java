package Pages_Ekart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils_Ekart.waitutility;
import utils_Ekart.waitutility;
import utils_Ekart.GeneralUtilsSS;

public class Login 
{
	 WebDriver driver;

    // Locators
     By emailid = By.xpath("//input[@data-qa='login-email']");
     By emailpass = By.xpath("//input[@placeholder='Password']");
     By emailloginBtn = By.xpath("//button[@data-qa='login-button']");

   
   

	public Login(WebDriver driver)
	{
	   this.driver=driver;
	}

	public void emailid(String userEmail) 
    {
        try
        {
        	//waitutility.until(ExpectedConditions.visibilityOfElementLocated(driver,email,15)).sendKeys("Ynitin156@gmail.com");
        	waitutility.waitForElementVisible(driver, emailid,10).sendKeys(userEmail);
        }
        catch(Exception e1)
        {
        	System.out.println(e1.getMessage());
        }
    }
    
    public void emailpass(String userpass) 
    {
        try
        {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(pass)).sendKeys("Quantum@8726");
        waitutility.waitForElementVisible(driver, emailpass,10).sendKeys(userpass);
        }
        catch(Exception e2)
        {
        	System.out.println(e2.getMessage());
        }
    }
    
    public void login_button() 
    {
        try
        {
        // wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn)).click();
        	waitutility.waitForElementClickable(driver, emailloginBtn, 10).click();
        }
        catch(Exception e3)
        {
        	System.out.println(e3.getMessage());
        }
     
//        WebElement loggedInUser = waitutility.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logged in as')]")));
//        Assert.assertTrue(loggedInUser.isDisplayed(), "❌ Login failed – Logged in user text not visible");
//        System.out.println("✅ Login successful");
      
    }
}
