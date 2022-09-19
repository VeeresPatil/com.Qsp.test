package com.QSP.Generic_scripts;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class browser_parelell extends Base_class
{
	@Parameters({"browser"})
	@BeforeMethod
	public void excel(String browser)
	{
		System.setProperty("webdriver.gecko.driver","./Builds/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./Builds/chromedriver.exe");
		if(browser.equals("Firefox"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
	}
	

}
