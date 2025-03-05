package Pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutilities;

public class Qalegend_homepage {
WebDriver driver;
@FindBy(xpath = "//span[text()=\"User Management\"]")
WebElement userManagementButton;

@FindBy(xpath="//i[@class='fa fa-user']//following-sibling::span")
WebElement userButton;

@FindBy(xpath="//button[@class='btn btn-default btn-sm']")
WebElement endTourButton;

@FindBy(xpath="(//a[@id='tour_step4_menu']//following-sibling::span)[1]")
WebElement contactsButton;

@FindBy(xpath="(//i[@class=\"fa fa-star\"]//preceding::a)[14]")
WebElement suppliersButton;

@FindBy(xpath="//i[@class='fa fa-handshake-o']")
WebElement salesCommissionAgentsButton;

@FindBy(xpath="(//ul[@class='treeview-menu menu-open']//following::a)[2]")
WebElement customerButton;

@FindBy(xpath="(//span[@class='title'])[3]")
WebElement rolesButton;

@FindBy(id="tour_step5_menu")
WebElement productsButton;

@FindBy(xpath="//i[@class='fa fa-balance-scale']//following::span")
WebElement unitsbutton;



public Qalegend_homepage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void clickOnUserManagementButton()
{
	Pageutilities.clickOnAnElement(userManagementButton);// first method to call a class
}

public void clickOnUserButton()
{
	userButton.click(); // 2nd method- object.method
}

public void clickOnContactsButton()
{
	Pageutilities.clickOnAnElement(contactsButton);
}

public void clickOnSupplierButton()
{
	suppliersButton.click();
}

public void clickOnSalesCommisionAgents()
{
	salesCommissionAgentsButton.click();
}

public void clickOnCustomersButton()
{
	customerButton.click();
}

public void clickOnRolesButton() 
{
	rolesButton.click();
}

public void clickOnProductsButton()
{
	Pageutilities.clickOnAnElement(productsButton);
}

public void clickOnUnitsButton()
{
	Pageutilities.clickOnAnElement(unitsbutton);
}
public void endTourButtonClick()
{
	try
	{
	endTourButton.click();
	}catch(Exception e)
	{
	System.out.println("end tour button is not visible");
	}
}


}