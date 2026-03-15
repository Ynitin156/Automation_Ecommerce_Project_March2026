package utils_Ekart;
import org.testng.ITestResult;

import java.io.IOException;

import org.testng.ITestListener;
import Base_Ekart.Base;

import Base_Ekart.*;

public class listners extends Base implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
	    System.out.println("Test Failed: " + result.getName());
	    
	    // Calling your existing utility class method
	    // 'driver' is inherited from your Base class
	    GeneralUtilsSS.captureScreenshot(driver, result.getName());
	}
}
