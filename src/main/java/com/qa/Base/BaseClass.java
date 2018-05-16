package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	public BaseClass()
	{
		prop=new Properties();
		try {
			FileInputStream fin=new FileInputStream("D:\\Naveen Automation\\java Practical\\POMGit\\src\\main\\java\\com\\qa\\config\\config.properties");
			try {
				prop.load(fin);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

public void init()
{
		String brows=prop.getProperty("browser");
		if(brows.equals("firefox"))
		{System.setProperty("webdriver.gecko.driver","D:\\Love_Testing\\Senium_Naveen\\gecko_Driver\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
}	
}