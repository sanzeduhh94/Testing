package com.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.TestBase.TestBase;

public class TestUtil extends TestBase{
	public static long PAGELOADOUTTIME=20;
	public static long IMPLICITYWAIT=30;
	
	static Workbook book; //import from apache poi
	static Sheet sheet;
	static FileInputStream file;
	
	//defining path for excel file
	public static String testdata_path= "C:\\Users\\sanze\\eclipse-workspace\\com.newtours.uat\\src\\main\\java\\com\\TestData\\users.xlsx";
	
	public static Object [][] getTestData(String sheetName){
		
			try {
				file = new FileInputStream(testdata_path);
				book = WorkbookFactory.create(file);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		sheet = book.getSheet(sheetName);
		Object [][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i = 0; i<sheet.getLastRowNum();i++) {
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}
}
