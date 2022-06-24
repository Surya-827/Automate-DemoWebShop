package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;

public class CheckOutPage extends TestBase{

	
	// Scenario - 1
	//This method is responsible for verifying user navigation on home-page and login
    public void user_is_on_home_page_by_logging_with_and(String email, String password) throws IOException {
		IntializeBrowser();
		Login(email,password);
	}

	
    //This method is responsible for verifying user clicks on shopping cart button
	public void user_clicks_on_shopping_cart_button() {
		driver.findElement(By.xpath(loc.getProperty("CP_shopingCartbtn"))).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
	}

	
	//This method is responsible for verifying user enters proper country name, state and code in respective fields
	public void select_and_enter_and_and(String country, String state, String code){
		WebElement dropdown1 = driver.findElement(By.xpath(loc.getProperty("CP_country")));
		Select sel1 = new Select(dropdown1);
		sel1.selectByVisibleText(country);

		WebElement dropdown2 = driver.findElement(By.id(loc.getProperty("CP_state")));
		Select sel2 = new Select(dropdown2);
		sel2.selectByVisibleText(state);

		driver.findElement(By.id(loc.getProperty("CP_code"))).sendKeys(code);
	}

	
	//This method is responsible for verifying user clicks on estimate shipping button
	public void click_estimate_shipping_button() {
		driver.findElement(By.xpath(loc.getProperty("CP_estShipbtn"))).click();
	}

	
	//This method is responsible for verifying user clicks on checkout button
	public void click_on_checkout_button() {
		driver.findElement(By.xpath(loc.getProperty("CP_termsOfServ"))).click();
		driver.findElement(By.xpath(loc.getProperty("CP_checkOutbtn"))).click();
		
	}

	
	//This method is responsible for validate that user navigated to billing page after clicking checkout button
	public void user_should_see_billing_page() {
		boolean flag = driver.findElement(By.xpath("//h1[text()='Checkout']")).isDisplayed();
        if(flag==true) {
        	System.out.println("User is on billing page....");
        }else {
        	System.out.println("User is on Shopping Cart...");
        }
        
       QuitBrowser();
	}


}