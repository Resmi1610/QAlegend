package Pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutilities;

public class Qalegend_loginpage {
	WebDriver driver;
	@FindBy(id = "username")
	WebElement usernamefield;
	@FindBy(id = "password")
	WebElement passwordfield;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement loginbutton;
	
	
	
	
	
	
	
	
	
	
	public Qalegend_loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}










	public void loginToQAlegend(String username,String password)
	{
	Pageutilities.enterText(usernamefield, username);
	Pageutilities.enterText(passwordfield, password);
	Pageutilities.clickOnAnElement(loginbutton);
	}
	
	
	
	
	
	

}
