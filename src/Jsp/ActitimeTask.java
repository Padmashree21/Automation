package Jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTask {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='Delete']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Cancel']")).click();
		Thread.sleep(3000);
		
		
		driver.close();
	}

}
