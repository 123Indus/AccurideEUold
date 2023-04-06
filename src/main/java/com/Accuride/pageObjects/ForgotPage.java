package com.Accuride.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPage {
	
public WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public ForgotPage(WebDriver driver) {
          this.driver = driver;
	}
	
	public By loginsignUpbtn = By.xpath("//*[@id=\"__next\"]/div[1]/header/div[2]/div/div/div[3]/a");

	public By fogpassbtn = By.xpath("//button[contains(text(),'Forgot Password?')]");

	public By emailinput = By.xpath("//div[@class='form-group']//input[@type='email']");

	public By resetPassbtn = By.xpath("//button[@type='submit']");


}
