package Pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutilities;

public class QAlegend_productsclass {
	
	WebDriver driver;
@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-modal']")
WebElement addNewUnitButton;
@FindBy(xpath="(//input[@class='form-control'])[1]")
WebElement addNewUnitName;
@FindBy(xpath="(//input[@class='form-control'])[2]")
WebElement addNewUnitShortName;
@FindBy(xpath="//select[@class='form-control']")
WebElement allowDecimalDropDown;
@FindBy(xpath="//button[@class='btn btn-primary']")
WebElement saveNewUnitButton;











public QAlegend_productsclass(WebDriver driver) 
{
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void addNewUnitButton() 
{
	Pageutilities.clickOnAnElement(addNewUnitButton);
}

public void addNewUnitName(String UnitName)
{
	Pageutilities.enterText(addNewUnitName, UnitName);
}

public void addNewUnitShortName(String ShortUnitName)
{
	Pageutilities.enterText(addNewUnitShortName, ShortUnitName);
}

public void allowDecimal() 
{
 Pageutilities.clickOnAnElement(allowDecimalDropDown);
 Pageutilities.selectByVisibleText(allowDecimalDropDown, "Yes");	
}

public void saveNewUnitButton() 
{
 Pageutilities.clickOnAnElement(saveNewUnitButton);	
}
}
