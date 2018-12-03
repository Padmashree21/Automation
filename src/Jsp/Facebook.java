package Jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//login to facebook
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("padmavenkat1996@gmail.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("saraskumud");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();

	}

}
