package newDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDemo {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		ChromeOptions opt = new ChromeOptions();
		opt.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement widget = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		act.moveToElement(widget);
		Thread.sleep(3000);
		
		widget.click();
		WebElement navWidget = driver.findElement(By.xpath("//div[@id='nav-subnav']/a[2]"));
		
		act.moveToElement(navWidget);
		Thread.sleep(3000);
		
		
		
		

	}

}
