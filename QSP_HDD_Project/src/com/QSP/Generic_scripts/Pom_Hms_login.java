package com.QSP.Generic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Hms_login 
{
	//Declaration
	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	
	//intialization
	public Pom_Hms_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	public void UsnTbox(String un)
	{
		username.sendKeys(un);
	}
	public void pwdBox(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void logBtn()
	{
		loginbtn.click();
	}
	

}
