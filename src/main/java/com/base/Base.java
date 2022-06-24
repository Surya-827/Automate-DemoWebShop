package com.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.core.logging.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base 
{
    public static WebDriver driver;
    public static Properties prop;
    //public static Logger logger;
    
    public Base() 
    {
    	prop = new Properties();
    	try 
    	{
			FileInputStream file = new FileInputStream(".\\src\\main\\java\\com\\config\\config.properties");
			
			try 
			{
				prop.load(file);
			} 
			catch (IOException e) 
			{
				System.out.println("No Data found...");
			}
			
			
		} catch (FileNotFoundException e)
    	{
			System.out.println("File Not Found !...");
		}
    	
    }
    
    
	public void InitializeBrowser()
	{
		//logger = Logger.getLogger(Base.class);
		//logger.info("Trying to read browser name");
		System.out.println("Trying to read browser name");
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome"))
		{
			//logger.info("Identified the browser as "+browser);
		    System.out.println("Identified the browser as "+browser);
			WebDriverManager.chromedriver().setup();
   	        driver = new ChromeDriver();
   	    
		}
		else if (browser.equals("firefox"))
		{
			//logger.info("Identified the browser as "+browser);
			System.out.println("Identified the browser as "+browser);
			WebDriverManager.firefoxdriver().setup();
	   	    driver = new FirefoxDriver();
		}
		
		//logger.info("Trying to launch the application");
		System.out.println("Trying to launch the application");
		driver.get(prop.getProperty("url"));
		//logger.info("Application launched successfully");
		System.out.println("Application launched successfully");
	}
	
	
	public void End()
    {
   	 driver.quit();
   	 //logger.info("Closing the browser");
   	 System.out.println("Closing the browser");
    }
	
}