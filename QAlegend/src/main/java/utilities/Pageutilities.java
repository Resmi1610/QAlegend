package utilities;

import java.lang.annotation.ElementType;

import javax.swing.text.html.parser.Element;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pageutilities {
//to add generic methods
	WebDriver driver;
	//to click an element
	public static void clickOnAnElement(WebElement element)
	{
		element.click();
	}
	public static void selectByValue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element,String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public static void selectByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public static void enterText(WebElement element,CharSequence[] mobile)
	{
		element.sendKeys(mobile);
	}
	
	public static void enterNumber(WebElement element,CharSequence[] number)
	{
		element.sendKeys(number);
	}
	
	public static void enterText(WebElement element,String name)
	{
		element.sendKeys(name);
	}
	
	public static void dragAndDrop(WebElement Source,WebElement Destination,WebDriver driver )
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(Source, Destination).build().perform();
	}
	
	public static void rightClickOnAnElement(WebElement element,WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.contextClick(element).build().perform();
	}
	
	public static void rightClick(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.contextClick().build().perform();
	}
	
	public static void mouseHouver(WebElement element,WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void clickUsingJSExecuter(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void scrollTillElementVisible(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	
	public static boolean isElementVisible(WebDriver driver,WebElement element)
	{
		return(element.isDisplayed());
	}
	
	public static boolean isElementEnable(WebElement element)
	{
		return(element.isEnabled());
	}
	
	public static String getText(WebElement element)
	{
		return(element.getText());
	}
	
	public static @Nullable String getAttibute(WebDriver driver,WebElement element, String text)
	{
		return(element.getAttribute(text));
	}
	
	public static void navigateTo(WebDriver driver,String url)
	{
		driver.navigate().to(url);
	}
	
	public static void navigateBack(WebDriver driver)
	{
		driver.navigate().back();
	}
	
	public static void forward(WebDriver driver)
	{
		driver.navigate().forward();
	}
	
	public static void refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	
	public static void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public static void alertDissmiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public static void alertDismiss(WebDriver driver,WebElement element)
	{
		alertDismiss(driver, element);
	}
	
	public static void clearText(WebElement element)
	{
		element.clear();
	}
	
	public static void enterText(String sCPercentage, WebElement sCpercentage2) 
	{
		// TODO Auto-generated method stub
		
		
	}
	
	
}
