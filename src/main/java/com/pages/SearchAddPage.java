package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.base.TestBase;


public class SearchAddPage extends TestBase{
    
	// Scenario - 1
	//This method responsible for verifying user on home page by logging-in using and email and password
	public void user_should_be_on_home_page_by_loggingin_using_and(String email, String password) throws IOException {
		IntializeBrowser();
		Login(email,password);
	}


	//This method is responsible for verifying user enters product name in search bar
	public void user_enters_in_search_bar(String productname) {
		driver.findElement(By.id(loc.getProperty("SP_searchbar"))).sendKeys(productname);
	}


	//This method is responsible for verifying user clicks on search button
	public void user_clicks_on_search_button() {
		driver.findElement(By.xpath(loc.getProperty("SP_searchbtn"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


	//This method is responsible for verifying user clicks on add to cart button
	public void user_clicks_on_add_to_cart_button() {
		driver.findElement(By.xpath(loc.getProperty("SP_add2cart"))).click();
		boolean flag = driver.findElement(By.xpath("//div[@class='bar-notification success']")).isDisplayed();
		String out = flag == true ? "The product has been added to your shopping cart successfully"
				: "Please Specify and then add to cart!";
		System.out.println(out);

	}

	
	//This method is responsible for verifying user added items either adding into cart or not
	public void user_added_should_be_added_to_shoppingcart(String productname) throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("SP_shopingCartbtn"))).click();
		String path = "//table//tr[@class='cart-item-row']//td[@class='product']//a[text()=\'%s\']";
		String flag = driver.findElement(By.xpath(String.format(path, productname))).getText();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		if (flag.equals(productname)) {
			System.out.println("Searched item found inside cart...");
		} else {
			System.out.println("No records found!...");
		}
		Thread.sleep(3000);
		QuitBrowser();

	}

	// Scenario - 2
	//This method is responsible for verifying user enters product name in search results
	public void user_gets_search_results() throws InterruptedException {
		boolean flag = driver.findElement(By.xpath("//div[@class='search-results']/strong[1]")).isDisplayed();
		if (flag == true) {
			System.out.println("No products were found that matched your criteria.");
		} else {
			System.out.println("loading searched items...");
		}

		Thread.sleep(3000);
		QuitBrowser();
	}

}