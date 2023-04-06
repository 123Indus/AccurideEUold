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

public class TC_QuoteApprovalCheckout extends BaseClass{
	
	ProccedToQuotePage cart = new ProccedToQuotePage(driver);

	@Test (priority=0)
	public void ProceedToQuote_TC_ID_1_Login() throws Exception{
		
         logger.info("Login");
		
		captureScreen(driver,"Login");
		
		driver.findElement(cart.loginsignUpbtn).click();

			Thread.sleep(8000);
			
			driver.findElement(cart.emailnew).sendKeys("vishalk.singh+1@indusnet.co.in");
			driver.findElement(cart.passWordnew).sendKeys("eGain@123");
			driver.findElement(cart.LogInbtnnew).click();

		
		   logger.info("Login test cases is Passed");
			
			captureScreen(driver,"Loginw");
             System.out.println("0 is pass");
	}
	
	@Test (priority=1)
	public void ProceedToQuote_TC_ID_1_verify_by_clicking_My_quote() throws Exception{
		
logger.info("verify_myQuote_button");


		
		captureScreen(driver,"verify_myQuote_button");
     
  


	 Thread.sleep(5000);
	 
	  
     WebElement myQuotebtn = driver.findElement(cart.myQuote); 
     
	   Assert.assertEquals(true, myQuotebtn.isDisplayed());


	   JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", myQuotebtn);

	    System.out.println("check 123");
	
  

		
		//element.click();
		 Thread.sleep(1000);
		 logger.info("my Quote button verified successfully");
			
			captureScreen(driver,"verify_by_");


         System.out.println("2 is pass");
		
	}
	
	@Test (priority=2)
	public void ProceedToQuote_TC_ID_3_verify_by_clicking_Action_menu() throws Exception{
		
logger.info("verify_by_clicking_Action_menu");

	captureScreen(driver,"verify_by_clicking_Action_menu");
		
  WebElement actionMenu = driver.findElement(cart.action); 
 // WebElement viewQuotebtn = driver.findElement(cart.viewQuote); 
  
  actionMenu.click();
 // viewQuotebtn.click();
  logger.info("Action_menu clicked and verified");
	
	captureScreen(driver,"verify_");

	}
	
	@Test (priority=3)
	public void ProceedToQuote_TC_ID_4_verify_by_clicking_viewQuote_button() throws Exception{
		
logger.info("verify_by_clicking_viewQuote_button");

	captureScreen(driver,"verify_by_clicking_viewQuote_button");
		
 // WebElement actionMenu = driver.findElement(cart.action); 
  WebElement viewQuotebtn = driver.findElement(cart.viewQuote); 
  
  //actionMenu.click();
  viewQuotebtn.click();

  logger.info("view Quote button clicked and verified");
	
 	captureScreen(driver,"verify_");

	}
	
	@Test (priority=4)
	public void ProceedToQuote_TC_ID_5_verify_by_clicking_AcceptandCheckout_button() throws Exception{
		
logger.info("verify_by_clicking_AcceptandCheckout_button");

	captureScreen(driver,"verify_by_clicking_AcceptandCheckout_button");
		
 // WebElement actionMenu = driver.findElement(cart.action); 
	   WebElement acceptChckoutBtn = driver.findElement(cart.acceptCheckout); 
	   
	   
	   acceptChckoutBtn.click();
	   List<WebElement> replaceItem = driver.findElements(cart.repaceItem);
	   
	   if (replaceItem.size() > 0)
	   {
		  
		   replaceItem.get(0).click();
		   
	   }

  
  //actionMenu.click();
	  // acceptChckoutBtn.click();
	   
	   logger.info("Accept and checkout button clicked and verified");
		
	 	captureScreen(driver,"newpath");


	}
/*	
	@Test (priority=7)
	public void ProceedToQuote_TC_ID_2_verify_by_clicking_cart_icon() throws Exception{
		
logger.info("verify_by_clicking_cart_icon");
		
		captureScreen(driver,"verify_by_clicking_cart_icon");
		
     WebElement element = driver.findElement(cart.kart); 
	 Thread.sleep(5000);
	 
	  //Actions action = new Actions(driver);
      //action.moveToElement(element).build().perform(); 
		 //Thread.sleep(1000);
	 
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", element);

		
		//element.click();
		 Thread.sleep(1000);
		 logger.info("verify_by_clicking_cart_icon test is passed");
			
			captureScreen(driver,"verify_by_");


         System.out.println("25 is pass");
		
	}
	
/*	@Test (priority=3)
	public void ProceedToQuote_TC_ID_3_Verify_by_clicking_View_and_edit_cart() throws Exception{
		
logger.info("Verify_by_clicking_View_and_edit_cart");
		
		captureScreen(driver,"Verify_by_clicking_View_and_edit_cart");
	
		WebElement element = driver.findElement(cart.viewAndEditCart); 

		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", element);
		
		
	//	element.click();
		 Thread.sleep(1000);

		 logger.info("Verify_by_clicking_View_and_edit_cart test is passed");
			
			captureScreen(driver,"Verify_by_clicking");

         System.out.println("27 is pass");
		
	}
	
	*/
	@Test (priority=5)
	public void ProceedToQuote_TC_ID_4_verify_by_clicking_Proceed_to_checkout_button() throws Exception{
		
		
logger.info("verify_by_clicking_Proceed_to_checkout_button");
		
		captureScreen(driver,"verify_by_clicking_Proceed_to_checkout_button");
		
WebElement element = driver.findElement(cart.proceedToPaymnt); 

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", element);
		
		//element.click();
		 Thread.sleep(1000);

		 logger.info("verify_by_clicking_Proceed_to_checkout_button test is passed");
			
			captureScreen(driver,"verify_by_clicking");

         System.out.println("29 is pass");
		
		
	}
	
	
	@Test (priority=6)
	public void ProceedToQuote_TC_ID_5_Add_card_detail() throws Exception{
		
logger.info("Add_card_detail");
		
		captureScreen(driver,"Add_card_detail");
		
WebElement cardinputfield = driver.findElement(cart.cardDetail); 

cardinputfield.click();
		
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@name='__privateStripeFrame6115']"));
		//driver.switchTo().frame(iframe); 

Thread.sleep(1000);


//WebElement iframe_by_name = driver.findElement(By.xpath("//iframe[@name='__privateStripeFrame1575']"));
driver.switchTo().frame(0);
Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='cardnumber']")).sendKeys("4111111111111111");
		
		driver.findElement(By.xpath("//input[@name='exp-date']")).sendKeys("1224");

		driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("123");

		driver.switchTo().defaultContent(); // you are now outside both frames

	
		


////iframe[@name='__privateStripeFrame4825']

//JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("arguments[0].click();", cardinputfield);

//WebElement iframe_by_name_contains = driver.findElement(By.xpath("//iframe[contains(@name,'__privateStripeFrame')]"));
//driver.switchTo().frame(cardinputfield);

//js.executeScript("arguments[0].value='4111111111111111';", cardinputfield);
//js.executeScript("arguments[0].value='1123';", cardinputfield);
//js.executeScript("arguments[0].value='333';", cardinputfield);

//driver.findElement(By.className("InputContainer")).sendKeys("4111111111111111");
		
//WebDriverWait wait = new WebDriverWait(driver, 10);
 //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@name='__privateStripeFrame6115']")));
 //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='cardnumber']"))).sendKeys("4111111111111111");
//driver.findElement(By.id("Passwd")).sendKeys("xyz");

//cardinputfield.sendKeys("4111111111111111");

//js.executeScript("arguments[0].value='4111111111111111';", cardinputfield);

//iframe_by_name.sendKeys("1123");
//iframe_by_name.sendKeys("333");
			// Thread.sleep(1000);
			 logger.info("Add_card_detail test is passed");
				
				captureScreen(driver,"Add_card_detaili");

	         System.out.println("35 is pass");
			 Thread.sleep(1000);

	}
	
	
	@Test (priority=7)
	public void ProceedToQuote_TC_ID_6_select_Term_and_condition() throws Exception{
		
logger.info("select_Term_and_condition");
		
		captureScreen(driver,"select_Term_and_condition");
		
WebElement termAndConditionbtn = driver.findElement(cart.termAndCondition); 
		
            //termAndConditionbtn.click();
            
       	 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", termAndConditionbtn);
		 
			 Thread.sleep(1000);
			 logger.info("select_Term_and_condition test is passed");
				
				captureScreen(driver,"select_Term");


	         System.out.println("36 is pass");
		
	}
	
	@Test (priority=8)
	public void ProceedToQuote_TC_ID_7_verify_by_placing_order() throws Exception{
		
logger.info("verify_by_placing_order");
		
		captureScreen(driver,"verify_by_placing_order");
		WebElement placeOrderbutton = driver.findElement(cart.placeOrderbtn); 
		
		placeOrderbutton.click();
		 Thread.sleep(1000);
		 logger.info("verify_by_placing_order test is passed");
			
			captureScreen(driver,"verify_by_placing_orde");

         System.out.println("37 is pass");
	
		
		
	}

}
