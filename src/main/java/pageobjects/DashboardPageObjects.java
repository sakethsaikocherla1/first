package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPageObjects extends LoginPageObjects {

	public DashboardPageObjects(WebDriver driver) {
		super(driver);
	}

	By dashboard = By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[1]/a");
	
	public boolean checkForDashBoardVisibility() {
		return utilities.checkForVisibility(dashboard);
	}
	
}
