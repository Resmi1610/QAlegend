package testscripts;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pageclasses.QAlegend_contactsclass;
import Pageclasses.QAlegend_productsclass;
import Pageclasses.Qalegend_homepage;
import Pageclasses.Qalegend_loginpage;
import Pageclasses.Qalegend_userclass;
import constants.Constants;
import utilities.Excell_Utility;
import utilities.Fakerutilitiy;

public class Qalegenuserstest extends Baseclass {
WebDriver driver;

@Test
public void createAUser()
{
	loginpage.loginToQAlegend(prop.getProperty("username"),prop.getProperty("password"));
	homepage.endTourButtonClick();
	homepage.clickOnUserManagementButton();
	homepage.clickOnUserButton();
	userpage.addUserBtn().click();
	String name=Fakerutilitiy.getFakeFirstName();
	String emailid=name+Fakerutilitiy.getRandomNumber()+"@gmail.com";
	String password="12345";
	userpage.addUser(name, emailid, password);
	userpage.searchUser(name);
	Assert.assertEquals(userpage.userNameFinder(), name);
}

@Test
public void editAUser() throws InterruptedException
{
	loginpage.loginToQAlegend(prop.getProperty("username"),prop.getProperty("password"));
	homepage.endTourButtonClick();
	homepage.clickOnUserManagementButton();
	homepage.clickOnUserButton();
	userpage.addUserBtn().click();
	String name=Fakerutilitiy.getFakeFirstName();
	String emailid=name+Fakerutilitiy.getRandomNumber()+"@gmail.com";
	String password="12345";
	userpage.addUser(name, emailid, password);
	userpage.searchUser(name);
	Assert.assertEquals(userpage.userNameFinder(), name);
	
	String emailid1=name+Fakerutilitiy.getRandomNumber()+"@outlook.com";
    Thread.sleep(3000);
	userpage.userEditButton1(name,emailid1,password);
	Thread.sleep(3000);
	userpage.userUdpateButon();
	userpage.searchUser(name);
	
}

@Test
public void deleteUser()
{
	loginpage.loginToQAlegend(prop.getProperty("username"),prop.getProperty("password"));
	homepage.endTourButtonClick();
	homepage.clickOnUserManagementButton();
	homepage.clickOnUserButton();
	userpage.addUserBtn().click();
	String name=Fakerutilitiy.getFakeFirstName();
	String emailid=name+Fakerutilitiy.getRandomNumber()+"@gmail.com";
	String password="12345";
	userpage.addUser(name, emailid, password);
	userpage.searchUser(name);
	userpage.userDeleteButton();
	userpage.searchUser(name);
	Assert.assertEquals(userpage.getTableStatus(), "No matching records found");
}

}