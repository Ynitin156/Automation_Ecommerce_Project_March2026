package Testcases;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Base_Ekart.Base;
import utils_Ekart.GeneralUtilsSS;
import utils_Ekart.Reports;

import org.testng.annotations.Test;
import Pages_Ekart.Add_to_cart;
import Pages_Ekart.Login;
import Pages_Ekart.PaymentFlow;



public class SanityLogin extends Base
{
	
	ExtentReports extent;
    ExtentTest test;

    @BeforeTest
    public void setupReport()
    {
        extent = Reports.getReportObject();
    }

 
	@Test
    public void valid_login_scenario_check() 
	{
		test = extent.createTest("Valid Login Test");

        Login lo = new Login(driver);

        lo.emailid("ynitin156@gmail.com");
        lo.emailpass("Quantum@8726");
        lo.login_button();

        GeneralUtilsSS.captureScreenshot(driver, "AfterLogin");
        
        test.pass("Login executed successfully");
	}
	
	@AfterTest
    public void tearDownReport()
    {
        extent.flush();   // This generates the report file
    }
	   
}
