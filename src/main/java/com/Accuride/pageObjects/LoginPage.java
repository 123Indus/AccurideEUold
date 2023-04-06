package com.Accuride.pageObjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
	
	
public WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage(WebDriver driver) {
          this.driver = driver;
	}
	
	//Locator for srcbox field
	public By loginsignUpbtn = By.xpath("//*[@id=\"__next\"]/div[1]/header/div[2]/div/div/div[3]/a");
	
	//Locator for bestseller field
	public By email = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[1]/form/div[1]/input");
	
	//Locator for headphone button
	public By passWord = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[1]/form/div[2]/input");
	
	public By LogInbtn =By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[1]/form/div[3]/button[1]");
	
	public By emailAlert = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[1]/form/div[1]/div");
	
	public By passAlert = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[1]/form/div[2]/div");
		
	public By incorrectEmailAlert = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[1]/form/div[3]");
	
	public By forgotPasswordLnk = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[1]/form/div[3]/button[2]");
		
	public By signUpbtn = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[2]/article/button");
	
	//Method to enter product name into search box
	//public void LoginSignUpButton() {
		//   try   { 
	//	driver.findElement(loginsignUpbtn).click();
		//   }
		//   catch(NullPointerException e)   { 
	     //       System.out.print("Caught NullPointerException"); }
	//}
	
	
	public void EmailInputBox() {
		driver.findElement(email).sendKeys("vishalk.singh@indusnet.co.in");
	}

	//Method to select best seller product
	public void PasswordInputBox() {
		driver.findElement(passWord).sendKeys("eGain@123");
		
		
	}
	
	//public void LoggedInButton() {
	//	driver.findElement(LogInbtn).click();
	//}
	
	public void IncorrectEmailInputBox() {
		driver.findElement(email).sendKeys("vishal@indusnet.co.in");
	}
	
	public void IncorrectPasswordInputBox() {
		driver.findElement(passWord).sendKeys("eGain@12");
		
		
	}
	
// Verify UI of the login page.
	
	   //WebElement emailinput = driver.findElement(email);
	   //WebElement passInput = driver.findElement(passWord); 
	   //WebElement loginButtoncheck = driver.findElement(LogInbtn);
	 
	/*
	 * public boolean IsDisplayed() {
	 * 
	 * if (SignUppasswordbtn != null) { return true; } return false;
	 * 
	 * 
	 * }
	 */

	
	  //WebElement SignUppasswordbtn = driver.findElement(signUpbtn);
	  
	/*
	 * public boolean IsDisplayedSignUpbtn() {
	 * 
	 * if (SignUppasswordbtn != null) { return true; } return false;
	 * 
	 * 
	 * }
	 */
	 
	
	
	//driver.findElement(By.id("Value")).sendKeys(Keys.RETURN);
	
	public String k= "Required field, please enter valid email address.";
	public String k2 ="Required field, please enter valid password.";


	 
		

	
	public String e = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";

	//public String alerttextemailpass = driver.findElement(incorrectEmailAlert).getText();
	

}
