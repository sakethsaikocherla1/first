package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public GenericMethods(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		
	}
	
	public WebElement findElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
		
	}
	
	public void click(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		findElement(locator).click();
		
	}
	public void EnterDetails(By locator, String inputValue) {
		findElement(locator).sendKeys(inputValue);
	}
	
	public boolean checkForVisibility(By locator) {
		return findElement(locator).isDisplayed();
	}
	

}
