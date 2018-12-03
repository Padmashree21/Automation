package Jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeHelp {
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
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@onclick='openHelpAndSupportMenu(event)']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		Thread.sleep(2000);
		
		WebElement build = driver.findElement(By.xpath("//span[.='(build 40469)']"));
		Thread.sleep(2000);
		System.out.println(build.getText());
		
		driver.close();

	}

}
