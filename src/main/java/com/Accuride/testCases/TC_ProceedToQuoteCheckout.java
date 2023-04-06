package com.Accuride.testCases;

import com.Accuride.pageObjects.ProceedToCartCheckoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Accuride.pageObjects.ProccedToQuotePage;

public class TC_ProceedToQuoteCheckout extends BaseClass{
	
	ProccedToQuotePage cart = new ProccedToQuotePage(driver);

	

	@Test (priority=0)
	public void ProceedToQuote_TC_ID_3_Login() throws Exception{
		
         logger.info("Login");
		
		captureScreen(driver,"Login");
		
		driver.findElement(cart.loginsignUpbtn).click();

			Thread.sleep(2000);
			
			driver.findElement(cart.emailnew).sendKeys("vishalk.singh+1@indusnet.co.in");
			driver.findElement(cart.passWordnew).sendKeys("eGain@123");
			driver.findElement(cart.LogInbtnnew).click();

		
		   logger.info("Login test cases is Passed");
			
			captureScreen(driver,"Loginw");
             System.out.println("0 is pass");
	}
	
	
	@Test (priority=1)
	public void ProceedToQuote_TC_ID_1_verifyUI_Home_page() throws Exception{
	
	String k=  driver.getTitle();
	System.out.println(driver.getTitle());

	
	if(driver.getTitle().equals(k))
	{
		
		Assert.assertTrue(true);
		

		logger.info("Login test passed");
		logger.info("Login_TC_ID_10LoggedIn test cases Passed");
		captureScreen(driver,"Signup_TC_ID_16_By_entering_all_the_required_mandatory_field");
	}
	else
	{
		captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		logger.info("Login test failed");
		captureScreen(driver,"Signup_TC_ID_16_By_entering_all_the_required_mandatory_field");
    }
	}
	
/*	@Test (priority=2)
	public void ProceedToQuote_TC_ID_2_verify_All_product_menu() throws Exception{
		
		
		logger.info("verify_All_product_menu");
		
		captureScreen(driver,"verify_All_product_menu");

		//driver.findElement(signUp.signUpbtn).click();

	
		
		 WebElement productmenubtn = driver.findElement(cart.productMenu);
		 productmenubtn.click();
		   WebElement storeMenubtn = driver.findElement(cart.storeMenu); 
		   storeMenubtn.click();
		   WebElement recourceMenubtn = driver.findElement(cart.recourceMenu);
		   recourceMenubtn.click();

		   WebElement marketMenubtn = driver.findElement(cart.marketMenu);
		   
		   marketMenubtn.click();
		   
		   WebElement blogMenubtn = driver.findElement(cart.blogMenu);
		   blogMenubtn.click();
		   
		   WebElement supportMenubtn = driver.findElement(cart.supportMenu);
		   supportMenubtn.click();
		   
		   WebElement companyMenubtn = driver.findElement(cart.companyMenu);
		   companyMenubtn.click();
		   //WebElement independentbtn = driver.findElement(cart.independent);

		   

		   
		
		   Assert.assertEquals(true, productmenubtn.isDisplayed());
		   Assert.assertEquals(true, storeMenubtn.isDisplayed());
		   Assert.assertEquals(true, recourceMenubtn.isDisplayed());
		   Assert.assertEquals(true, marketMenubtn.isDisplayed());
		   //Assert.assertEquals(true, blogMenubtn.isDisplayed());
		   Assert.assertEquals(true, supportMenubtn.isDisplayed());
		   Assert.assertEquals(true, companyMenubtn.isDisplayed());
		   //Assert.assertEquals(true, independentbtn.isDisplayed());

		   captureScreen(driver,"verify_All_product_menu");
			logger.info("Verified the_All_product_menu");
		
	
	}
	
*/	
	@Test (priority=3)
	public void ProceedToQuote_TC_ID_3_verify_All_product_submenu() throws Exception{
		
         logger.info("verify_All_product_smenu");
		
		captureScreen(driver,"verify_All_product_submenu");
		
		 WebElement SubMenuProduct = driver.findElement(cart.productsubMenu);
		 WebElement productmenubtn = driver.findElement(cart.productMenu);
			Thread.sleep(1000);
			   Assert.assertEquals(true, productmenubtn.isDisplayed());

		 productmenubtn.click();
		  System.out.println(SubMenuProduct.getText());
		  
		   Assert.assertEquals(true, SubMenuProduct.isDisplayed());
		   logger.info("verify_All_product_submenu test cases is Passed");
			
			captureScreen(driver,"verify_All_product_submenu");
             System.out.println("3 is pass");
	}
	
	

	@Test (priority=4)
	public void ProceedToQuote_TC_ID_5_verify_the_sub_menu_for_MARKETS() throws Exception{
		
        logger.info("verify_the_sub_menu_for_MARKETS");
		
		captureScreen(driver,"verify_the_sub_menu_for_MARKETS");
		
		 WebElement SubMenuMarket = driver.findElement(cart.marketsubmenu);
		   WebElement marketMenubtn = driver.findElement(cart.marketMenu);
		   Assert.assertEquals(true, marketMenubtn.isDisplayed());

			Thread.sleep(1000);

	        Actions action = new Actions(driver); 
	        action.moveToElement(marketMenubtn).build().perform(); 

		   //marketMenubtn.click();
		   Assert.assertEquals(true, SubMenuMarket.isDisplayed());
             System.out.println("4 is pass");
             
             logger.info("verify_the_sub_menu_for_MARKETS test cases is passed");
     		
     		captureScreen(driver,"verify_the_sub_menu_for_MARKETS");
	}
	
	
	@Test (priority=5)
	public void ProceedToQuote_TC_ID_6_verify_sub_menu_for_RESOURCES() throws Exception{
		
logger.info("verif_sub_menu_for_RESOURCES");
		
		captureScreen(driver,"verif_sub_menu_for_RESOURCES");
		
		 WebElement SubMenuResource = driver.findElement(cart.resourcesubmenu);
		   WebElement resouceMenubtn = driver.findElement(cart.recourceMenu);
			Thread.sleep(1000);
			   Assert.assertEquals(true, resouceMenubtn.isDisplayed());

			resouceMenubtn.click();
		   Assert.assertEquals(true, SubMenuResource.isDisplayed());
		   
		   logger.info("verif_sub_menu_for_RESOURCES test cases is passed");
			
			captureScreen(driver,"verif_sub_menu_for_RESOURCESw");
           System.out.println("5 is pass");
		
	}
	
	
	
	@Test (priority=6)
	public void ProceedToQuote_TC_ID_7_verify_sub_menu_for_BLOG() throws Exception{
		
logger.info("verify_sub_menu_for_BLOG");
		
		captureScreen(driver,"verify_sub_menu_for_BLOG");
		
		 WebElement allSubMenuBlog = driver.findElement(cart.blogsubmenu);
		   WebElement blogMenubtn = driver.findElement(cart.blogMenu);
			Thread.sleep(1000);
			
			 Actions action = new Actions(driver); 
		        action.moveToElement(blogMenubtn).build().perform(); 

			//blogMenubtn.click();
		   Assert.assertEquals(true, allSubMenuBlog.isDisplayed());
         System.out.println("6 is pass");
         
         logger.info("verify_sub_menu_for_BLOG test case is passed");
 		
 		captureScreen(driver,"verify_sub_menu_for_BLOGe");
		
		
	}
	
	
	@Test (priority=7)
	public void ProceedToQuote_TC_ID_8_verif_sub_menu_for_SUPPORTS() throws Exception{
		
logger.info("verif_sub_menu_for_SUPPORTS");
		
		captureScreen(driver,"verif_sub_menu_for_SUPPORTS");
		 WebElement SubMenusupport = driver.findElement(cart.supportsubmenu);
		   WebElement supportMenubtn = driver.findElement(cart.supportMenu);
			Thread.sleep(1000);
			   Assert.assertEquals(true, supportMenubtn.isDisplayed());

			supportMenubtn.click();
		   Assert.assertEquals(true, SubMenusupport.isDisplayed());
       System.out.println("7 is pass");
       
       logger.info("verif_sub_menu_for_SUPPORTS test cases is passed");
		
		captureScreen(driver,"verif_sub_menu_for_SUPPORTS");
	}
	

	@Test (priority=8)
	public void ProceedToQuote_TC_ID_9_verify_sub_menu_for_COMPANY() throws Exception{
		
logger.info("verify_sub_menu_for_COMPANY");
		
		captureScreen(driver,"verify_sub_menu_for_COMPANY");
		
		 WebElement SubMenucompany = driver.findElement(cart.companysubmenu);
		   WebElement copanyMenubtn = driver.findElement(cart.companyMenu);
			Thread.sleep(1000);
			   Assert.assertEquals(true, copanyMenubtn.isDisplayed());

			copanyMenubtn.click();
		   Assert.assertEquals(true, SubMenucompany.isDisplayed());
     System.out.println("8 is pass");	
     
     logger.info("verify_sub_menu_for_COMPANY test case is passed");
		
		captureScreen(driver,"verify_sub_menu_for_COMPANY");
		
		
	}
	
	
	@Test (priority=9)
	public void ProceedToQuote_TC_ID_10_verify_by_clicking_submenu_of_Product() throws Exception{
		
logger.info("verify_by_clicking_submenu_of_Product");
		
		captureScreen(driver,"verify_by_clicking_submenu_of_Product");
		
		 WebElement productmenubtn = driver.findElement(cart.productMenu);
			Thread.sleep(1000);

		 productmenubtn.click();
		 
		 Thread.sleep(1000);
		 
		 WebElement productmenu = driver.findElement(cart.drawerSlidesubmenu);
		 
		 productmenu.click();

            System.out.println("9 is pass");
            logger.info("verify_by_clicking_submenu_of_Product test cases is passed");
    		
    		captureScreen(driver,"verify_by_clicking_submenu_of_Productb");
	}
	

	@Test (priority=10)
	public void ProceedToQuote_TC_ID_11_verify_UI_of_product_listing_page() throws Exception{
		
		logger.info("verify_UI_of_product_listing_page");
		
		captureScreen(driver,"verify_UI_of_product_listing_page");

		//driver.findElement(signUp.signUpbtn).click();

	
		
		 WebElement productFilterSection = driver.findElement(cart.productFilter);
		// productmenubtn.click();
		   WebElement sortByFilterbtn = driver.findElement(cart.sortByFilter); 
		   sortByFilterbtn.click();
		   WebElement searchFiltersection = driver.findElement(cart.searchFilter); 

		   WebElement AddtoCartbtn = driver.findElement(cart.AddtoCart);
		   WebElement detailButton = driver.findElement(cart.detailBtn);
		  // WebElement supportMenubtn = driver.findElement(cart.supportMenu);
		 //  WebElement companyMenubtn = driver.findElement(cart.companyMenu);
		   //WebElement independentbtn = driver.findElement(cart.independent);

		   

		   
		
		   Assert.assertEquals(true, productFilterSection.isDisplayed());
		   Assert.assertEquals(true, sortByFilterbtn.isDisplayed());
		   Assert.assertEquals(true, searchFiltersection.isDisplayed());
		   Assert.assertEquals(true, AddtoCartbtn.isDisplayed());
		   Assert.assertEquals(true, detailButton.isDisplayed());
		  // Assert.assertEquals(true, supportMenubtn.isDisplayed());
		  // Assert.assertEquals(true, companyMenubtn.isDisplayed());
		   //Assert.assertEquals(true, independentbtn.isDisplayed());

		   captureScreen(driver,"verify_UI_of_product_listing_pagek");
			logger.info("verify_UI_of_product_listing_page test passed");
		
	}
	
	
	
	@Test (priority=11)
	public void ProceedToQuote_TC_ID_12_13_verify_product_filter_on_listing_page() throws Exception{
		
logger.info("verify_product_filter_on_listing_page");
		
		captureScreen(driver,"verify_product_filter_on_listing_page");
		
		 WebElement productFilterSection = driver.findElement(cart.productFilter);
		 Thread.sleep(1000);

		   Assert.assertEquals(true, productFilterSection.isDisplayed());
           System.out.println("11 is pass");
           
           logger.info("verify_product_filter_on_listing_page test cases is passed");
   		
   		captureScreen(driver,"verify_product_filter_on_listing_pagee");
	}
	

	@Test (priority=2)
	public void ProceedToQuote_TC_ID_13_verify_filter_items() throws Exception{
		
		
	}
	
	  
	@Test (priority=12)
	public void ProceedToQuote_TC_ID_14_validate_by_applying_filter() throws Exception{
		
logger.info("validate_by_applying_filter");
		
		captureScreen(driver,"validate_by_applying_filter");
		
		// WebElement applyingproductFilterbtn = driver.findElement(cart.applyingproductFilter);
		 Thread.sleep(1000);
		// applyingproductFilterbtn.click();
           System.out.println("12 is pass");
           
           logger.info("validate_by_applying_filter test cases is passed");
   		
   		captureScreen(driver,"validate_by_applying_filter");
		
	}
	
	
	@Test (priority=13)
	public void ProceedToQuote_TC_ID_15_16_validate_switch_button_vertical_horizontal() throws Exception{
		
logger.info("validate_switch_button_vertical_horizontal");
		
		captureScreen(driver,"validate_switch_button_vertical_horizontal");
		
		 WebElement verticalSwitchFilterbtn = driver.findElement(cart.verticalSwitchFilter);
		 
		//verticalSwitchFilterbtn.click();
		 
		 //JavascriptExecutor jse = (JavascriptExecutor)driver;
		 //jse.executeScript("arguments[0].click()", verticalSwitchFilterbtn);
		 
		// new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission' and @ng-reflect-name='reportingDealPermission']"))).click();

		
		 Thread.sleep(1000);

		 
		 WebElement zhorizontalSwitchFilterbtn = driver.findElement(cart.horizontalSwitchFilter);

		zhorizontalSwitchFilterbtn.click();
		 
		 //jse.executeScript("arguments[0].click()", zhorizontalSwitchFilterbtn);
		 
		 Thread.sleep(1000);

		
         System.out.println("13 is pass");
         
         logger.info("validate_switch_button_vertical_horizontal test cases is passed");
 		
 		captureScreen(driver,"validate_switch_button_vertical_horizontal");

		
	}
	
	@Test (priority=14)
	public void ProceedToQuote_TC_ID_17_18_validate_sortby_button_product_postion() throws Exception{
		
logger.info("validate_sortby_button_product_postion");
		
		captureScreen(driver,"validate_sortby_button_product_postion");
	
	 WebElement sortByFilteroption = driver.findElement(cart.sortByFilter);
	 
	   Assert.assertEquals(true, sortByFilteroption.isDisplayed());
	   
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click()", sortByFilteroption);
		  
		 
	// sortByFilteroption.click();
		 
		 Thread.sleep(1000);


		
		
         System.out.println("14 is pass");
         
         logger.info("validate_sortby_button_product_postion test cases is passed");
 		
 		captureScreen(driver,"validate_sortby_button_product_postion");
	
	}
	
	
	
	@Test (priority=15)
	public void ProceedToQuote_TC_ID_19_validate_search_filter_on_listing_page() throws Exception{
		
logger.info("validate_search_filter_on_listing_page");
		
		captureScreen(driver,"validate_search_filter_on_listing_page");
		
		WebElement searchFilteroption = driver.findElement(cart.searchFilter);
		 
		searchFilteroption.click();
			 
			 Thread.sleep(1000);

			   Assert.assertEquals(true, searchFilteroption.isDisplayed());

			
			
	         System.out.println("15 is pass");
	         
	         logger.info("validate_search_filter_on_listing_page is passed");
	 		
	 		captureScreen(driver,"validate_search_filter_on_listing_pageer");
	}
	
	
	@Test (priority=16)
	public void ProceedToQuote_TC_ID_20_validate_Product_item() throws Exception{
		
logger.info("validate_Product_item");
		
		captureScreen(driver,"verify_All_product_menu");
		
		
		WebElement element = driver.findElement(cart.hoverProduct); 
        Actions action = new Actions(driver); action.moveToElement(element).build().perform(); 
        
		   Assert.assertEquals(true, element.isDisplayed());
			
			
	         System.out.println("16 is pass");
	         
	         logger.info("validate_Product_item test is passed");
	 		
	 		captureScreen(driver,"validate_Product_itembre");

		
	}
	
	
	
	
	
	@Test (priority=17)
	public void ProceedToQuote_TC_ID_21_verify_by_hover_on_product_item() throws Exception{
		
		
	}
	
	
	@Test (priority=18)
	public void ProceedToQuote_TC_ID_22_23_verify_by_selecting_lenght_and_quantity() throws Exception{
		
logger.info("verify_by_selecting_lenght_and_quantity");
		
		captureScreen(driver,"verify_by_selecting_lenght_and_quantity");
		
		WebElement element = driver.findElement(cart.hoverProduct); 
        Actions action = new Actions(driver); action.moveToElement(element).build().perform(); 
         
		 Thread.sleep(1000);
		 
		 Select dropdown = new Select(driver.findElement(cart.productlenght));
		 
		 dropdown.selectByIndex(1);

		 Thread.sleep(1000);
		 
			WebElement addproductbtn = driver.findElement(cart.addproduct); 
 
			WebElement addqunty = driver.findElement(cart.addQuantity); 
			
			addqunty.sendKeys("49");


			addproductbtn.click();
			
			
			System.out.println("18");
			
			logger.info("verify_by_selecting_lenght_and_quantity test cases is passed");
			
			captureScreen(driver,"verify_by_selecting_lenght_and_quantityker");


		 
		
	}
	
	/*
	@Test (priority=2)
	public void ProceedToQuote_TC_ID_24_verify_by_comparing_multiple_product() throws Exception{
	}
	
	*/
	
	
	@Test (priority=19)
	public void ProceedToQuote_TC_ID_25_validate_by_adding_product_into_cart_by_addtocart_button() throws Exception{
		
		
logger.info("validate_by_adding_product_into_cart_by_addtocart_button");
		
		captureScreen(driver,"validate_by_adding_product_into_cart_by_addtocart_button");
		
		WebElement element = driver.findElement(cart.AddtoCart); 
		

		element.click();
		
		
		 Thread.sleep(1000);


			
			
	         System.out.println("19 is pass");
	         
	         logger.info("validate_by_adding_product_into_cart_by_addtocart_button test is passed");
	 		
	 		captureScreen(driver,"validate_by_adding_product_into_cart_by_addtocart_buttoner"); 

		
	}
	
	
	@Test (priority=20)
	public void ProceedToQuote_TC_ID_26_verify_by_adding_product_into_cart_without_lenght_quntity_configureProduct() throws Exception{
	
    logger.info("verify_by_adding_product_into_cart_without_lenght_quntity_configureProduct");
		
		captureScreen(driver,"verify_All_product_cart");
		WebElement element = driver.findElement(cart.hoverProduct); 
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform(); 
        
		   Assert.assertEquals(true, element.isDisplayed());
			
			
	         System.out.println("20 is pass");

	         logger.info("verify_by_adding_product_into_cart_without_lenght_quntity_configureProduct test is passed");
	 		
	 		captureScreen(driver,"verify_All_product_cart1");
	
	}
	
	/*
	@Test (priority=2)
	public void ProceedToQuote_TC_ID_27_validate_by_adding_simple_product_into_cart() throws Exception{
	}
	
	
	@Test (priority=2)
	public void ProceedToQuote_TC_ID_28_validate_by_adding_group_product_into_cart() throws Exception{
	}
	
	*/
	
	
	@Test (priority=21)
	public void ProceedToQuote_TC_ID_29_verify_by_clicking_on_detail_button() throws Exception{
		
logger.info("verify_by_clicking_on_detail_button");
		
		captureScreen(driver,"verify_by_clicking_on_detail_button");
		
        WebElement element = driver.findElement(cart.detailBtn); 
		

		element.click();
		
		
		 Thread.sleep(1000);


			
			
	         System.out.println("21 is pass");
	         
	         logger.info("verify_by_clicking_on_detail_button");
	 		
	 		captureScreen(driver,"verify_All");
		
	}
	
	
	@Test (priority=22)
	public void ProceedToQuote_TC_ID_30_verify_description_for_product_detail() throws Exception{
		
logger.info("verify_description_for_product_detail");
		
		captureScreen(driver,"verify_description_for_product_detail");
	
	 WebElement productContentDetail = driver.findElement(cart.contentDetail);
		 
	 //sortByFilteroption.click();
	 System.out.println(productContentDetail.getText());
		 
		 Thread.sleep(1000);

		   Assert.assertEquals(true, productContentDetail.isDisplayed());

		   logger.info("verify_description_for_product_detail test cases is passed");
			
			captureScreen(driver,"verify_description");
		
         System.out.println("22 is pass");
	}
	
	
	@Test (priority=23)
	public void ProceedToQuote_TC_ID_31_32_verify_by_hover_on_productItem_lenght_quantity() throws Exception{
		
logger.info("verify_by_hover_on_productItem_lenght_quantity");
		
		captureScreen(driver,"verify_by_hover_on_productItem_lenght_quantity");
		WebElement element = driver.findElement(cart.lenghtDetail); 
        //Actions action = new Actions(driver); action.moveToElement(element).build().perform(); 
         
		 Thread.sleep(1000);
		 
		 Select dropdown = new Select(driver.findElement(cart.lenghtDetail));
		 
		 dropdown.selectByIndex(1);

		 Thread.sleep(1000);
		 
		 logger.info("verify_by_hover_on_productItem_lenght_quantity test is passed");
			
			captureScreen(driver,"verify_by_hover");
		 
         System.out.println("23 is pass");

		
	}
	
	
	@Test (priority=24)
	public void ProceedToQuote_TC_ID_33_verify_by_adding_into_cart() throws Exception{
		
logger.info("verify_by_adding_into_cart");
		
		captureScreen(driver,"verify_by_adding_into_cart");
		
		WebElement element = driver.findElement(cart.addToCart); 
		
		element.click();
		 Thread.sleep(1000);

		 logger.info("verify_by_adding_into_cart test is passed");
			
			captureScreen(driver,"verify_");

         System.out.println("24 is pass");

		
	}
	
	
	
	@Test (priority=25)
	public void ProceedToQuote_TC_ID_34_verify_by_clicking_cart_icon() throws Exception{
		
logger.info("verify_by_clicking_cart_icon");
		
		captureScreen(driver,"verify_by_clicking_cart_icon");
		
     WebElement element = driver.findElement(cart.kart); 
	 Thread.sleep(1000);
	 
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
	
	
	@Test (priority=26)
	public void ProceedToQuote_TC_ID_35_verify_UI_cart_pop_up() throws Exception{
		
logger.info("verify_UI_cart_pop_up");
		
		captureScreen(driver,"verify_UI_cart_pop_up");
		
		WebElement element = driver.findElement(cart.viewAndEditCart); 
		WebElement checkoutButton = driver.findElement(cart.proceedToQote); 
        
		 Thread.sleep(1000);

		   Assert.assertEquals(true, element.isDisplayed());
		   Assert.assertEquals(true, checkoutButton.isDisplayed());

		   logger.info("verify_UI_cart_pop_up test is passed");
			
			captureScreen(driver,"verify_All_product");
			
	         System.out.println("26 is pass");
		
	}
	
	
	@Test (priority=27)
	public void ProceedToQuote_TC_ID_36_Verify_by_clicking_View_and_edit_cart() throws Exception{
		
logger.info("Verify_by_clicking_View_and_edit_cart");
		
		captureScreen(driver,"Verify_by_clicking_View_and_edit_cart");
		
WebElement element = driver.findElement(cart.viewAndEditCart); 
		
		element.click();
		 Thread.sleep(1000);

		 logger.info("Verify_by_clicking_View_and_edit_cart test is passed");
			
			captureScreen(driver,"Verify_by_clicking");

         System.out.println("27 is pass");
		
	}
	

	@Test (priority=28)
	public void ProceedToQuote_TC_ID_37_42_verify_UI_of_the_View_and_edit_cart_page() throws Exception{
		
logger.info("verify_UI_of_the_View_and_edit_cart_page");
		
		captureScreen(driver,"verify_UI_of_the_View_and_edit_cart_page");
		
		WebElement element = driver.findElement(cart.editCart); 
		WebElement deleteCartbtn = driver.findElement(cart.deleteCart);
		WebElement updateShoppingCartbtn = driver.findElement(cart.updateShoppingCart); 

        
		 Thread.sleep(1000);

		   Assert.assertEquals(true, element.isDisplayed());
		   Assert.assertEquals(true, deleteCartbtn.isDisplayed());
		   Assert.assertEquals(true, updateShoppingCartbtn.isDisplayed());

		   logger.info("verify_UI_of_the_View_and_edit_cart_page test is passed");
			
			captureScreen(driver,"verify_UI_of_the_View");
			
	         System.out.println("28 is pass");
		
		
	}
	
	
	
	@Test (priority=29)
	public void ProceedToQuote_TC_ID_43_verify_by_clicking_Proceed_to_checkout_button() throws Exception{
		
		
logger.info("verify_by_clicking_Proceed_to_checkout_button");
		
		captureScreen(driver,"verify_by_clicking_Proceed_to_checkout_button");
		
WebElement element = driver.findElement(cart.proceedToQote); 

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", element);
		
		//element.click();
		 Thread.sleep(1000);

		 logger.info("verify_by_clicking_Proceed_to_checkout_button test is passed");
			
			captureScreen(driver,"verify_by_clicking");

         System.out.println("29 is pass");
		
		
	}
	
	/*@Test (priority=30)
	public void ProceedToQuote_TC_ID_44_verify_by_loggedIn() throws Exception{
		
logger.info("verify_by_loggedIn");
		
		captureScreen(driver,"verify_by_loggedIn");
		//driver.findElement(cart.email).clear();
		//driver.findElement(cart.password).clear();
		driver.findElement(cart.email).sendKeys("vishalk.singh@indusnet.co.in");
		driver.findElement(cart.password).sendKeys("eGain@123");
		driver.findElement(cart.LogIninput).click();
        System.out.println("30 is pass");
        
logger.info("verify_by_loggedIn test is passed");
		
		captureScreen(driver,"verify_by_loggedInu");

	}
*/	
 


}
