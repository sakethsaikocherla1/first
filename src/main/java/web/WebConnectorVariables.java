package web;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ReadConfig;

public class WebConnectorVariables {
	private ExtentReports reports;
	private ExtentTest test  ;

	private ReadConfig readconfig;
	private  WebDriver driver;
	
	public ExtentReports getReports() {
		return reports;
	}

	public void setReports(ExtentReports reports) {
		this.reports = reports;
	}

	public ExtentTest getTest() {
		return test;
	}

	public void setTest(ExtentTest test) {
		this.test = test;
	}
	public ReadConfig getReadconfig() {
		return readconfig;
	}

	public void setReadconfig(ReadConfig readconfig) {
		this.readconfig = readconfig;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
