package com.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.Test;

public class A extends TestBase {

	@Test(priority = 2)
	public void TC_A() {
		test.log(Status.FAIL, "This is for FAIL ");
		Assert.assertTrue(false);
	}

	@Test(priority = 1)
	public void TC_AA() {
		test.log(Status.PASS, "This is for PASS ");
		Assert.assertTrue(true);
	}
}
