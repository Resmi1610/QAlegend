package testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pageclasses.QAlegend_contactsclass;
import Pageclasses.QAlegend_productsclass;
import Pageclasses.Qalegend_homepage;
import Pageclasses.Qalegend_loginpage;
import Pageclasses.Qalegend_userclass;
import utilities.ScreenShotUtility;

public class Baseclass {
public WebDriver driver;

Qalegend_loginpage loginpage;
Qalegend_homepage homepage;
Qalegend_userclass userpage;
QAlegend_contactsclass contactclass;
QAlegend_productsclass productsclass;

Properties prop;
FileInputStream fis;
	public WebDriver initializemethod(String browser) throws Exception 
	{
		if (browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else
		{
			throw new Exception("invalid browser name");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}
	
	@BeforeMethod
	public void browserInitialization() throws Exception
	{
		driver= initializemethod("Chrome");
		prop=new Properties();
		String path=System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\data.properties"; // to set a dynamic path
		fis=new FileInputStream(path);
		prop.load(fis); // to loading the property file
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		loginpage=new Qalegend_loginpage(driver);
		homepage=new Qalegend_homepage(driver);
		userpage=new Qalegend_userclass(driver);
		contactclass=new QAlegend_contactsclass(driver);
		productsclass=new QAlegend_productsclass(driver);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult itResult) throws IOException 
	{
		if(itResult.getStatus()==ITestResult.FAILURE) {
		ScreenShotUtility sc= new ScreenShotUtility();
		sc.captureFailureScreenshots(driver, itResult.getName());
		}
		if(driver!=null) {
			driver.quit();
		}
	}
}
