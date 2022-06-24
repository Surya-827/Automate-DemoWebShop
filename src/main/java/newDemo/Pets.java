package newDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pets {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		driver.manage().window().maximize();
//WebElement ele=driver.findElement(By.xpath("//input[@name='keyword']"));
//ele.click();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Enter the Store']"));

		ele.click();
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@name='searchProducts']"));
//ele1.sendKeys("fish");
		ele1.click();
		WebElement ele2 = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(5000);
		ele2.sendKeys("fish");
//thread.slepp(5000);
		WebElement ele3 = driver.findElement(By.xpath("//input[@name='searchProducts']"));
		ele3.click();
//a[text()='Fresh Water fish from China']
		WebElement ele4 = driver.findElement(By.xpath("//a[text()='Fresh Water fish from China']"));
		ele4.click();
		Thread.sleep(5000);
//a[text()='EST-21']
		WebElement ele5 = driver.findElement(By.xpath("//a[text()='EST-21']"));
		ele5.click();
		Thread.sleep(3000);
//a[@class='Button']
		WebElement ele6 = driver.findElement(By.xpath("//a[@class='Button']"));
		ele6.click();
		Thread.sleep(5000);

		driver.close();

	}
//img[@src='../images/sm_fish.gif']
//input[@size='14']

}