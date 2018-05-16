package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String titleTest()
	{
		return driver.getTitle();
	}
	public HomePage login()
	{
		username.sendKeys("LoveSoni");
		password.sendKeys("Monster123energy");
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{}
		loginbtn.click();
		return new HomePage();
	}
}

