package utils_Ekart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GeneralUtilsSS 
{
	
	public static void captureScreenshot(WebDriver driver, String screenshotName) 
	{

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        try 
        {
            File destination = new File("./Automation_screenshot/" + screenshotName + ".png");
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
