package com.Accuride.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Accuride.pageObjects.ForgotPage;
import com.Accuride.pageObjects.ProceedToCartCheckoutPage;

public class TC_ForgotPassword extends BaseClass {
	
	ForgotPage fogpass = new ForgotPage(driver);
	
	
	@Test (priority=1)
	public void TC_ForgotPassword_1UI_verify() throws Exception{
		
		logger.info("URL is opened");
		logger.info("Clicked on SignUp/Login Button");
		
		captureScreen(driver,"TC_ForgotPassword");

		driver.findElement(fogpass.loginsignUpbtn).click();

	
		   WebElement fogpassbutton = driver.findElement(fogpass.fogpassbtn);
		   
			logger.info("Verified the TC_ForgotPassword page");

		   
		
		   Assert.assertEquals(true, fogpassbutton.isDisplayed());
		  
		   captureScreen(driver,"TC_ForgotPassword");
			logger.info("TC_ForgotPassword_1 UI test passed");
		
			  
			 
				  }
	

	@Test (priority=2)
	public void TC_ForgotPassword_ID_3__6_verify_forpassbutton_and_inputfield() throws Exception{
		
		
		logger.info("Starting TC_ForgotPassword_ID_3__6_verify_forpassbutton_and_inputfield");
		
		captureScreen(driver,"TC_ForgotPassword_2");

		   WebElement fogpassbutton = driver.findElement(fogpass.fogpassbtn);
			Thread.sleep(1000);
			fogpassbutton.click();
			captureScreen(driver,"TC_ForgotPassword3__6_");

			logger.info("TC_ForgotPassword_ID_3__6_verify_forpassbutton_and_inputfield Passed");

         
	}
	
	@Test (priority=3)
	public void TC_ForgotPassword_ID__7_9_verify_by_entering_email() throws Exception{
		
      logger.info("Starting TC_ForgotPassword_ID__7_9_verify_by_entering_email");
		
		
		   WebElement emailinputfield = driver.findElement(fogpass.emailinput);
			Thread.sleep(1000);
		
			emailinputfield.sendKeys("vishalk.singh@indusnet.co.in");
			
			captureScreen(driver,"TC_ForgotPassword_3");

			
			Thread.sleep(1000);
			   WebElement resetPassbutton = driver.findElement(fogpass.resetPassbtn);
 
			   resetPassbutton.click();
			   
			   logger.info("Starting TC_ForgotPassword_ID__7_9_verify_by_entering_email Passed");

		 
             System.out.println("3 is pass");
	}


}
