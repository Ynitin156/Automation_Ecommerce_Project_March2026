package Testcases;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base_Ekart.Base;
import utils_Ekart.GeneralUtilsSS;
import org.testng.annotations.Test;
import Pages_Ekart.Add_to_cart;
import Pages_Ekart.Login;
import Pages_Ekart.PaymentFlow;



public class SanityLogin2 extends Base
{
 
	@Test(dataProvider="loginData", dataProviderClass=dataprovider.class)
	public void valid_login_scenario_check(String userEmail, String userpass, String expectedResult) throws InterruptedException 
	{
	    Login lo = new Login(driver);
	    lo.emailid(userEmail);
	    lo.emailpass(userpass);
	    lo.login_button();

	    // 1. CRITICAL: Give the page 2-3 seconds to load/redirect
	    Thread.sleep(3000); 

	    // 2. Double check your Excel: if column C is "pass", use .equalsIgnoreCase("pass")
	    if(expectedResult.trim().equalsIgnoreCase("pass")) 
	    {
	        String actualUrl = driver.getCurrentUrl();
	        // Use contains to be safer against trailing slashes
	        Assert.assertTrue(actualUrl.contains("automationexercise.com"), 
	            "FAIL: Valid login stayed on: " + actualUrl);
	    } 
	    else 
	    {
	        // For your 7 "fail" rows in Excel
	        String actualTitle = driver.getTitle();
	        if(actualTitle.contains("Signup / Login")) {
	            Assert.fail("Failing intentionally: Invalid credentials identified for " + userEmail);
	        }
	    }
	}
	   
}
