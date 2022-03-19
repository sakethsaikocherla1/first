package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ReadConfig;

public class WebConnectors extends WebConnectorVariables {
	
	

	public WebConnectors() { 
		setReadconfig(new ReadConfig());
	}

	public void connect_browser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", getReadconfig().getChromePath());
			setDriver(new ChromeDriver());
			
		} else if (browser.equals("FIREFOX")) {
					
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	
	public void launch_application() {
		getDriver().get(getReadconfig().getApplicationURL());
	}


}
