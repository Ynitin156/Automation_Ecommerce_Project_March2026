package Testcases;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Base_Ekart.Base;
import utils_Ekart.GeneralUtilsSS;
import org.testng.annotations.Test;
import Pages_Ekart.Add_to_cart;
import Pages_Ekart.Login;
import Pages_Ekart.PaymentFlow;



public class SanityLogin extends Base
{
 
	   @Test(priority = 1)
	   public void valid_login_scenario_check()
	   {
	 	  //login_credentials
	 	  Login lo = new Login(driver);
	 	  lo.emailid("ynitin156@gmail.com");
	 	  lo.emailpass("Quantum@8726");
	 	  lo.login_button();
	 	  GeneralUtilsSS.captureScreenshot(driver, "AfterLogin");
	 	  
	 	  
	 
   }
	   
	   
}
