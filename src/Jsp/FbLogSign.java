package Jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogSign {
	//Declaration
	@FindBy(css=("input[type='email']"))
	private WebElement unt;
	
	@FindBy(name="pass")
	private WebElement pwt;
	
	@FindBy(css=("input[value='Log In']"))
	private WebElement logb;
	
	//Initialization
	public FbLogSign(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterUN(String un)
	{
		unt.sendKeys(un);
	}
	
	public void enterPW(String pw)
	{
		pwt.sendKeys(pw);
	}

	public void clickLog()
	{
		logb.click();
	}
}
//Refer FbLgSn