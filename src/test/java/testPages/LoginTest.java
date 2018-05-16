package testPages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

import com.qa.Base.BaseClass;

public class LoginTest extends BaseClass {
	LoginPage lpage;
	HomePage hpage;
	public LoginTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		init();
		lpage=new LoginPage();
		hpage=new HomePage();
	}
	@Test
	public void titlTest()
	{
		String title=lpage.titleTest();
		Assert.assertEquals(title,"Free CRM software in the cloud powers sales and customer service");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
