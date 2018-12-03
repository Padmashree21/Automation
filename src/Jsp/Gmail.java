package Jsp;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/");
		
		//To login to gmail
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("padmavenkat2112@gmail.com");
		driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("jodhaakbar");
		driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		Thread.sleep(1000);
		
		

	}

}


