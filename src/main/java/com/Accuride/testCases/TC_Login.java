package com.Accuride.testCases;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Accuride.pageObjects.LoginPage;
import com.Accuride.testCases.BaseClass;





public class TC_Login extends BaseClass{
	
	LoginPage home = new LoginPage(driver);
	
	 	

	@Test (priority=1)
	public void Login_TC_ID_1UIloginTest() throws Exception{
		
		logger.info("URL is opened");
		logger.info("Clicked on SignUp/Login Button");
		
		captureScreen(driver,"Login_TC_ID_1UIloginTest1");

		driver.findElement(home.loginsignUpbtn).click();

	
		
		   WebElement emailinput = driver.findElement(home.email);
		   WebElement passInput = driver.findElement(home.passWord); 
		   WebElement loginButtoncheck = driver.findElement(home.LogInbtn);
		   
			logger.info("Verified the UIloginTest page");

		   
		
		   Assert.assertEquals(true, emailinput.isDisplayed());
		   Assert.assertEquals(true, passInput.isDisplayed());
		   Assert.assertEquals(true, loginButtoncheck.isDisplayed());
		   captureScreen(driver,"Login_TC_ID_1UIloginTest");
			logger.info("Login_TC_ID_1UIloginTest test passed");
		
			  
			 
				  }
	
	
	@Test (priority=2)
	public void Login_TC_ID_2CheckByNotFillingAnyData() throws IOException {
		
		logger.info("Login_TC_ID_2CheckByNotFillingAnyData test cases started    ");
	
		driver.findElement(home.LogInbtn).click();
		String emailAlerttext = driver.findElement(home.emailAlert).getText();
		 String passAlerttext = driver.findElement(home.passAlert).getText();


		if(home.k.equals(emailAlerttext)&& home.k2.equals(passAlerttext) ){
	        System.out.println("Pass");
			captureScreen(driver,"Login_TC_ID_2CheckByNotFillingAnyData");
			logger.info("Login_TC_ID_2CheckByNotFillingAnyData test cases Passed");


	    }
	        else {
	            System.out.println("Fail");
	    		logger.info("Login_TC_ID_2CheckByNotFillingAnyData test cases Failed");
				captureScreen(driver,"Login_TC_ID_2CheckByNotFillingAnyData");


	        }
		
	
	}
		
	@Test (priority=3)
	public void Login_TC_ID_3CheckByNotFillingEmail() throws IOException {
	
		logger.info("Login_TC_ID_3CheckByNotFillingEmail test cases started");

			
				driver.findElement(home.passWord).sendKeys("eGain@123");
	
				driver.findElement(home.LogInbtn).click();
				String emailAlerttext = driver.findElement(home.emailAlert).getText();
		
		if(home.k.equals(emailAlerttext)){
	        System.out.println("Pass");
	        logger.info("Login_TC_ID_3CheckByNotFillingEmail test cases Passed");
			captureScreen(driver,"Login_TC_ID_3CheckByNotFillingEmail");
	    }
	        else {
	            System.out.println("Fail");
	            logger.info("Login_TC_ID_3CheckByNotFillingEmail test cases Failed");
	    		captureScreen(driver,"Login_TC_ID_3CheckByNotFillingEmail");
	        }
		
	}
	
@Test (priority=4)
	public void Login_TC_ID_4CheckByNotFillingPass() throws IOException {
	
	logger.info("Login_TC_ID_4CheckByNotFillingPass test cases started");

	driver.findElement(home.email).sendKeys("vishalk.singh@indusnet.co.in");
	driver.findElement(home.passWord).clear();
	driver.findElement(home.LogInbtn).click();

	 String passAlerttext = driver.findElement(home.passAlert).getText();

		
		if(home.k2.equals(passAlerttext)){
	        System.out.println("Pass");
	        
	        logger.info("Login_TC_ID_4CheckByNotFillingPass test cases Passed");
			captureScreen(driver,"Login_TC_ID_4CheckByNotFillingPass");
	    }
	        else {
	            System.out.println("Fail");
	            
	            logger.info("Login_TC_ID_4CheckByNotFillingPass test cases Failed");
	    		captureScreen(driver,"Login_TC_ID_4CheckByNotFillingPass");
	        }
		
	}

@Test (priority=5)
	public void Login_TC_ID_5CheckPassingIncorrectEmailAndValidPassword() throws InterruptedException, IOException {
	
	logger.info("Login_TC_ID_5CheckPassingIncorrectEmailAndValidPassword test cases started");

	driver.findElement(home.loginsignUpbtn).click();

	driver.findElement(home.email).clear();
	
	driver.findElement(home.email).sendKeys("vishal234234@indusnet.co.in");
	driver.findElement(home.passWord).sendKeys("eGain@123");
	driver.findElement(home.LogInbtn).click();

	Thread.sleep(1000);
	 String alerttextemailpass = driver.findElement(home.incorrectEmailAlert).getText();

		if(home.e.equals(alerttextemailpass)){
	        System.out.println("Pass");
	        logger.info("Login_TC_ID_5CheckPassingIncorrectEmailAndValidPassword test cases Passed");
			captureScreen(driver,"Login_TC_ID_5CheckPassingIncorrectEmailAndValidPassword");
	    }
	        else {
	            System.out.println("Fail");
	            logger.info("Login_TC_ID_5CheckPassingIncorrectEmailAndValidPassword test cases failed");
	    		captureScreen(driver,"Login_TC_ID_5CheckPassingIncorrectEmailAndValidPassword");
	        }
		
	
	}
	
@Test (priority=6)
	public void Login_TC_ID_6CheckPassingIncorrectEmailAndInValidPassword() throws InterruptedException, IOException {
	
	logger.info("Login_TC_ID_6CheckPassingIncorrectEmailAndInValidPassword test cases Started");

	driver.findElement(home.email).clear();
	driver.findElement(home.passWord).clear();
	driver.findElement(home.email).sendKeys("vishal@indusnet.co.in");
	driver.findElement(home.passWord).sendKeys("eGain@12390");

	driver.findElement(home.LogInbtn).click();

	Thread.sleep(1000);
	 String alerttextemailpass = driver.findElement(home.incorrectEmailAlert).getText();
		
		if(home.e.equals(alerttextemailpass)){
	        System.out.println("Pass");
	        logger.info("Login_TC_ID_6CheckPassingIncorrectEmailAndInValidPassword test cases Passed");
			captureScreen(driver,"Login_TC_ID_5CheckPassingIncorrectEmailAndValidPassword");
	    }
	        else {
	            System.out.println("Fail");
	            logger.info("Login_TC_ID_6CheckPassingIncorrectEmailAndInValidPassword test cases failed");
	    		captureScreen(driver,"Login_TC_ID_5CheckPassingIncorrectEmailAndValidPassword");
	        }
		
		
	}
	
@Test (priority=7)
	public void Login_TC_ID_8CheckPassingcorrectEmailAndInValidPassword() throws InterruptedException, IOException {
	
	logger.info("Login_TC_ID_8CheckPassingcorrectEmailAndInValidPassword test cases started");

	driver.findElement(home.email).clear();
	driver.findElement(home.passWord).clear();
	driver.findElement(home.email).sendKeys("vishal@indusnet.co.in");
	driver.findElement(home.passWord).sendKeys("eGain@123");

	driver.findElement(home.LogInbtn).click();

	Thread.sleep(1000);
	 String alerttextemailpass = driver.findElement(home.incorrectEmailAlert).getText();
		
		if(home.e.equals(alerttextemailpass)){
	        System.out.println("Pass");
	        
	        logger.info("Login_TC_ID_8CheckPassingcorrectEmailAndInValidPassword test cases Passed");
			captureScreen(driver,"Login_TC_ID_5CheckPassingIncorrectEmailAndValidPassword");
	    }
	        else {
	            System.out.println("Fail");
	    		captureScreen(driver,"Login_TC_ID_8CheckPassingcorrectEmailAndInValidPassword");
	    		logger.info("Login_TC_ID_8CheckPassingcorrectEmailAndInValidPassword test cases Failed");

	        }
		
	}
	
@Test (priority=8)
	public void Login_TC_ID_9CheckPasswordLessThanEightChar() throws InterruptedException, IOException {
	
	driver.findElement(home.email).clear();
	driver.findElement(home.passWord).clear();
	driver.findElement(home.email).sendKeys("vishalk.singh@indusnet.co.in");
	driver.findElement(home.passWord).sendKeys("eGain");
	driver.findElement(home.LogInbtn).click();

	Thread.sleep(1000);
	 String alerttextemailpass = driver.findElement(home.incorrectEmailAlert).getText();
		
		
		if(home.e.equals(alerttextemailpass)){
	        System.out.println("Pass");
	        logger.info("Login_TC_ID_9CheckPasswordLessThanEightChar test cases Passed");
			captureScreen(driver,"Login_TC_ID_9CheckPasswordLessThanEightChar");
	    }
	        else {
	            System.out.println("Fail");
	            logger.info("Login_TC_ID_9CheckPasswordLessThanEightChar test cases Failed");
	    		captureScreen(driver,"Login_TC_ID_9CheckPasswordLessThanEightChar");
	        }
	
	}
	
   @Test (priority=9)
	public void Login_TC_ID_11CheckForgotPasswordlink() throws IOException {
	
		 WebElement forgpass = driver.findElement(home.forgotPasswordLnk);

	   Assert.assertEquals(true, forgpass.isDisplayed());
	   logger.info("Login_TC_ID_11CheckForgotPasswordlink test cases Passed");
		captureScreen(driver,"Login_TC_ID_11CheckForgotPasswordlink");

		//Assert.assertTrue(login.IsDisplayedForgitPassLink());

	}
	@Test (priority=10)
	public void Login_TC_ID_12CheckSignUpButton() throws IOException {
	
		WebElement signupbtn = driver.findElement(home.signUpbtn);

		   Assert.assertEquals(true, signupbtn.isDisplayed());
		   
		   logger.info("Login_TC_ID_12CheckSignUpButton test cases Passed");
			captureScreen(driver,"Login_TC_ID_12CheckSignUpButton");
		
	
	}
	/*@Test (priority=11)
	public void Login_TC_ID_13CheckBehaviourOfSignUpbutton() {
	
		
		Assert.assertTrue(login.IsDisplayedSignUpbtn());

		
	
	}*/
	@Test (priority=12)
	public void Login_TC_ID_10LoggedIn() throws IOException {
	

		driver.findElement(home.email).clear();
		driver.findElement(home.passWord).clear();
		driver.findElement(home.email).sendKeys("vishalk.singh@indusnet.co.in");
		driver.findElement(home.passWord).sendKeys("eGain@123");
		driver.findElement(home.LogInbtn).click();

		
		
String k=  driver.getTitle();
		System.out.println(driver.getTitle());
	
		
		if(driver.getTitle().equals(k))
		{
			
			Assert.assertTrue(true);
			

			logger.info("Login test passed");
			logger.info("Login_TC_ID_10LoggedIn test cases Passed");
			captureScreen(driver,"Login_TC_ID_10LoggedIn");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
			captureScreen(driver,"Login_TC_ID_10LoggedIn");

		}
	}
		
	
}
