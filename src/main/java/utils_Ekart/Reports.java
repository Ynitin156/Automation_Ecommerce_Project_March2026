package utils_Ekart;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports 
{
	public static ExtentReports extent;

     public static ExtentReports getReportObject() {

        String path = System.getProperty("user.dir") + "/reports/index.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Automation Test Results");
        reporter.config().setDocumentTitle("Ekart Automation Report");

        extent = new ExtentReports();
        extent.attachReporter(reporter);

        extent.setSystemInfo("Tester", "Nitin");

        return extent;
    }
}
