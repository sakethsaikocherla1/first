package com.listener;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.reports.ExtentManager;


public class Listener implements ITestListener {

	
	public void onTestFailure(ITestResult result) {
			
		ExtentTest test =(ExtentTest) result.getTestContext().getAttribute("test");
		test.log(Status.FAIL, "LISTENER FAILURE"+result.getName());
		System.out.println("***************************Test Failed"+result.getName());
		
		//Reporter.getCurrentTestResult().getTestContext().setAttribute("criticalFailure", "Y");

	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("***************************Test Passed "+result.getName());
		ExtentTest	test =(ExtentTest) result.getTestContext().getAttribute("test");
		test.log(Status.PASS, "Test Passed Successfully");

	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("***************************Test Skipped "+result.getName());
	
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	  

	
	
	
}

		