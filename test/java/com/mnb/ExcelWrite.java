package com.mnb;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\ADVENTURES200\\eclipse-workspace\\MavenPractice\\src\\test\\resources\\september.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("sep");
		Row r = s.createRow(0);
		Cell c =r.createCell(0);
		
		c.setCellValue("agustbatch");
		
		FileOutputStream f1 = new FileOutputStream(f);
		w.write(f1);
	}

}
