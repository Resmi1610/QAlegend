package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;

public class Waitutilities {
public WebDriver driver;
public static void waitForClickingElement(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}

public static void waitForTextToBePresentInElement(WebDriver driver,WebElement element,String Text)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.textToBePresentInElement(element, Text));
}

public static void waitForElementToBeSelected(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.elementToBeSelected(element));
}

public static void waitForVisibiltyOfElement(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.visibilityOf(element));
}

public static void waitForAlertVisible(WebDriver driver)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.alertIsPresent());
}

public static void waitGetAttirbute(WebDriver driver,WebElement element, String attribute,String value)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.attributeContains(element, attribute, value));
}

public static void waitAttributeToBe(WebDriver driver,WebElement element,String attribute,String value)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));
	wait.until(ExpectedConditions.attributeToBe(element, attribute,value));
}
}
