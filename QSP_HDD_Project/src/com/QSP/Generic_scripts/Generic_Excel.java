package com.QSP.Generic_scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel 
{
	public static String getdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		String val="";
		FileInputStream fin=new FileInputStream("./Excel/test_data.xlxs");
		Workbook book = WorkbookFactory.create(fin);
		val=book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return val;	
	}
	

}
