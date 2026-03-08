package Base_Ekart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import utils_Ekart.ConfigReader;


public class Base 
{
	   public WebDriver driver;
	 // WebDriverWait wait;

	  @BeforeMethod
	  public void setup() 
	  {
		  ConfigReader conR = new ConfigReader();
		  
		  String browser = conR.getBrowser();
		  String baseurl = conR.getBaseUrl();
		  
		  System.out.println("DEBUG: The URL found is: " + baseurl);
		  
		  if(browser.equalsIgnoreCase("chrome"))
		  {
			 driver = new ChromeDriver();
		  }
		  
		  driver.manage().window().maximize();
		  driver.get(baseurl);
	   
	  }
	  
	  @AfterMethod
	  public void teardown()
	  {
		 
		        if (driver != null)
		        {
		            driver.quit();
		        }
		    
	  }

}
