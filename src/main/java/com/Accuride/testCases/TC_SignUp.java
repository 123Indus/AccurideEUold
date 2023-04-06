package com.Accuride.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.Accuride.pageObjects.LoginPage;
import com.Accuride.pageObjects.SignUpPage;

public class TC_SignUp extends BaseClass {

	SignUpPage signUp = new SignUpPage(driver);


	@Test (priority=1)
	public void Signup_TC_ID_1_verifySignUpButton() throws Exception{

		logger.info("URL is opened");
		logger.info("Clicked on SignUp/Login Button");

		captureScreen(driver,"Login_TC_ID_1UIloginTest1");

		WebElement signbtn =driver.findElement(signUp.loginsignUpbtn);

		logger.info("Verified the UIloginTest page");

		Assert.assertEquals(true, signbtn.isDisplayed());
		signbtn.click();
		captureScreen(driver,"Login_TC_ID_1UIloginTest");
		logger.info("Login_TC_ID_1UIloginTest test passed");

	}

	@Test (priority=2)
	public void Signup_TC_ID_2_UI_of_the_Sign_up_page() throws Exception{


		logger.info("URL is opened");
		logger.info("Clicked on SignUp/Login Button");

		captureScreen(driver,"Signup_TC_ID_2_UI_of_the_Sign_up_page");

		driver.findElement(signUp.signUpbtn).click();



		WebElement emailinput = driver.findElement(signUp.email);
		WebElement passInput = driver.findElement(signUp.passwrd); 
		WebElement confirmpassInput = driver.findElement(signUp.confimPasswrd); 

		WebElement firstNameInputBox = driver.findElement(signUp.firstName);
		WebElement lastNameInputBox = driver.findElement(signUp.lastName);
		WebElement signInbutton = driver.findElement(signUp.signInbtn);
		WebElement pick_your_industryinputbox = driver.findElement(signUp.pick_your_industry);
		WebElement independentbtn = driver.findElement(signUp.independent);


		logger.info("Verified the UISignUpTest page");



		Assert.assertEquals(true, emailinput.isDisplayed());
		Assert.assertEquals(true, passInput.isDisplayed());
		Assert.assertEquals(true, confirmpassInput.isDisplayed());
		Assert.assertEquals(true, firstNameInputBox.isDisplayed());
		Assert.assertEquals(true, lastNameInputBox.isDisplayed());
		Assert.assertEquals(true, signInbutton.isDisplayed());
		Assert.assertEquals(true, pick_your_industryinputbox.isDisplayed());
		Assert.assertEquals(true, independentbtn.isDisplayed());

		captureScreen(driver,"Signup_TC_ID_2_UI_of_the_Sign_up_page");
		logger.info("Login_TC_ID_1UIloginTest test passed");


	}

	@Test (priority=3)
	public void Signup_TC_ID_3_Behaviour_of_SignUp_Button() throws Exception{



	}

	@Test (priority=4)
	public void Signup_TC_ID_4_verify_all_the_text_boxes_Checkbox_and_buttons() throws Exception{



	}

	@Test (priority=5)
	public void Signup_TC_ID_5_verify_that_without_providing_First_name() throws Exception{

		logger.info("Login_TC_ID_5CheckByNotFillingEmail test cases started");


		driver.findElement(signUp.passwrd).sendKeys("eGain@123");
		driver.findElement(signUp.confimPasswrd).sendKeys("eGain@123");
		//driver.findElement(signUp.firstName).sendKeys("vishal");
		driver.findElement(signUp.lastName).sendKeys("singh");
		driver.findElement(signUp.independent).click();
		driver.findElement(signUp.email).sendKeys("vishal123@test.com");
		driver.findElement(signUp.signInbtn).click();


		Thread.sleep(1000);

		String emailAlerttext = driver.findElement(signUp.alerttext).getText();
		System.out.println(emailAlerttext);
		if(signUp.p.equals(emailAlerttext)){
			System.out.println("Pass");
			logger.info("Login_TC_ID_3CheckByNotFillingEmail test cases Passed");
			captureScreen(driver,"Login_TC_ID_3CheckByNotFillingEmail");
		}
		else {
			System.out.println("Fail");
			logger.info("Signup_TC_ID_5_verify_that_without_providing_First_name test cases Failed");
			captureScreen(driver,"Login_TC_ID_3CheckByNotFillingEmail");
		}
	}

	@Test (priority=6)
	public void Signup_TC_ID_6_verify_without_providing_Last_name() throws Exception{

		logger.info("Signup_TC_ID_6_verify_without_providing_Last_name test cases started");

		driver.findElement(signUp.passwrd).clear();	
		driver.findElement(signUp.passwrd).sendKeys("eGain@123");
		driver.findElement(signUp.confimPasswrd).clear();
		driver.findElement(signUp.confimPasswrd).sendKeys("eGain@123");
		driver.findElement(signUp.firstName).sendKeys("vishal");
		driver.findElement(signUp.lastName).clear();
		//driver.findElement(signUp.lastName).sendKeys("singh");
		driver.findElement(signUp.independent).click();
		driver.findElement(signUp.email).clear();
		driver.findElement(signUp.email).sendKeys("vishal123@test.com");
		driver.findElement(signUp.signInbtn).click();





		String emailAlerttext = driver.findElement(signUp.alerttext).getText();

		if(signUp.p.equals(emailAlerttext)){
			System.out.println("Pass");
			logger.info("Signup_TC_ID_6_verify_without_providing_Last_name test cases Passed");
			captureScreen(driver,"Signup_TC_ID_6_verify_without_providing_Last_name");
		}
		else {
			System.out.println("Fail");
			logger.info("Signup_TC_ID_6_verify_without_providing_Last_name test cases Failed");
			captureScreen(driver,"Signup_TC_ID_6_verify_without_providing_Last_name");
		}

	}

	@Test (priority=7)
	public void Signup_TC_ID_7_verify_without_providing_Email_id() throws Exception{

		logger.info("Login_TC_ID_3CheckByNotFillingEmail test cases started");

		driver.findElement(signUp.passwrd).clear();
		driver.findElement(signUp.passwrd).sendKeys("eGain@123");
		driver.findElement(signUp.confimPasswrd).clear();
		driver.findElement(signUp.confimPasswrd).sendKeys("eGain@123");
		driver.findElement(signUp.firstName).clear();
		driver.findElement(signUp.firstName).sendKeys("vishal");
		driver.findElement(signUp.lastName).clear();
		driver.findElement(signUp.lastName).sendKeys("singh");
		driver.findElement(signUp.independent).click();
		driver.findElement(signUp.email).clear();
		driver.findElement(signUp.signInbtn).click();
		//driver.findElement(signUp.email).sendKeys("vishal@test.com");





		String emailAlerttext = driver.findElement(signUp.alerttext).getText();

		if(signUp.p.equals(emailAlerttext)){
			System.out.println("Pass");
			logger.info("Signup_TC_ID_7_verify_without_providing_Email_id test cases Passed");
			captureScreen(driver,"Signup_TC_ID_7_verify_without_providing_Email_id");
		}
		else {
			System.out.println("Fail");
			logger.info("Signup_TC_ID_7_verify_without_providing_Email_id test cases Failed");
			captureScreen(driver,"Signup_TC_ID_7_verify_without_providing_Email_id");
		}

	}


	@Test (priority=8)
	public void Signup_TC_ID_8_verify_without_providingPassword() throws Exception{

		logger.info("Signup_TC_ID_8_verify_without_providingPassword test cases started");

		driver.findElement(signUp.passwrd).clear();
		//driver.findElement(signUp.passwrd).sendKeys("eGain@123");

		driver.findElement(signUp.confimPasswrd).sendKeys("eGain@123");
		driver.findElement(signUp.firstName).clear();
		driver.findElement(signUp.firstName).sendKeys("vishal");
		driver.findElement(signUp.lastName).clear();
		driver.findElement(signUp.lastName).sendKeys("singh");
		driver.findElement(signUp.independent).click();
		driver.findElement(signUp.email).clear();
		driver.findElement(signUp.email).sendKeys("vishal@test.com");
		driver.findElement(signUp.signInbtn).click();





		String emailAlerttext = driver.findElement(signUp.alerttext).getText();

		if(signUp.p.equals(emailAlerttext)){
			System.out.println("Pass");
			logger.info("Signup_TC_ID_8_verify_without_providingPassword test cases Passed");
			captureScreen(driver,"Signup_TC_ID_8_verify_without_providingPassword");
		}
		else {
			System.out.println("Fail");
			logger.info("Signup_TC_ID_8_verify_without_providingPassword test cases Failed");
			captureScreen(driver,"Signup_TC_ID_8_verify_without_providingPassword");
		}

	}


	@Test (priority=9)
	public void Signup_TC_ID_9_verify_by_providing_diffrent_Password_into_Password_and_confirm_password() throws Exception{

		logger.info("Signup_TC_ID_9_verify_by_providing_diffrent_Password_into_Password_and_confirm_password test cases started");

		driver.findElement(signUp.passwrd).clear();
		driver.findElement(signUp.passwrd).sendKeys("eGain@123");
		driver.findElement(signUp.confimPasswrd).clear();
		driver.findElement(signUp.confimPasswrd).sendKeys("eGain@1890");
		driver.findElement(signUp.firstName).sendKeys("vishal");
		driver.findElement(signUp.lastName).sendKeys("singh");
		driver.findElement(signUp.independent).click();
		driver.findElement(signUp.email).clear();
		driver.findElement(signUp.email).sendKeys("vishal123@test.com");
		driver.findElement(signUp.signInbtn).click();




		String emailAlerttext = driver.findElement(signUp.confmpassandpass).getText();

		if(signUp.w.equals(emailAlerttext)){
			System.out.println("Pass");
			logger.info("Signup_TC_ID_9_verify_by_providing_diffrent_Password_into_Password_and_confirm_password test cases Passed");
			captureScreen(driver,"Signup_TC_ID_9_verify_by_providing_diffrent_Password_into_Password_and_confirm_password");
		}
		else {
			System.out.println("Fail");
			logger.info("Signup_TC_ID_9_verify_by_providing_diffrent_Password_into_Password_and_confirm_password test cases Failed");
			captureScreen(driver,"Signup_TC_ID_9_verify_by_providing_diffrent_Password_into_Password_and_confirm_password");
		}

	}

	@Test (priority=10)
	public void Signup_TC_ID_11_Check_with_existing_email_address_which_is_already_been_used() throws Exception{

		logger.info("Signup_TC_ID_11_Check_with_existing_email_address_which_is_already_been_used test cases started");

		driver.findElement(signUp.email).clear();
		driver.findElement(signUp.email).sendKeys("vishalk.singh@test.com");
		driver.findElement(signUp.passwrd).clear();
		driver.findElement(signUp.passwrd).sendKeys("eGain@123");
		driver.findElement(signUp.confimPasswrd).clear();
		driver.findElement(signUp.confimPasswrd).sendKeys("eGain@123");
		driver.findElement(signUp.firstName).clear();
		driver.findElement(signUp.firstName).sendKeys("vishal");
		driver.findElement(signUp.lastName).clear();
		driver.findElement(signUp.lastName).sendKeys("singh");
		driver.findElement(signUp.independent).click();
		driver.findElement(signUp.bussiness).click();

		driver.findElement(signUp.signInbtn).click();

		Thread.sleep(3000);


		String emailAlerttext = driver.findElement(signUp.alerttext).getText();
		System.out.println(emailAlerttext);

		if(signUp.p.equals(emailAlerttext)){
			System.out.println("Pass");
			logger.info("Signup_TC_ID_11_Check_with_existing_email_address_which_is_already_been_used test cases Passed");
			captureScreen(driver,"Signup_TC_ID_11_Check_with_existing_email_address_which_is_already_been_used");
		}
		else {
			System.out.println("Fail");
			logger.info("Signup_TC_ID_11_Check_with_existing_email_address_which_is_already_been_used test cases Failed");
			captureScreen(driver,"Signup_TC_ID_11_Check_with_existing_email_address_which_is_already_been_used");
		}

	}

	@Test (priority=11)
	public void Signup_TC_ID_12_Check_the_password_limit_when_enter_value_less_than_min() throws Exception{

		logger.info("Signup_TC_ID_12_Check_the_password_limit_when_enter_value_less_than_min test cases started");

		driver.findElement(signUp.email).clear();
		driver.findElement(signUp.email).sendKeys("vishalk.sgh@test.com");
		driver.findElement(signUp.passwrd).clear();
		driver.findElement(signUp.passwrd).sendKeys("eGain@1");
		driver.findElement(signUp.confimPasswrd).clear();
		driver.findElement(signUp.confimPasswrd).sendKeys("eGain@1");
		driver.findElement(signUp.firstName).clear();
		driver.findElement(signUp.firstName).sendKeys("vishal");
		driver.findElement(signUp.lastName).clear();
		driver.findElement(signUp.lastName).sendKeys("singh");
		driver.findElement(signUp.independent).click();
		driver.findElement(signUp.bussiness).click();

		driver.findElement(signUp.signInbtn).click();

		Thread.sleep(3000);


		String emailAlerttext = driver.findElement(signUp.confmpassandpass).getText();
		System.out.println(emailAlerttext);

		if(signUp.T.equals(emailAlerttext)){
			System.out.println("Pass");
			logger.info("Signup_TC_ID_12_Check_the_password_limit_when_enter_value_less_than_min test cases Passed");
			captureScreen(driver,"Signup_TC_ID_11_Check_with_existing_email_address_which_is_already_been_used");
		}
		else {
			System.out.println("Fail");
			logger.info("Signup_TC_ID_12_Check_the_password_limit_when_enter_value_less_than_min test cases Failed");
			captureScreen(driver,"Signup_TC_ID_11_Check_with_existing_email_address_which_is_already_been_used");
		}


	}

	@Test (priority=12)
	public void Signup_TC_ID_13_Check_the_password_limit_when_enter_value_greater_than_max() throws Exception{



	}

	@Test (priority=13)
	public void Signup_TC_ID_14_Check_the_password_when_passing_only_numbers() throws Exception{

		logger.info("Signup_TC_ID_14_Check_the_password_when_passing_only_numbers test cases started");

		driver.findElement(signUp.email).clear();
		driver.findElement(signUp.email).sendKeys("vishalk.sgh@test.com");
		driver.findElement(signUp.passwrd).clear();
		driver.findElement(signUp.passwrd).sendKeys("eGain@1");
		driver.findElement(signUp.confimPasswrd).clear();
		driver.findElement(signUp.confimPasswrd).sendKeys("eGain@1");
		driver.findElement(signUp.firstName).clear();
		driver.findElement(signUp.firstName).sendKeys("vishal");
		driver.findElement(signUp.lastName).clear();
		driver.findElement(signUp.lastName).sendKeys("singh");
		driver.findElement(signUp.independent).click();
		driver.findElement(signUp.bussiness).click();

		driver.findElement(signUp.signInbtn).click();

		Thread.sleep(3000);


		String emailAlerttext = driver.findElement(signUp.confmpassandpass).getText();
		System.out.println(emailAlerttext);

		if(signUp.T.equals(emailAlerttext)){
			System.out.println("Pass");
			logger.info("Signup_TC_ID_14_Check_the_password_when_passing_only_numbers test cases Passed");
			captureScreen(driver,"Signup_TC_ID_11_Check_with_existing_email_address_which_is_already_been_used");
		}
		else {
			System.out.println("Fail");
			logger.info("Signup_TC_ID_14_Check_the_password_when_passing_only_numbers test cases Failed");
			captureScreen(driver,"Signup_TC_ID_11_Check_with_existing_email_address_which_is_already_been_used");
		}

	}

	@Test (priority=14)
	public void Signup_TC_ID_16_By_entering_all_the_required_mandatory_field() throws Exception{

		logger.info("Signup_TC_ID_16_By_entering_all_the_required_mandatory_field test cases started");

		driver.findElement(signUp.email).clear();
		driver.findElement(signUp.email).sendKeys("vishalk.rohit200@test.com");
		driver.findElement(signUp.passwrd).clear();
		driver.findElement(signUp.passwrd).sendKeys("eGain@123");
		driver.findElement(signUp.confimPasswrd).clear();
		driver.findElement(signUp.confimPasswrd).sendKeys("eGain@123");
		driver.findElement(signUp.firstName).clear();
		driver.findElement(signUp.firstName).sendKeys("vishal");
		driver.findElement(signUp.lastName).clear();
		driver.findElement(signUp.lastName).sendKeys("singh");
		driver.findElement(signUp.independent).click();
		driver.findElement(signUp.bussiness).click();

		driver.findElement(signUp.signInbtn).click();

		Thread.sleep(3000);

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


	/*@Test (priority=1)
	public void Signup_TC_ID_17_the_success_mail_is_appearing_or_not_after_Signup() throws Exception{

	}
	 */


}
