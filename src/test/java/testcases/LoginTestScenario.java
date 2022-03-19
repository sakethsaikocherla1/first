package testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseclass.BaseClass;
import pageobjects.DashboardPageObjects;
import pageobjects.LoginPageObjects;

public class LoginTestScenario extends BaseClass {
	
	
	LoginPageObjects LOGIN_PAGE;
	DashboardPageObjects DASHBOARD;
	
	@Test(priority = 1)
	public void checkTheUIOfLoginPage() throws Exception {
		LOGIN_PAGE= new LoginPageObjects(webconnector.getDriver());
		DASHBOARD=LOGIN_PAGE.loginToApplication(webconnector.getReadconfig().getUsername(),webconnector.getReadconfig().getPassword());
		Assert.assertTrue(DASHBOARD.checkForDashBoardVisibility());
		webconnector.getTest().log(Status.PASS,"User Successfully logged in to application");
	
		
	}
}
