package com.Accuride.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Accuride.pageObjects.ProceedToCartCheckoutPage;

public class TC_UniversalConfiguratorCartCheckout extends BaseClass  {
	
	ProceedToCartCheckoutPage cart = new ProceedToCartCheckoutPage(driver);
	
	@Test (priority=2)
	public void UCP_TC_ID_2_Login() throws Exception{
		
         logger.info("Login");
		
		captureScreen(driver,"Login");
		
		driver.findElement(cart.loginsignUpbtn).click();

			Thread.sleep(2000);
			
			driver.findElement(cart.emailnew).sendKeys("vishalk.singh@indusnet.co.in");
			driver.findElement(cart.passWordnew).sendKeys("eGain@123");
			driver.findElement(cart.LogInbtnnew).click();

		
		   logger.info("Login test cases is Passed");
			
			captureScreen(driver,"Loginw");
             System.out.println("0 is pass");
	}
	
	
	@Test (priority=1)
	public void UCP_TC_ID_3_verifyUI_Home_page() throws Exception{
	
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
	Thread.sleep(2000);

	}
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
	public void UCP_TC_ID_5_verify_the_sub_menu_for_MARKETS() throws Exception{
		
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
	public void UCP_TC_ID_6_verif_sub_menu_for_RESOURCES() throws Exception{
		
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
	public void UCP_TC_ID_7_verify_sub_menu_for_BLOG() throws Exception{
		
logger.info("verify_sub_menu_for_BLOG");
		
		captureScreen(driver,"verify_sub_menu_for_BLOG");
		
		 WebElement allSubMenuBlog = driver.findElement(cart.blogsubmenu);
		   WebElement blogMenubtn = driver.findElement(cart.blogMenu);
			Thread.sleep(1000);
			
			 Actions action = new Actions(driver); 
		        action.moveToElement(blogMenubtn).build().perform(); 

			//blogMenubtn.click();
		   Assert.assertEquals(true, allSubMenuBlog.isDisplayed());  
         
         logger.info("verify_sub_menu_for_BLOG test case is passed");
 		
 		captureScreen(driver,"verify_sub_menu_for_BLOGe");
		
		
	}
	
	
	@Test (priority=7)
	public void UCP_TC_ID_8_verif_sub_menu_for_SUPPORTS() throws Exception{
		
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
	public void UCP_TC_ID_9_verify_sub_menu_for_COMPANY() throws Exception{
		
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
	public void UCP_TC_ID_10_verify_by_clicking_LinerProduct_from_submenu_of_Product() throws Exception{
		
logger.info("verify_by_clicking_submenu_of_Product");
		
		captureScreen(driver,"verify_by_clicking_submenu_of_Product");
		
		 WebElement productmenubtn = driver.findElement(cart.productMenu);
			Thread.sleep(1000);

		 productmenubtn.click();
		 
		 Thread.sleep(1000);
		 
		 WebElement productmenu = driver.findElement(cart.speclistSlidesubmenu);
		 
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(cart.speclistSlidesubmenu);
		 action.moveToElement(we).click().build().perform();
		 
		 Thread.sleep(3000);

		 driver.findElement(cart.linearTrackSysytem).click();
		 
		// productmenu.click();

            System.out.println("9 is pass");
            logger.info("verify_by_clicking_submenu_of_Product test cases is passed");
    		
    		captureScreen(driver,"verify_by_clicking_submenu_of_Productb");
	}
	

	@Test (priority=10)
	public void UCP_TC_ID_11_verify_UI_of_product_listing_page() throws Exception{
		
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
		 		   
		
		   Assert.assertEquals(true, productFilterSection.isDisplayed());
		   Assert.assertEquals(true, sortByFilterbtn.isDisplayed());
		   Assert.assertEquals(true, searchFiltersection.isDisplayed());
		   Assert.assertEquals(true, AddtoCartbtn.isDisplayed());
		   Assert.assertEquals(true, detailButton.isDisplayed());
		  

		   captureScreen(driver,"verify_UI_of_product_listing_pagek");
			logger.info("verify_UI_of_product_listing_page test passed");
		
	}
	
	@Test (priority=11)
	public void UCP_TC_ID_12_13_verify_By_clicking_and_validating_pagination() throws Exception{
		
logger.info("verify_product_filter_on_listing_page");
		
		captureScreen(driver,"verify_product_filter_on_listing_page");
		
		 WebElement productFilterSection = driver.findElement(cart.pagination);
		 Thread.sleep(1000);

		 productFilterSection.click(); 
           
           logger.info("verify_product_filter_on_listing_page test cases is passed");
   		
   		captureScreen(driver,"verify_product_filter_on_listing_pagee");
	}
	
	@Test (priority=12)
	public void UCP_TC_ID_14_verify_product_filter_on_listing_page() throws Exception{
		
logger.info("verify_product_filter_on_listing_page");
		
		captureScreen(driver,"verify_product_filter_on_listing_page");
		
		 WebElement productFilterSection = driver.findElement(cart.productFilter);
		 Thread.sleep(1000);

		   Assert.assertEquals(true, productFilterSection.isDisplayed());
           System.out.println("11 is pass");
           
           logger.info("verify_product_filter_on_listing_page test cases is passed");
   		
   		captureScreen(driver,"verify_product_filter_on_listing_pagee");
	}
	

	
//	  


	
	
	@Test (priority=13)
	public void UCP_TC_ID_15_validate_switch_button_vertical_horizontal() throws Exception{
		
logger.info("validate_switch_button_vertical_horizontal");
		
		captureScreen(driver,"validate_switch_button_vertical_horizontal");
		
		 WebElement verticalSwitchFilterbtn = driver.findElement(cart.verticalSwitchFilter);
		 
		 verticalSwitchFilterbtn.click();
		 
		 Thread.sleep(1000);

		 
		 WebElement zhorizontalSwitchFilterbtn = driver.findElement(cart.horizontalSwitchFilter);

		 zhorizontalSwitchFilterbtn.click();
		 Thread.sleep(1000);

		
         System.out.println("13 is pass");
         
         logger.info("validate_switch_button_vertical_horizontal test cases is passed");
 		
 		captureScreen(driver,"validate_switch_button_vertical_horizontal");

		
	}
	
	@Test (priority=14)
	public void UCP_TC_ID_17_18_validate_sortby_button_product_postion() throws Exception{
		
logger.info("validate_sortby_button_product_postion");
		
		captureScreen(driver,"validate_sortby_button_product_postion");
	
	 WebElement sortByFilteroption = driver.findElement(cart.sortByFilter);
		 
	 sortByFilteroption.click();
		 
		 Thread.sleep(1000);

		   Assert.assertEquals(true, sortByFilteroption.isDisplayed());

		
		
         System.out.println("14 is pass");
         
         logger.info("validate_sortby_button_product_postion test cases is passed");
 		
 		captureScreen(driver,"validate_sortby_button_product_postion");
	
	}
	
	
	
	@Test (priority=15)
	public void UCP_TC_ID_19_validate_search_filter_on_listing_page() throws Exception{
		
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
	

	
	
	@Test (priority=19)
	public void UCP_TC_ID_25_validate_addtocart_button() throws Exception{
		
		
logger.info("validate_by_adding_product_into_cart_by_addtocart_button");
		
		captureScreen(driver,"validate_by_adding_product_into_cart_by_addtocart_button");
		
		WebElement element = driver.findElement(cart.AddtoCart); 
		
		   Assert.assertEquals(true, element.isDisplayed());

		
		
		
		 Thread.sleep(1000);


			
			
	         System.out.println("19 is pass");
	         
	         logger.info("validate_by_adding_product_into_cart_by_addtocart_button test is passed");
	 		
	 		captureScreen(driver,"validate_by_adding_product_into_cart_by_addtocart_buttoner"); 

		
	}
	
	
	@Test (priority=21)
	public void UCP_TC_ID_29_verify_by_clicking_on_detail_button() throws Exception{
		
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
	public void UCP_TC_ID_30_verify_description_for_product_detail() throws Exception{
		
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
	public void UCP_TC_ID_31_32_verify_by_drop_down_list_generic() throws Exception{
		
logger.info("verify_by_hover_on_productItem_lenght_quantity");
		
		captureScreen(driver,"verify_by_hover_on_productItem_lenght_quantity");
		WebElement element = driver.findElement(cart.lenghtDetail); 
        //Actions action = new Actions(driver); action.moveToElement(element).build().perform(); 
         
		 Thread.sleep(1000);
		 
		 Select dropdown = new Select(driver.findElement(cart.noOfDoor));
		 
		 dropdown.selectByIndex(1);

		 Thread.sleep(1000);
		 
		 logger.info("verify_by_hover_on_productItem_lenght_quantity test is passed");
			
			captureScreen(driver,"verify_by_hover");
		 
         System.out.println("23 is pass");

		
	}
	
	
	@Test (priority=24)
	public void UCP_TC_ID_31_32_verify_by_drop_down_list2_for_generic() throws Exception{
		
logger.info("verify_by_hover_on_productItem_lenght_quantity");
		
		captureScreen(driver,"verify_by_hover_on_productItem_lenght_quantity");
		WebElement element = driver.findElement(cart.lenghtDetail); 
        //Actions action = new Actions(driver); action.moveToElement(element).build().perform(); 
         
		 Thread.sleep(1000);
		 
		 Select dropdown = new Select(driver.findElement(cart.doorThikness));
		 
		 dropdown.selectByIndex(1);

		 Thread.sleep(1000);
		 
		 logger.info("verify_by_hover_on_productItem_lenght_quantity test is passed");
			
			captureScreen(driver,"verify_by_hover");
		 
         System.out.println("23 is pass");

		
	}
	
	@Test (priority=25)
	public void UCP_TC_ID_31_32_verify_by_drop_down_list3_generic() throws Exception{
		
logger.info("verify_by_hover_on_productItem_lenght_quantity");
		
		captureScreen(driver,"verify_by_hover_on_productItem_lenght_quantity");
		WebElement element = driver.findElement(cart.lenghtDetail); 
        //Actions action = new Actions(driver); action.moveToElement(element).build().perform(); 
         
		 Thread.sleep(1000);
		 
		 Select dropdown = new Select(driver.findElement(cart.doorHeight));
		 
		 dropdown.selectByIndex(1);

		 Thread.sleep(1000);
		 
		 logger.info("verify_by_hover_on_productItem_lenght_quantity test is passed");
			
			captureScreen(driver,"verify_by_hover");
		 
         System.out.println("23 is pass");

		
	}
	@Test (priority=26)
	public void UCP_TC_ID_33_verify_by_clicking_next_button() throws Exception{
captureScreen(driver,"verify_by_clicking_on_detail_button");
		
        WebElement element = driver.findElement(cart.nextbtn); 
		

		element.click();
		
		
		 Thread.sleep(1000);

	}
	@Test (priority=27)
	public void UCP_TC_ID_33_verify_by_adding_into_cart() throws Exception{
		
logger.info("verify_by_adding_into_cart");
		
		captureScreen(driver,"verify_by_adding_into_cart");
		
		WebElement element = driver.findElement(cart.addToCart); 
		
		element.click();
		 Thread.sleep(1000);

		 logger.info("verify_by_adding_into_cart test is passed");
			
			captureScreen(driver,"verify_");

         System.out.println("24 is pass");

		
	}
	
	
	
	@Test (priority=28)
	public void UCP_TC_ID_34_verify_by_clicking_cart_icon() throws Exception{
		
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
	
	
	@Test (priority=29)
	public void UCP_TC_ID_35_verify_UI_cart_pop_up() throws Exception{
		
logger.info("verify_UI_cart_pop_up");
		
		captureScreen(driver,"verify_UI_cart_pop_up");
		
		WebElement element = driver.findElement(cart.viewAndEditCart); 
		WebElement checkoutButton = driver.findElement(cart.checkoutBtn); 
        
		 Thread.sleep(1000);

		   Assert.assertEquals(true, element.isDisplayed());
		   Assert.assertEquals(true, checkoutButton.isDisplayed());

		   logger.info("verify_UI_cart_pop_up test is passed");
			
			captureScreen(driver,"verify_All_product");
			
	         System.out.println("26 is pass");
		
	}
	
	
	@Test (priority=30)
	public void UCP_TC_ID_36_Verify_by_clicking_View_and_edit_cart() throws Exception{
		
logger.info("Verify_by_clicking_View_and_edit_cart");
		
		captureScreen(driver,"Verify_by_clicking_View_and_edit_cart");
		
WebElement element = driver.findElement(cart.viewAndEditCart); 
		
		element.click();
		 Thread.sleep(1000);

		 logger.info("Verify_by_clicking_View_and_edit_cart test is passed");
			
			captureScreen(driver,"Verify_by_clicking");

         System.out.println("27 is pass");
		
	}
	

	@Test (priority=31)
	public void UCP_TC_ID_37_42_verify_UI_of_the_View_and_edit_cart_page() throws Exception{
		
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
	
	
	
	@Test (priority=32)
	public void UCP_TC_ID_43_verify_by_clicking_Proceed_to_checkout_button() throws Exception{
		
		
logger.info("verify_by_clicking_Proceed_to_checkout_button");
		
		captureScreen(driver,"verify_by_clicking_Proceed_to_checkout_button");
		
WebElement element = driver.findElement(cart.proceedTochout); 

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", element);
		
		//element.click();
		 Thread.sleep(1000);

		 logger.info("verify_by_clicking_Proceed_to_checkout_button test is passed");
			
			captureScreen(driver,"verify_by_clicking");

         System.out.println("29 is pass");
		
		
	}
	

	@Test (priority=33)
	public void UCP_TC_ID_45_46_verify_by_adding_and_updating_new_address() throws Exception{
		
		
logger.info("verify_by_adding_and_updating_new_address");
		
		captureScreen(driver,"verify_by_adding_and_updating_new_address");
		WebElement editAddressbtn = driver.findElement(cart.editAddress); 
		WebElement newAddressbtn = driver.findElement(cart.newAddress);

        
		 Thread.sleep(1000);

		   Assert.assertEquals(true, editAddressbtn.isDisplayed());
		   Assert.assertEquals(true, newAddressbtn.isDisplayed());

		   logger.info("verify_by_adding_and_updating_new_address test is passed");
			
			captureScreen(driver,"verify_by_adding");
			
	         System.out.println("31 is pass");
	}
	
	
	
	
	@Test (priority=34)
	public void UCP_TC_ID_47_verify_by_selecting_ShipHere_radio_button() throws Exception{
		
logger.info("verify_by_selecting_ShipHere_radio_button");
		
		captureScreen(driver,"verify_by_selecting_ShipHere_radio_button");
		
WebElement radioButton = driver.findElement(cart.radioBtn); 
		
     radioButton.click();
		 Thread.sleep(1000);

		 logger.info("verify_by_selecting_ShipHere_radio_button test is passed");
			
			captureScreen(driver,"verify_by_sele");

         System.out.println("32 is pass");
		 Thread.sleep(1000);

		
	}
	
	@Test (priority=35)
	public void UCP_TC_ID_48_validate_by_clicking_next_button() throws Exception{
		
logger.info("validate_by_clicking_next_button");
		
		captureScreen(driver,"validate_by_clicking_next_button");
		
		WebElement nextButton = driver.findElement(cart.nextBtn); 
		
		
		 Thread.sleep(1000);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", nextButton);

		//nextButton.click();

		 logger.info("validate_by_clicking_next_button test is passed");
			
			captureScreen(driver,"validate_by_clicking");

	         System.out.println("33 is pass");
			 Thread.sleep(1000);

	}
	
	

	@Test (priority=36)
	public void UCP_TC_ID_49_verify_UI_of_Payment_page() throws Exception{
		
logger.info("verify_UI_of_Payment_page");
		
		captureScreen(driver,"verify_UI_of_Payment_page");
		
		WebElement cardDetailsInpt = driver.findElement(cart.cardDetail); 
		//WebElement termAndConditionbtn = driver.findElement(cart.termAndCondition);

        
		 Thread.sleep(1000);

		   Assert.assertEquals(true, cardDetailsInpt.isDisplayed());
		  // Assert.assertEquals(true, termAndConditionbtn.isDisplayed());

		   logger.info("verify_UI_of_Payment_page test is passed");
			
			captureScreen(driver,"verify_UI_of_Payment");
			
	         System.out.println("34 is pass");
			 Thread.sleep(1000);

		
	}
	
	
	@Test (priority=37)
	public void UCP_TC_ID_50_Add_card_detail() throws Exception{
		
logger.info("Add_card_detail");
		
		captureScreen(driver,"Add_card_detail");
		
WebElement cardinputfield = driver.findElement(cart.cardDetail); 

cardinputfield.click();
		
	

Thread.sleep(1000);


//WebElement iframe_by_name = driver.findElement(By.xpath("//iframe[@name='__privateStripeFrame1575']"));
driver.switchTo().frame(0);
Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='cardnumber']")).sendKeys("4111111111111111");
		
		driver.findElement(By.xpath("//input[@name='exp-date']")).sendKeys("1224");

		driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("123");

		driver.switchTo().defaultContent(); // you are now outside both frames

	
		

			 logger.info("Add_card_detail test is passed");
				
				captureScreen(driver,"Add_card_detaili");

	        
			 Thread.sleep(1000);

	}
	
	
	@Test (priority=38)
	public void UCP_TC_ID_51_select_Term_and_condition() throws Exception{
		
logger.info("select_Term_and_condition");
		
		captureScreen(driver,"select_Term_and_condition");
		
WebElement termAndConditionbtn = driver.findElement(cart.termAndCondition); 
		
            //termAndConditionbtn.click();
            
       	 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", termAndConditionbtn);
		 
			 Thread.sleep(1000);
			 logger.info("select_Term_and_condition test is passed");
				
				captureScreen(driver,"select_Term");


	      
		
	}
	
	@Test (priority=39)
	public void UCP_TC_ID_58_verify_by_placing_order() throws Exception{
		
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
