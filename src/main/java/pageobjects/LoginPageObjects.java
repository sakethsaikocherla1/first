package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.GenericMethods;

public class LoginPageObjects  {
	GenericMethods utilities;
	WebDriver driver;
	public LoginPageObjects(WebDriver driver){
		this.driver = driver;
		utilities = new GenericMethods(driver);
	}

	By inputEmail = By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input");
	By inputPassword = By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input");
	By buttonSubmit = By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button");
	
	public DashboardPageObjects loginToApplication(String emailId, String password){
		utilities.EnterDetails(inputEmail, emailId);
		utilities.EnterDetails(inputPassword, password);
		utilities.click(buttonSubmit);
		return new DashboardPageObjects(driver);
		
		
	}

}
