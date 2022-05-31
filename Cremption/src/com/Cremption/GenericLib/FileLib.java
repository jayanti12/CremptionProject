package com.Cremption.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	

	

	public String readPropertyData(String propPath,String Key) throws Throwable {
	FileInputStream fis=new FileInputStream(propPath);
	Properties prop=new Properties();
	prop.load(fis);
	String propValue = prop.getProperty(Key ,"Incorrect Key");
	return propValue;
	}
	
	public String readExcelData(String excelPath, String sheet, int cell,int row) throws Throwable {
	FileInputStream fis=new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(fis);
	return wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}
		
	public void writeExcelExcelData(String excelPath,String sheet,int row,int cell,String data) throws Throwable {
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		 wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		 
		 
		 FileOutputStream fos= new FileOutputStream(excelPath);
		 wb.write(fos);
	}

	public String readPropertyData(String propPath, String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
