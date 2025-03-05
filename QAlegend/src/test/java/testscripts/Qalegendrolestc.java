package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Fakerutilitiy;

public class Qalegendrolestc extends Baseclass {

	WebDriver driver;
	
@Test
	public void rolesList() throws InterruptedException
	{
		loginpage.loginToQAlegend(prop.getProperty("username"),prop.getProperty("password"));
		homepage.endTourButtonClick();
		homepage.clickOnUserManagementButton();
		homepage.clickOnRolesButton();
		userpage.showRoleEntry();
		Thread.sleep(3000);
		userpage.rolesSizeFinder();
	}

@Test
	public void addRole() throws InterruptedException
	{
		loginpage.loginToQAlegend(prop.getProperty("username"),prop.getProperty("password"));
		homepage.endTourButtonClick();
		homepage.clickOnUserManagementButton();
		homepage.clickOnRolesButton();
		userpage.addRoles();
		String Rolename=Fakerutilitiy.getFakeFirstName();
		userpage.enterRoleName(Rolename);
		Thread.sleep(3000);
		userpage.saveRoleButton();
		Thread.sleep(3000);
		userpage.searchUser(Rolename);
		Thread.sleep(3000);
		Assert.assertEquals(userpage.roleFinder(), Rolename);
	}

@Test
	public void deleteRole() throws InterruptedException
	{
		loginpage.loginToQAlegend(prop.getProperty("username"),prop.getProperty("password"));
		homepage.endTourButtonClick();
		homepage.clickOnUserManagementButton();
		homepage.clickOnRolesButton();
		userpage.addRoles();
		String Rolename=Fakerutilitiy.getFakeFirstName();
		userpage.enterRoleName(Rolename);
		Thread.sleep(3000);
		userpage.saveRoleButton();
		Thread.sleep(3000);
		userpage.searchUser(Rolename);
		Thread.sleep(3000);
		Assert.assertEquals(userpage.roleFinder(), Rolename);
		Thread.sleep(3000);
		userpage.deleteRoleButton();
		userpage.searchUser(Rolename);
		
		Assert.assertEquals(userpage.getEmptyRoleTableStatus(), "No matching records foundr");
	}

}
