package com.Accuride.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProccedToQuotePage {
	
	
public WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public ProccedToQuotePage(WebDriver driver) {
          this.driver = driver;
	}
	
	//Locator for srcbox field
	public By productMenu = By.xpath("//a[contains(text(),'Products')]");
	public By storeMenu = By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/nav/ul/li[2]/a");
	public By recourceMenu = By.xpath("//a[contains(text(),'Resources')]");
	public By marketMenu = By.xpath("//a[contains(text(),'Markets')]");
	public By blogMenu = By.xpath("//body/div[@id='__next']/div[@class='d-flex flex-column mh-100 app-content']/header[@class='acc-header-desktop']/div[@class='acc-sticky-header']/div[@class='container']/div[@class='flex-nowrap row']/div[@class='position-inherit px-0 px-xxl-3 col']/nav[@class='acc-megamenu']/ul/li[5]/a[1]");
	public By supportMenu = By.xpath("//a[contains(text(),'Support')]");
	public By companyMenu = By.xpath("//a[contains(text(),'Company')]");
	public By productsubMenu = By.xpath("//section[@class='acc-acount-sidemenu']");
	public By drawerslidesubMenu = By.xpath("//a[contains(text(),'Drawer Slides')]");
	public By marketsubmenu = By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/nav/ul/li[3]/div/div/div/div");
	public By resourcesubmenu = By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/nav/ul/li[4]/div/div/div/div[1]/ul");
	public By blogsubmenu = By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/nav/ul/li[5]/div/div/div/div[1]/ul");
	public By supportsubmenu = By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/nav/ul/li[6]/div/div/div/div[1]/ul");
	public By companysubmenu = By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/nav/ul/li[7]/div/div/div/div[1]/ul");
	public By drawerSlidesubmenu = By.xpath("//a[contains(text(),'LIGHT DUTY')]");

	//product listing
	
	public By productFilter = By.xpath("//div[@class='fade tab-pane active show']");
	public By sortByFilter = By.xpath("//div[@class='input-group']//select[@class='form-control']");

	public By applyingproductFilter = By.xpath("//body/div[@id='__next']/div[contains(@class,'d-flex flex-column mh-100 app-content')]/div[contains(@class,'container')]/div[@class='row']/div[@class='stickyFilter acc-product-sidebar px-0 px-xl-3 col-xl col-12 order-xl-2 order-1']/div[@class='acc-product-filter p-0 container']/div[contains(@class,'acc-filter-wrap')]/div[@class='acc-filter-body']/div[@class='row no-gutters']/div[contains(@class,'bg-white col')]/div[@class='acc-filter-content p-3 p-xl-0']/div[@class='tab-content']/div[@class='fade tab-pane active show']/div[@class='acc-filter-accordian accordion']/form[@data-hs-cf-bound='true']/div[@class='mb-3 mb-xl-0 border-0 rounded cat-length card']/div[@class='collapse show']/div[@class='px-3 px-xl-0 pb-0 pt-2 card-body']/div[1]/div[1]");

	public By verticalSwitchFilter = By.xpath("//body/div[@id='__next']/div[contains(@class,'d-flex flex-column mh-100 app-content')]/div[contains(@class,'container')]/div[contains(@class,'row')]/div[contains(@class,'pl-xl-3 px-0 col-xl col-12 order-xl-3 order-3')]/div[contains(@class,'container')]/section[contains(@class,'acc-product-toolbar')]/div[contains(@class,'row')]/div[contains(@class,'acc-modes col')]/div[contains(@class,'btn-group')]/button[2]/*[1]");

	public By horizontalSwitchFilter = By.xpath("//body/div[@id='__next']/div[contains(@class,'d-flex flex-column mh-100 app-content')]/div[contains(@class,'container')]/div[contains(@class,'row')]/div[contains(@class,'pl-xl-3 px-0 col-xl col-12 order-xl-3 order-3')]/div[contains(@class,'container')]/section[contains(@class,'acc-product-toolbar')]/div[contains(@class,'row')]/div[contains(@class,'acc-modes col')]/div[contains(@class,'btn-group')]/button[1]/*[1]");

	public By searchFilter = By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[3]/form/div/div/input");

	
	public By hoverProduct = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[2]/section/div[1]/div[1]/div[1]/div/div");

	public By addQuantity = By.xpath("//body/div[@id='__next']/div[contains(@class,'d-flex flex-column mh-100 app-content')]/div[contains(@class,'container')]/div[contains(@class,'row')]/div[contains(@class,'pl-xl-3 px-0 col-xl col-12 order-xl-3 order-3')]/div[contains(@class,'container')]/div[contains(@class,'acc-product-listing')]/section[contains(@class,'position-relative section-padding pt-xl-5 acc-avilable-product')]/div[contains(@class,'px-2 row')]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");

	public By addproduct = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[2]/section/div[1]/div[1]/div[1]/div/div/div[2]/div/div/div/div[2]");

	public By productlenght = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[2]/section/div[1]/div[1]/div[1]/div/div/div[1]/select");
	public By AddtoCart = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[2]/section/div[1]/div[1]/div[3]/div/button[1]");
	public By detailBtn = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[2]/section/div[1]/div[1]/div[3]/div/button[2]");

	
	//product detail
	
	public By contentDetail = By.xpath("//div[contains(@class,'acc-product-overview')]");
	
	public By lenghtDetail = By.xpath("//div[@class='col-xxl-6 form-group col-md-8']//select[@class='form-control']");

	public By addProductbtn = By.xpath("//div[contains(text(),'+')]");

	public By addToCart = By.xpath("//button[contains(text(),'Add to Cart')]");

	//public By kart = By.xpath("//body/div[@id='__next']/div[contains(@class,'d-flex flex-column mh-100 app-content')]/header[contains(@class,'acc-header-desktop')]/div[contains(@class,'acc-sticky-header')]/div[contains(@class,'container')]/div[contains(@class,'flex-nowrap row')]/div[4]/button[1]/span[1]/span[1]");

	public By kart = By.xpath("//*[@id=\"__next\"]/div[1]/header/div[3]/div/div/div[4]/button");

	// cart
	
	public By viewAndEditCart = By.xpath("//button[contains(text(),'view and edit cart')]");
	
	public By checkoutBtn = By.xpath("//button[contains(text(),'checkout')]");

	
	public By proceedToQote = By.xpath("//button[contains(text(),'proceed to quote')]");

	public By editCart = By.xpath("//span[contains(text(),'Edit')]");
	
	public By Remarks = By.xpath("//*[@id='__next']/div[1]/section/div/div/div[1]/form/div/div[2]/textarea");

	public By submitQuote = By.xpath("//button[contains(text(),'Submit Quote Request')]");

	
	public By deleteCart = By.xpath("//span[contains(text(),'Delete')]");

	
	public By updateShoppingCart = By.xpath("//button[contains(text(),'Update Shopping Cart')]");

	//SignIn
	
	public By email = By.xpath("//div[@class='form-group']//input[@type='email']");

	
	public By password = By.xpath("//input[contains(@type,'password')]");

	
	public By LogIninput = By.xpath("//button[contains(text(),'Log in')]");

	//Shipping Address
	
	public By editAddress = By.xpath("//div[contains(@class,'flex-1')]//button[contains(@type,'button')]//div//div//*[contains(@class,'injected-svg')]");

	public By newAddress = By.xpath("//body/div[@id='__next']/div[contains(@class,'d-flex flex-column mh-100 app-content')]/section[contains(@class,'section-padding pt-0 pt-xl-5 mt-xl-5')]/div[contains(@class,'mt-3 mt-xl-0 container')]/div[contains(@class,'row')]/div[contains(@class,'col-xl')]/section[contains(@class,'acc-shipping-address')]/div[contains(@class,'text-md-left border-top border-medium pt-3')]/button[1]");

	public By radioBtn = By.xpath("//label[contains(@class,'custom-control-label')]");

	public By radioBtnSepa = By.xpath("//*[@id='__next']/div[1]/section/div/div/div[1]/section[2]/form/ul/li/label/div[2]/span[1]");

	public By nextBtn = By.xpath("//button[contains(text(),'Next')]");

	public By cardDetail = By.xpath("//div[@class='StripeElement StripeElement--empty']");
	
	public By banktransfer = By.xpath("//h4[contains(text(),'Bank Transfer')]");


	public By sepaBtn = By.xpath("//h4[contains(text(),'SEPA Direct Debit')]");

	public By termAndCondition = By.xpath("//input[@id='terms']");
	
	public By termAndCondition2 = By.xpath("//input[@id='terms2']");
	
	public By termAndCondition3 = By.xpath("//input[@id='termsSEPA']");


	public By placeOrderbtnSepaQuote = By.xpath("//*[@id='__next']/div[1]/section/div/div/div[1]/section/div/article/div/div[3]/div[2]/section/form/button");

	public By placeOrderbtnSEPA = By.xpath("//*[@id='__next']/div[1]/div[2]/div/div/div[1]/section/div[2]/article/div/div[2]/div[2]/section/form/button");

	public By placeOrderbtn = By.xpath("//button[contains(text(),'Place Order')]");
	
	public By placeOrderbtn2 = By.xpath("/html/body/div[1]/div[1]/section/div/div/div[1]/section/div/article/div/div[2]/div[2]/section/form/button");


	//public By LogIn = By.xpath("//button[contains(text(),'Log in')]");

	//public By LogIn = By.xpath("//button[contains(text(),'Log in')]");
	
	public By droplang = By.xpath("//header/div[2]/div[1]/div[1]/div[6]");

	public By dropEngUK = By.xpath("//a[contains(text(),'English - UK')]");




	public By loginsignUpbtn = By.xpath("//*[@id=\"__next\"]/div[1]/header/div[2]/div/div/div[3]/a");

	public By emailnew = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[1]/form/div[1]/input");
	
	//Locator for headphone button
	public By passWordnew = By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[1]/form/div[2]/input");
	
	public By LogInbtnnew =By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div/div[1]/form/div[3]/button[1]");
	
	public By MyQuote =By.xpath("//a[contains(text(),'My Quotes')]");
	
	public By proceedToPaymnt =By.xpath("//button[contains(text(),'Proceed to Payment')]");

//My account
	
	public By WelcomeName =By.xpath("//a[contains(text(),'Welcome Vishal')]");

	public By myAccount =By.xpath("//header/div[2]/div[1]/div[1]/div[3]/div[1]/a[1]");

	public By myQuote =By.xpath("//a[contains(text(),'My Quotes')]");

	public By action =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/button[1]");

	public By action2 =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/button[1]");

	public By viewQuote =By.xpath("//a[contains(text(),'View Quote')]");

	public By acceptCheckout =By.xpath("//button[contains(text(),'Accept & Checkout')]");
	
	public By repaceItem =By.xpath("//button[contains(text(),'Ok')]");




}
