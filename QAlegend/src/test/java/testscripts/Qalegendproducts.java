package testscripts;

import java.time.Duration;

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
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
  	String newShortName=Fakerutilitiy.getFakerLastName();
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
  	productsclass.addNewUnitShortName(newShortName);
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
  	productsclass.allowDecimal();
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
  	productsclass.saveNewUnitButton();
  	
  }
  
}
