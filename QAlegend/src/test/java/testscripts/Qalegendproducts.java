package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.Fakerutilitiy;

public class Qalegendproducts extends Baseclass 
{
  WebDriver driver;
  
  @Test
  public void addNewUnit() throws InterruptedException
  {
  	loginpage.loginToQAlegend(prop.getProperty("username"),prop.getProperty("password"));
  	homepage.endTourButtonClick();
  	homepage.clickOnProductsButton();
  	homepage.clickOnUnitsButton();
  	productsclass.addNewUnitButton();
  	String newUnitName=Fakerutilitiy.getFakeFirstName();
  	productsclass.addNewUnitName(newUnitName);
  	Thread.sleep(3000);
  	String newShortName=Fakerutilitiy.getFakerLastName();
  	Thread.sleep(3000);
  	productsclass.addNewUnitShortName(newShortName);
  	Thread.sleep(3000);
  	productsclass.allowDecimal();
  	Thread.sleep(3000);
  	productsclass.saveNewUnitButton();
  	
  	
  }
}
