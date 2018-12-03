package Jsp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage {
	//Declaration
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	//Initialization
	public DownloadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void getLinks()
	{
		int count=allLinks.size();
		System.out.println(count);
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
	}
//Refer seleniumdownload
}
