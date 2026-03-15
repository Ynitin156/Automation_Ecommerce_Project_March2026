package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages_Ekart.Login;
import utils_Ekart.Excelutility;
import Base_Ekart.Base;
import Pages_Ekart.*;


public class dataprovider 
{
	
	@DataProvider(name="loginData")
	public Object[][] getData() throws Exception 
	{

		return Excelutility.getExcelData(
		        "src/main/resources/Testdata.xlsx",
		        "Sheet1"
		);
	}
}
