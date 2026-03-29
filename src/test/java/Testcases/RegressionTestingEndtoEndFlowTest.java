package Testcases;

import org.testng.Assert;
import org.testng.annotations.*;
import com.aventstack.extentreports.*;

import Base_Ekart.Base;
import utils_Ekart.GeneralUtilsSS;
import utils_Ekart.Reports;
import Pages_Ekart.Add_to_cart;
import Pages_Ekart.Login;
import Pages_Ekart.PaymentFlow;

public class RegressionTestingEndtoEndFlowTest extends Base {

    ExtentReports extent;
    ExtentTest test;

    @BeforeTest
    public void setupReport() 
    {
        extent = Reports.getReportObject();
    }

    @Test
    public void valid_login_check() 
    {

       test = extent.createTest("End to End Flow Test");

        Login lo = new Login(driver);

        test.info("Entering credentials");
        lo.emailid("your_email");
        lo.emailpass("your_password");
        lo.login_button();

       // Assert.assertTrue(driver.getTitle().contains("Home"));
        test.pass("Login successful");

        GeneralUtilsSS.captureScreenshot(driver, "LoginOnly_Check");

        Add_to_cart atc = new Add_to_cart(driver);
        atc.elementToBeClickable();
        atc.continue_shopping();
        atc.add_to_cart();
        atc.Proceed_to_checkout();
        atc.Placed_order();

        test.pass("Product added and order placed");
        GeneralUtilsSS.captureScreenshot(driver, "Placedorder");

        PaymentFlow pf = new PaymentFlow(driver);
        pf.name_of_card();
        pf.card_number();
        pf.card_cvv();
        pf.card_exp_month();
        pf.card_exp_year();
        pf.pay_and_confirm_order();

        test.pass("Payment successful");
        GeneralUtilsSS.captureScreenshot(driver, "OrderSuccess");

       // Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
    
    @AfterTest
    public void tearDownReport()
    {
        extent.flush();
    }
}