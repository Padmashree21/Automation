package Jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDob {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		
		WebElement date = driver.findElement(By.id("day"));
		date.sendKeys("21");
		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("Dec");
		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("1996");
		
		Select d=new Select(date);
		Thread.sleep(1000);
		
		Select m=new Select(month);
		Thread.sleep(1000);
		
		Select y=new Select(year);
		Thread.sleep(1000);
		
		driver.close();
	}

}

