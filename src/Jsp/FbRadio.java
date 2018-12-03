package Jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		
		//To check whether the radio button is selected or not
		WebElement cb = driver.findElement(By.xpath("//input[@value='1']"));
		cb.click();
		WebElement cbo=driver.findElement(By.xpath("//input[@value='2']"));
		if(cb.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		if(cbo.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		driver.close();
	}
}
