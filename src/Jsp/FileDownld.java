package Jsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.cert.PKIXRevocationChecker.Option;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownld {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
//		FirefoxProfile profile=new FirefoxProfile();
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
//		
//		FirefoxOptions option=new FirefoxOptions();
//		option.setProfile(profile);
//		
//		WebDriver driver = new FirefoxDriver(option);
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		String xp="//td[.='Java']/..//a[.='Download']";
		driver.findElement(By.xpath(xp)).click();
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
	}

}
