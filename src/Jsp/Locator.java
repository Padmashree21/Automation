package Jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/V%20Padmashree/Desktop/Cigniti/Sample.html");
		
		//By using id
		driver.findElement(By.id("fp")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//By using name
		driver.findElement(By.name("forgot")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//By using className
		driver.findElement(By.className("pass")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//By using tagName
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//By using linkText
		driver.findElement(By.linkText("Forgot Password???")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//By using partialLinkText
		driver.findElement(By.partialLinkText("Inbox(20)")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		
	}

}
