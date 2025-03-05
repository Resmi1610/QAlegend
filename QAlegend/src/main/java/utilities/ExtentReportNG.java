package utilities;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	static ExtentReports extent;
	public static ExtentReports getReportObject() 
	{
		String path=System.getProperty("user.dir")+"\\test-output\\report.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path); // to customize a extent report
		reporter.config().setReportName("Web Automation Reporter");
		reporter.config().setDocumentTitle("Test Reports");
		extent=new ExtentReports(); 
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Resmi.s.j");
		return extent;
		
	}

}
