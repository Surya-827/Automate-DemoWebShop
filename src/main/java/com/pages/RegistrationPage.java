package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.base.Base;
import com.base.TestBase;


public class RegistrationPage extends TestBase{
	
	
    //This method is responsible to check whether user landed on given URL Page
	public void user_is_on_demo_web_shop_page() throws IOException{
		IntializeBrowser();

	}
	
	//This method is responsible to make driver to click on register button
	public void user_click_on_register_button() {
		driver.findElement(By.xpath(loc.getProperty("RP_regbtn"))).click();
	}
	
	
	//This method is responsible to verify that user is on register page or not
	public void user_is_on_registration_page() {
		String Expected_Title = "Demo Web Shop. Register";
		String Actual_Title = driver.getTitle();
		if (Expected_Title.equals(Actual_Title)) {
			System.out.println("Registration page opened succesfully");
		} else {
			System.out.println("Registration page not opened");
		}
		QuitBrowser();
	}
	
	//This method is responsible to make driver to select gender based on user defined data 
	public void user_clicks_on_the(String gender) {
		if (gender.equals("male")) {
			driver.findElement(By.xpath(loc.getProperty("RP_genderM"))).click();
		} else if (gender.equals("female")) {
			driver.findElement(By.xpath(loc.getProperty("RP_genderF"))).click();
		} else {
			System.out.println("The gender was not selected");
		}
	}
	
	//This method is responsible to enter user first name and last name in its respective fields
	public void user_enters_and(String firstname, String lastname) {
		driver.findElement(By.id(loc.getProperty("RP_fname"))).sendKeys(firstname);
		driver.findElement(By.id(loc.getProperty("RP_lname"))).sendKeys(lastname);
	}
	
	//This method is responsible to enter user email in its respective fields
	public void user_types(String email) {
		driver.findElement(By.id(loc.getProperty("RP_email"))).sendKeys(email);

	}
	
	//This method is responsible to enter user password and re-enter password in its respective fields
	public void user_Types_(String password, String confirmpass) {
		driver.findElement(By.id(loc.getProperty("RP_pwd"))).sendKeys(password);
		driver.findElement(By.id(loc.getProperty("RP_cpwd"))).sendKeys(confirmpass);

	}
	
	//This method is responsible to make driver to click on register button
	public void user_Clicks_on_register_button() {
		driver.findElement(By.id(loc.getProperty("RP_regbtn2"))).click();

	}
	
	//This method is responsible to validate whether user is registered successfully or not
	public void user_is_succesfully_registered() {
		String Expected_Result = "Your registration completed";
		String Actual_Result = driver.findElement(By.xpath("//div[@class='result']")).getText();
		if (Expected_Result.equals(Actual_Result)) {
			System.out.println("Entered valid Details");
		} else {
			System.out.println("Entered invalid Details");
		}
		QuitBrowser();
	}
	
	//This method is responsible to validate user is not able to register
	public void user_should_not_able_to_registered() {

		String Expected_Result = "Demo Web Shop. Register";
		String Actual_Result = driver.getTitle();
		if (Expected_Result.equals(Actual_Result)) {
			System.out.println("Oops!invalid data,please try with valid data");
		} else {
			System.out.println("Website Error");
		}
		QuitBrowser();
	}
	
	

}