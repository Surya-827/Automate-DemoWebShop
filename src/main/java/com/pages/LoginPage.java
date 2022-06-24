package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;


public class LoginPage extends TestBase{


	//This method is responsible to make driver to navigate towards link provided by user!
	public void user_should_be_on_home_page() throws IOException {
        IntializeBrowser();
	}
	
	
	//This method is responsible to make driver to click on login button using locator value from FILE:locator.properties 
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath(loc.getProperty("LP_loginbtn1"))).click();
	}

   
	////This method is responsible to make driver to enter email and password details in respective fields!
    public void user_should_enter_registered_and(String email, String password)  {
    	driver.findElement(By.id(loc.getProperty("LP_emailID"))).sendKeys(email);
		driver.findElement(By.id(loc.getProperty("LP_password"))).sendKeys(password);
    }

	
    //This method is responsible to make driver to click on login button
	public void user_should_click_on_log_in_button() {
		driver.findElement(By.xpath(loc.getProperty("LP_loginbtn2"))).click();
		
	}

	
	//This method is responsible to validate user login using locator value from FILE:locator.properties
	public void user_should_be_able_to_logged_in_successfully()  {
		WebElement Logout = driver.findElement(By.xpath(loc.getProperty("LP_logoutbtn")));
		boolean flag = Logout.isDisplayed();
		String display = (flag==true) ? "Logged in Successfully!" : "No User Found!";
		System.out.println(display);
		QuitBrowser();
	}

	
	//This method is responsible to make driver to enter invalid email and password details in respective fields!
	public void user_should_enter_unregistered_and(String email, String password) {
		user_should_enter_registered_and(email,password);

	}

	
	//This method is responsible to verify that user is not able to log in using locator from FILE:locator.properties
	public void user_should_not_be_able_to_logged_in(){
		WebElement Login = driver.findElement(By.xpath(loc.getProperty("LP_logoutbtn")));
		boolean flag = Login.isDisplayed();
		String display = (flag==true) ?  "No User Found!" : "Logged in Successfully!";
		System.out.println(display);
		QuitBrowser();
	}
	
}





































/*@FindBy(id="Email")
WebElement email;
@FindBy(id="Password")
WebElement password;
@FindBy(xpath="//a[text()='Log in']")
WebElement loginbtn;
public LoginPage(){
	PageFactory.initElements(driver, this);
}*/





