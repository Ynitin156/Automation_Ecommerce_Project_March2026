package utils_Ekart;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports 
{
	public static ExtentReports extent;

    public static ExtentReports getReportInstance() {

        String path = System.getProperty("user.dir") + "/Automation_screenshot/ExtentReport.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Ekart Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);

        return extent;
    }
}
