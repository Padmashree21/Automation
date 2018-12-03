package Jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		
		//to open the browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		driver.get("http://google.com/");
		Thread.sleep(1000);
		
		//to enter the URL
		driver.navigate().to("http://facebook.com/");
		Thread.sleep(1000);
		
		//to navigate to previous page
		driver.navigate().back();
		Thread.sleep(1000);
		
		//to navigate to next page
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//to refresh the current page
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		

	}

}
