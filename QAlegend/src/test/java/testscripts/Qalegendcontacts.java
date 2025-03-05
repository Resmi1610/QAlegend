package testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import utilities.Excell_Utility;
import utilities.Fakerutilitiy;

public class Qalegendcontacts extends Baseclass
{
 WebDriver driver;
 
 @Test
 public void createNewSupplier() throws IOException, InterruptedException
 {
 	loginpage.loginToQAlegend(prop.getProperty("username"),prop.getProperty("password"));
 	homepage.endTourButtonClick();
 	homepage.clickOnContactsButton();
 	homepage.clickOnSupplierButton();
     contactclass.addSupplierBtn().click();
     String SName= Excell_Utility.getStringData(1, 0, Constants.EXCELFILEPATH, "Sheet1")+Fakerutilitiy.getRandomNumber();
     String BName=Excell_Utility.getStringData(1, 1, Constants.EXCELFILEPATH, "Sheet1")+Fakerutilitiy.getRandomNumber();
     String mobile=Excell_Utility.getIntegerData(1, 2, Constants.EXCELFILEPATH, "Sheet1")+Fakerutilitiy.getRandomNumber();
     contactclass.addSupplier(SName, BName, mobile);
     Thread.sleep(3000);
     contactclass.searchSupplier(SName);
     Thread.sleep(3000);
     Assert.assertEquals(contactclass.userNameFinder(), SName);
 	}

 @Test
 public void addNewSalesCommissionAgents() 
 {
 	loginpage.loginToQAlegend(prop.getProperty("username"),prop.getProperty("password"));
 	homepage.endTourButtonClick();
 	homepage.clickOnUserManagementButton();
 	homepage.clickOnSalesCommisionAgents();
 	userpage.addSCAgentsButton().click();
 	String SAName= Fakerutilitiy.getFakeFirstName();
 	String SCPercetage="123542";
 	userpage.addSCAgent(SAName,SCPercetage);
 	
 }
 @Test
 public void createNewCustomer() throws InterruptedException
 {
 	loginpage.loginToQAlegend(prop.getProperty("username"),prop.getProperty("password"));
 	homepage.endTourButtonClick();
 	homepage.clickOnContactsButton();
 	homepage.clickOnCustomersButton();
 	contactclass.addCustomerBtn();
 	Thread.sleep(3000);
 	String CName=Fakerutilitiy.getFakeFirstName();
 	Thread.sleep(3000);
 	String mobile="987654262";
 	Thread.sleep(3000);
 	contactclass.addCustomer(CName, mobile);
 }
}
