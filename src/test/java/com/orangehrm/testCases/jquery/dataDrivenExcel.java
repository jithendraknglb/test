package com.orangehrm.testCases.jquery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataDrivenExcel {
public static void main(String[] args) throws IOException {
	
	String excelFilePath=".\\src\\main\\resource\\testcases.xlsx";
	
	FileInputStream inputStream=new FileInputStream(excelFilePath);
	
	XSSFWorkbook workBook=new XSSFWorkbook(inputStream);
	
	XSSFSheet sheet = workBook.getSheet("testCase1");
	
	//using for loop
	
//	int rows = sheet.getLastRowNum();
//	int cols = sheet.getRow(1).getLastCellNum();
//	
//	for (int r = 0; r <=rows ; r++) 
//	{
//		XSSFRow row = sheet.getRow(r);
//		
//		for (int c = 0; c < cols; c++)
//		{
//			XSSFCell cell = row.getCell(c);
//			
//			switch (cell.getCellType()) {
//			case STRING: System.out.print(cell.getStringCellValue()); break;
//			case NUMERIC:System.out.print(cell.getNumericCellValue()); break;
//			case BOOLEAN:System.out.print(cell.getBooleanCellValue()); break;
//			}
//			System.out.print(" | ");
//		}
//		System.out.println();
//	}
//	
			Iterator<Row> iterator = sheet.iterator();
			
			while(iterator.hasNext()) {
				
			XSSFRow	row = (XSSFRow) iterator.next();
				
				Iterator<Cell> cellIterator = row.cellIterator();
				
				while (cellIterator.hasNext()) {
					
					XSSFCell cell = (XSSFCell) cellIterator.next();
					
					switch (cell.getCellType()) {
					case STRING: System.out.print(cell.getStringCellValue()); break;
					case NUMERIC:System.out.print(cell.getNumericCellValue()); break;
					case BOOLEAN:System.out.print(cell.getBooleanCellValue()); break;
					}
					System.out.print(" | ");
				}
				System.out.println();
			}
}
}
