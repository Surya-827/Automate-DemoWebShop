package newDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleDemo {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.gmail.com/");
        driver.manage().window().maximize();
        
        WebElement box = driver.findElement(By.xpath("//input[@type='email']"));
		
        Actions act = new Actions(driver);
        act.moveToElement(box).build().perform();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        box.click();
        box.sendKeys("Hello Hema!");
        
	}

}
