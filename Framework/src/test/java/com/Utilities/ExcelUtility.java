package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.page.Registration;


public class ExcelUtility {
	
	public void getTestData() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\pdc4-training.pdc4\\Desktop\\Demo1.xls");
        HSSFWorkbook x = new HSSFWorkbook(file);
		HSSFSheet s = x.getSheet("Sheet1");
		int rowcount = s.getLastRowNum();
		System.out.println(rowcount);
		
		for(int i=1;i<=rowcount;i++)
		{
//			for(int j=1;j<=i;j++)
//			{
		String FirstName = s.getRow(i).getCell(0).getStringCellValue();
		String LastName = s.getRow(i).getCell(1).getStringCellValue();
		String Email = s.getRow(i).getCell(2).getStringCellValue();
		String Password = s.getRow(i).getCell(3).getStringCellValue();
		String ConfirmPassword = s.getRow(i).getCell(4).getStringCellValue();
		System.out.println(FirstName+" "+LastName+" "+Email+" "+Password+" "+ConfirmPassword+" ");
		Registration.registration(FirstName,LastName,Email,Password,ConfirmPassword);
//			}
//			
		}
		
	}
	public static void main(String args[]) throws IOException {
		ExcelUtility e = new ExcelUtility();
		e.getTestData();
		
		
	}

}
