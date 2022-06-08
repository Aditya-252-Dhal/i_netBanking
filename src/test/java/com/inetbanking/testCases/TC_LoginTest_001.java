package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{
		
		Logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("Entered username");
		lp.setPassword(password);
		Logger.info("Entered password");
		lp.clickSubmit();
		Logger.info("Login test passed");
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) 
		{
			Assert.assertTrue(true);	
			Logger.info("Login Test Passed!");
		}
		else
		{
			captureScreen(driver,"LoginTest");
			Assert.assertFalse(false);
			Logger.info("Login Test Failed!");
		}
	}

}
