package Jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/GeckoDriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/V%20Padmashree/Desktop/Cigniti/Link.html");
		
		//To get address of all links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

		//To get number of links
		int count=allLinks.size();
		System.out.println(count);
		
		//To print all links
		for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			String text=link.getText();
			System.out.println(text);
		}
		driver.close();	
		}
	}
