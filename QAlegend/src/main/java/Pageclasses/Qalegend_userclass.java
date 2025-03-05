package Pageclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutilities;

public class Qalegend_userclass {
WebDriver driver;
@FindBy (xpath = "//a[@class='btn btn-block btn-primary']")
WebElement addUserButton;
@FindBy(id="first_name")
WebElement firstName;
@FindBy(id="email")
WebElement email;
@FindBy(id="password")
WebElement password;
@FindBy(id="confirm_password")
WebElement confirmPassword;
@FindBy(id="submit_user_button")
WebElement submitbtn;
@FindBy(xpath="//input[@class='form-control input-sm']")
WebElement searchUserTextBox;

@FindBy(xpath="(//tr[@class='odd' or @class='even']//td)[2]")
WebElement nameCell;
@FindBy(xpath="//button[@class='btn btn-xs btn-danger delete_user_button']")
WebElement userDeleteButton;
@FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger']")
WebElement deleteConfirmationButton;
@FindBy(xpath="//td[@class='dataTables_empty']")
WebElement emptyTable;
@FindBy(xpath="//button[@class='btn btn-primary btn-modal pull-right']")
WebElement addSCAgentsButton;
@FindBy(xpath="(//input[@id='first_name'])[1]")
WebElement fNameSCAgent;
@FindBy(id="cmmsn_percent")
WebElement SCpercentage;
@FindBy(xpath="//button[@class='btn btn-primary']")
WebElement saveSCAgentButton;
@FindBy(xpath="(//tr[@class='odd']//following::a)[1]")
WebElement editUserButton;
@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
WebElement updateUserButton;
@FindBy(xpath="//tr[@class='odd' or @class='even']")
List<WebElement> rolesList; 
@FindBy(xpath="//select[@name='roles_table_length']")
WebElement selectRoleEntries;
@FindBy(xpath="//a[@class='btn btn-block btn-primary']")
WebElement addRoles;
@FindBy(xpath="//input[@class='form-control']")
WebElement enterRoleName;
@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
WebElement saveRoleButton;
@FindBy(xpath="(//tr[@class='odd']//td)[1]")
WebElement searchRole;
@FindBy(xpath="//input[@class='form-control input-sm']")
WebElement searchRoleTextBox;
@FindBy(xpath="//button[@class='btn btn-xs btn-danger delete_role_button']")
WebElement deleteRoleButton;
@FindBy(xpath="//button[@class='swal-button swal-button--confirm swal-button--danger']")
WebElement deleteRoleConfirmationButton;
@FindBy(xpath="//td[@class='dataTables_empty']")
WebElement emptyRoleTable;




public Qalegend_userclass(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

public WebElement addUserBtn()
{
	return(addUserButton);// 3rd method using return 
}

public Qalegend_userclass addUser(String fName, String e_mail, String pword)
{
 Pageutilities.enterText(firstName, fName);	
 Pageutilities.enterText(email, e_mail);
 Pageutilities.enterText(password, pword);
 Pageutilities.enterText(confirmPassword, pword);
 Pageutilities.clickOnAnElement(submitbtn);
 return this;// chaining of objects
 
}

public void searchUser(String username) 
{
Pageutilities.clearText(searchUserTextBox);
searchUserTextBox.sendKeys(username);	
}

public String userNameFinder()
{
	String name=Pageutilities.getText(nameCell);
	return name;
}

public Qalegend_userclass userDeleteButton()
{
	Pageutilities.clickOnAnElement(userDeleteButton);
	Pageutilities.clickOnAnElement(deleteConfirmationButton);
	return this;
}

public void userEditButton1(String username,String emailid,String password) 
{
	Pageutilities.clickOnAnElement(editUserButton);
	
}
public void userUdpateButon() 
{
	Pageutilities.clickOnAnElement(updateUserButton);
	
}

public String getTableStatus()
{
	return(Pageutilities.getText(emptyTable));
}

public WebElement addSCAgentsButton() 
{
	return(addSCAgentsButton);
}

public void addSCAgent(String FNameSCA , String SCPercentage) 
{
	Pageutilities.enterText(fNameSCAgent, FNameSCA);
	Pageutilities.clickOnAnElement(addSCAgentsButton);
	
	
}



public void userEditButton(String emailid1) {
	
	Pageutilities.clickOnAnElement(editUserButton);
	
}

public int rolesSizeFinder()

{

	return(rolesList.size());

}
public void showRoleEntry() 
{
	Pageutilities.clickOnAnElement(selectRoleEntries);
	Pageutilities.selectByValue(selectRoleEntries, "50");
	Pageutilities.clickOnAnElement(selectRoleEntries);
}

public void addRoles()
{
	Pageutilities.clickOnAnElement(addRoles);
}

public void enterRoleName(String Rolename) 
{
	Pageutilities.enterText(enterRoleName, Rolename);
}

public void saveRoleButton()
{
	Pageutilities.clickOnAnElement(saveRoleButton);
}

public String roleFinder()
{
	String Rolename=Pageutilities.getText(searchRole);
	return Rolename;
}

public void searchRole(String roleName) 
{
Pageutilities.clearText(searchRoleTextBox);
searchUserTextBox.sendKeys(roleName);	
}

public Qalegend_userclass deleteRoleButton() 
{
 Pageutilities.clickOnAnElement(deleteRoleButton);
 Pageutilities.clickOnAnElement(deleteRoleConfirmationButton);
return this; 
}
public String getEmptyRoleTableStatus() 
{
	return(Pageutilities.getText(emptyRoleTable));
}

}


