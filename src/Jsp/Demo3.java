package Jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		//to open the browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//to maximize the URL
		driver.manage().window().maximize();
		Options m = driver.manage();
		Window w = m.window();
		w.maximize();
		
		//to enter the URL
		driver.get("https://www.google.com/");
		  
		//to get the title of the current webpage
		String title=driver.getTitle();
		System.out.println("Title:"+title);
		
		//to get the current URL
		String url=driver.getCurrentUrl();
		System.out.println("URL:"+url);
		
		//to close the browser
		Thread.sleep(1000);
		driver.close();
		

	}

}
