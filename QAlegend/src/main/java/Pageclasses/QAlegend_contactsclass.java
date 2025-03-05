package Pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutilities;

public class QAlegend_contactsclass {
	
	WebDriver driver;
	@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-modal']")
	WebElement addSupplierButton;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement supplierName;
	
	@FindBy(id="supplier_business_name")
	WebElement supplierBusinessName;
	
	@FindBy(id="mobile")
	WebElement supplierMobileNumber;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement saveSupplierButton;
	
	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement searchSupplierTextBox;
	
	@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-modal']")
	WebElement addCustomerButton;
	
    @FindBy(id="name")
    WebElement customerName;
    
    @FindBy(id="mobile")
    WebElement customerMobile;
    
    @FindBy(xpath="//button[@class='btn btn-primary']")
    WebElement saveCustomerButton;
	
	@FindBy(xpath="(//tr[@class='odd']//td)[3]")
	WebElement nameCell;
	
	
	
	
	
	

public QAlegend_contactsclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement addSupplierBtn()
{
	return(addSupplierButton);
}

public QAlegend_contactsclass addSupplier(String SName,String BName, String mobile)
{
	Pageutilities.enterText(supplierName, SName);
	Pageutilities.enterText(supplierBusinessName, BName);
	Pageutilities.enterText(supplierMobileNumber, mobile);
	Pageutilities.clickOnAnElement(saveSupplierButton);
	return this;
}

public void searchSupplier(String SupName) 
{
	Pageutilities.clearText(searchSupplierTextBox);
	searchSupplierTextBox.sendKeys(SupName);
	
}

public String userNameFinder() {
	// TODO Auto-generated method stub
	String name=Pageutilities.getText(nameCell);
	return(name);
}

public void addCustomerBtn() 
{
	
      Pageutilities.clickOnAnElement(addCustomerButton);
	
}

public void addCustomer(String CName, String mobile)

{
	Pageutilities.enterText(customerName, CName);
	Pageutilities.enterText(customerMobile, mobile);
	Pageutilities.clickOnAnElement(saveCustomerButton);
	
}


}
