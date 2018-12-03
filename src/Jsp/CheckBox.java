package Jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/V%20Padmashree/Desktop/Cigniti/CheckBox.html");
		
		//To get address of all checkbox
		List<WebElement> allCb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//To count the number of checkbox
		int count=allCb.size();
		System.out.println(count);
		
		//To select all checkbox
		for(int i=0;i<count;i++)
		{
			WebElement cb=allCb.get(i);
			cb.click();
			Thread.sleep(500);
		}
		
		//To select all checkbox in reverse order
		for(int i=count-1;i>0;i--)
		{
			WebElement cb=allCb.get(i);
			cb.click();
			Thread.sleep(500);
		}
		
		//To select even checkbox
		for(int i=0;i<count;i+=2)
		{
			WebElement cb=allCb.get(i);
			cb.click();
			Thread.sleep(500);
		}
		
		//To select odd checkbox
		for(int i=1;i<count;i+=2)
		{
			WebElement cb=allCb.get(i);
			cb.click();
			Thread.sleep(500);
		}
		Thread.sleep(1000);
		driver.close();
		}
		

	}
