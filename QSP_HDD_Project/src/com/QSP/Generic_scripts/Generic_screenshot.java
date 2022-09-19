package com.QSP.Generic_scripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Generic_screenshot extends Base_class
{
	public  void TakeScreenshot() throws IOException
	{
	String ph="./Screenshot ";
	Date d=new Date();
	String d1 = d.toString();
	String d2 = d1.replaceAll(":", "-");
	TakesScreenshot Ts=(TakesScreenshot) driver;
	File srs = Ts.getScreenshotAs(OutputType.FILE);
	File dst = new File(ph+d2+".jpg");
	FileUtils.copyFile(srs, dst);
	}

}
