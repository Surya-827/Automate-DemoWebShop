package newDemo;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
//import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multipletestcases {
	//public WebDriver driver;
	//public Logger logger;
	//WebDriverManager.chromedriver().setup();
	WebDriver driver;
	Logger logger=Logger.getLogger("devpinoyLogger");
	ChromeOptions ch=new ChromeOptions();
	//ch.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
	
	
	@BeforeMethod
	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@Test
	public void run()
	{
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//Logger logger=Logger.getLogger("devpinoyLogger");
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='A/B Testing']")).click();
		//driver.navigate().back();
		logger.info("verify A/B testing");
		Reporter.log("verify A/B testing");
	
	}
	@Test
	public void add()
	{
		driver.findElement(By.xpath("//a[text()='Add/Remove Elements']")).click();
		driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
		driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
		//driver.navigate().back();
		logger.info("it will add and delete button");
		Reporter.log("it will add and delete button");
	}
	@Test
	public void Auth()
	{
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		//driver.navigate().back();
		logger.info("Auth can be performed");
		Reporter.log("Auth can be performed");
		
	
	}
	@Test
	public void checkbox()
	{
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		//driver.navigate().back();
		logger.info("checkboxes are performed");
		Reporter.log("checkboxes are performed");
	
	}
	@Test
	public void ele() 
	{
		driver.findElement(By.xpath("//a[text()='Disappearing Elements']")).click();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		logger.info("it will return home");
		Reporter.log("it will return home");
	}
	@Test
	public void control()
	{
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bunny");
		//driver.findElement(By.xpath("//button[text()='Disable']")).click();
		//driver.navigate().back();
		
		logger.info("Dynamic contyrolles are working fine");
		Reporter.log("Dynamic contyrolles are working fine");
	
	}
	@AfterTest
	public void quit()
	{
		driver.close();
	}
}