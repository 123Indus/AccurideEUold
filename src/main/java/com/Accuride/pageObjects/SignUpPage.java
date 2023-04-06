package com.Accuride.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

	public static WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	public By loginsignUpbtn = By.xpath("(//div[contains(@class,'nav-item')])[3]/a");
	public By signUpbtn = By.xpath("//button[contains(text(),'Sign-up')]");
	public By firstName = By.xpath("//input[contains(@name,'firstname')]");
	public   By lastName = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/form/div/div[1]/div/div[2]/input");
	public        By independent = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/form/div/div[1]/div/div[4]/select/option[1]");
	public        By bussiness = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/form/div/div[1]/div/div[4]/select/option[2]");
	public         By pick_your_industry = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/form/div/div[1]/div/div[5]/select");
	public         By email = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/form/div/div[2]/div/div[1]/input");
	public         By passwrd = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/form/div/div[2]/div/div[2]/input");
	public By confimPasswrd = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/form/div/div[2]/div/div[3]/input");
	public By signInbtn = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/form/div/div[3]/button");
	public By alerttext = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/form/div/div[3]/p");
	public String p = "* Required Fields";
	public String w = "Password and confirm password will be same.";
	public   By popalert = By.className("Toastify__toast-body");
	public String T= "Please enter a correct password format.";
	public   By confmpassandpass = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/form/div/div[2]/div/div[2]/div");
	public   By alertemailsame = By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div[4]/div/div/div");


}
