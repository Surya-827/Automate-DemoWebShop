package com.base;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader configFile;
	public static FileReader locFile;
	

	// This method responsible for driver session connection along with navigation link!
	public void IntializeBrowser() throws IOException {

		if(driver==null) {
			
			configFile = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\com.config\\config.properties");
			locFile = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\com.config\\locators.properties");
			
			prop.load(configFile);
			loc.load(locFile);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		}
	  

	}
	

	// This Method is responsible to User login with user defined credentials!
	public void Login(String email,String password){
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li[2]/a")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}
	

	//This Method is responsible for terminating driver session connection!
	public void QuitBrowser() {

		driver.quit();
	}

}







































/**
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
**/