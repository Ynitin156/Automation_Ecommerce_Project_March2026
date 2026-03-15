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



public class RegressionTestingEndtoEndFlow extends Base
{
	

	    @Test(priority = 1)
	    public void valid_login_check() 
	    {
	        Login lo = new Login(driver);
	        
	        lo.emailid("ynitin156@gmail.com"); 
	        lo.emailpass("Quantum@8726");
	        lo.login_button();
	        GeneralUtilsSS.captureScreenshot(driver, "LoginOnly_Check");
	              
	        
	        Add_to_cart atc = new Add_to_cart(driver);
	        atc.elementToBeClickable();
	        atc.continue_shopping();
	        atc.add_to_cart();
	        atc.Proceed_to_checkout();
	        atc.Placed_order();
	        GeneralUtilsSS.captureScreenshot(driver,"Placedorder");
//	        
//	        PaymentFlow pf = new PaymentFlow(driver);
//	        pf.name_of_card();
//	        pf.card_number();
//	        pf.card_cvv();
//	        pf.card_exp_month();
//	        pf.card_exp_year();
//	        pf.pay_and_confirm_order();
//	        
//	        GeneralUtilsSS.captureScreenshot(driver, "OrderSuccess");
	    }


	   
	   
}
