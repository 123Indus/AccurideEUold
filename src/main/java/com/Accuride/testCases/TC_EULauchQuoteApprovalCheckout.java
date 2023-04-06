package com.Accuride.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Accuride.pageObjects.ProccedToQuotePage;

public class TC_EULauchQuoteApprovalCheckout extends BaseClass{
	
	ProccedToQuotePage cart = new ProccedToQuotePage(driver);


	@Test (priority=1)
	public void EU_TC_ID_2_Login() throws Exception{
		
         logger.info("Login");
		
		captureScreen(driver,"Login");
		
		driver.findElement(cart.loginsignUpbtn).click();

			Thread.sleep(8000);
			
			driver.findElement(cart.emailnew).sendKeys("vishalk.singh@indusnet.co.in");
			driver.findElement(cart.passWordnew).sendKeys("eGain@123");
			driver.findElement(cart.LogInbtnnew).click();

		
		   logger.info("Login test cases is Passed");
			
			captureScreen(driver,"Loginw");
             
	}
	
	@Test (priority=2)
	public void EU_TC_ID_3_verify_by_clicking_My_quote() throws Exception{
		
logger.info("verify_myQuote_button");


		
		captureScreen(driver,"verify_myQuote_button");
     
  


	 Thread.sleep(5000);
	 
	  
     WebElement myQuotebtn = driver.findElement(cart.myQuote); 
     
	   Assert.assertEquals(true, myQuotebtn.isDisplayed());


	   JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", myQuotebtn);

	 
	
  

		
		//element.click();
		 Thread.sleep(1000);
		 logger.info("my Quote button verified successfully");
			
			captureScreen(driver,"verify_by_");


         System.out.println("2 is pass");
		
	}
	
	@Test (priority=3)
	public void EU_TC_ID_4_verify_by_clicking_Action_menu() throws Exception{
		
logger.info("verify_by_clicking_Action_menu");

	captureScreen(driver,"verify_by_clicking_Action_menu");
		
  WebElement actionMenu = driver.findElement(cart.action2); 
  
  actionMenu.click();
  logger.info("Action_menu clicked and verified");
	
	captureScreen(driver,"verify_");

	}
	
	@Test (priority=4)
	public void EU_TC_ID_5_verify_by_clicking_viewQuote_button() throws Exception{
		
logger.info("verify_by_clicking_viewQuote_button");

	captureScreen(driver,"verify_by_clicking_viewQuote_button");
		
  WebElement viewQuotebtn = driver.findElement(cart.viewQuote); 
  
  viewQuotebtn.click();

  logger.info("view Quote button clicked and verified");
	
 	captureScreen(driver,"verify_");

	}
	
	@Test (priority=5)
	public void EU_TC_ID_6_verify_by_clicking_AcceptandCheckout_button() throws Exception{
		
logger.info("verify_by_clicking_AcceptandCheckout_button");

	captureScreen(driver,"verify_by_clicking_AcceptandCheckout_button");
		
	   WebElement acceptChckoutBtn = driver.findElement(cart.acceptCheckout); 
	   
	   
	   acceptChckoutBtn.click();
	   List<WebElement> replaceItem = driver.findElements(cart.repaceItem);
	   
	   if (replaceItem.size() > 0)
	   {
		  
		   replaceItem.get(0).click();
		   
	   }

  
 
	   
	   logger.info("Accept and checkout button clicked and verified");
		
	 	captureScreen(driver,"newpath");


	}
	@Test (priority=6)
	public void EU_TC_ID_7_verify_by_clicking_Proceed_to_checkout_button() throws Exception{
		
		
logger.info("verify_by_clicking_Proceed_to_checkout_button");
		
		captureScreen(driver,"verify_by_clicking_Proceed_to_checkout_button");
		
WebElement element = driver.findElement(cart.proceedToPaymnt); 

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", element);
		
		 Thread.sleep(1000);

		 logger.info("verify_by_clicking_Proceed_to_checkout_button test is passed");
			
			captureScreen(driver,"verify_by_clicking");
		
		
	}
	
	

	@Test (priority=35)
	public void EU_TC_ID_50_Add_card_detail() throws Exception{
		
logger.info("Add_card_detail");
		
		captureScreen(driver,"Add_card_detail");
		
WebElement SepaPaymentbtn = driver.findElement(cart.sepaBtn); 

SepaPaymentbtn.click();
		
Thread.sleep(1000);


driver.switchTo().frame(1);
Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='iban']")).sendKeys("DE89 3704 0044 0532 0130 00");
		
		//driver.findElement(By.xpath("//input[@name='exp-date']")).sendKeys("1224");

		//driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("123");

		driver.switchTo().defaultContent(); // you are now outside both frames

	
			 logger.info("Add_card_detail test is passed");
				
				captureScreen(driver,"Add_card_detaili");

			 Thread.sleep(1000);

	}
	
	
	@Test (priority=36)
	public void EU_TC_ID_51_select_Term_and_condition() throws Exception{
		
logger.info("select_Term_and_condition");
		
		captureScreen(driver,"select_Term_and_condition");
		
WebElement termAndConditionbtn = driver.findElement(cart.termAndCondition3); 
		            
       	 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", termAndConditionbtn);
		 
			 Thread.sleep(1000);
			 logger.info("select_Term_and_condition test is passed");
				
				captureScreen(driver,"select_Term");
		
	}
	/*
	@Test (priority=37)
	public void EU_TC_ID_58_verify_by_placing_order() throws Exception{
		
logger.info("verify_by_placing_order");
		
		captureScreen(driver,"verify_by_placing_order");
		WebElement placeOrderbutton = driver.findElement(cart.placeOrderbtnSepaQuote); 
		
		placeOrderbutton.click();
		 Thread.sleep(1000);
		 logger.info("verify_by_placing_order test is passed");
			
			captureScreen(driver,"verify_by_placing_orde");

		
	}

*/  
}
