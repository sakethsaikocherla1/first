package baseclass;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.project.reports.ExtentManager;

import web.WebConnectors;

public class BaseClass {
	
	
	
	protected WebConnectors webconnector;
	
	public BaseClass (){
		webconnector = new WebConnectors();
	}
	
	@BeforeSuite
	public void launch_browser() {
		webconnector.connect_browser("Chrome");
		webconnector.launch_application();
	}
	@BeforeMethod
	public void startCreatingReport(ITestContext context,ITestResult result) {
		
		webconnector.setReports(ExtentManager.getReports());
		webconnector.setTest(webconnector.getReports().createTest(result.getMethod().getMethodName()));
		context.setAttribute("test", webconnector.getTest());
	
	}
	@AfterMethod
	public void endOfReport(ITestResult result ) {
		webconnector.getReports().flush();
	}
	@AfterSuite
	public void close_browser() throws Exception {
		webconnector.getDriver().close();
	}
	
	

}
