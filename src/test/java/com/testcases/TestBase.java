package com.testcases;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.project.reports.ExtentManager;

public class TestBase extends BaseVariables {
	
	@BeforeClass
	public void beforeTheTest() {
		System.out.println("Before The Test");
		
	}
	
	@BeforeMethod
	public void beforeTheMethod(ITestResult result,ITestContext context) {
		System.out.println("Before The Method");
		reports =ExtentManager.getReports();
		test = reports.createTest(result.getMethod().getMethodName());
		context.setAttribute("test", test);
	}
	
	@AfterMethod
	public void afterTheMethod() {
		System.out.println("After The Method");
		reports.flush();
	}
	
	@AfterTest
	public void afterTheTest() {
		System.out.println("After TheTest");
		
	}

}
