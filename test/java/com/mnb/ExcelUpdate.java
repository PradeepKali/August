package com.mnb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	
public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\ADVENTURES200\\eclipse-workspace\\MavenPractice\\src\\test\\resources\\september.xlsx");      
		FileInputStream f1 = new FileInputStream(f);
        Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.getSheet("sep");
			Row r = s.getRow(0);
			Cell c = r.getCell(0);
			int celltype = c.getCellType();
			if (celltype==1) {
				String value = c.getStringCellValue();
				System.out.println(value);
				if (value.equals("agustbatch")) {
					c.setCellValue("pulsar");
					
				}
			}
			 
				FileOutputStream f2 = new FileOutputStream(f);
				w.write(f2);
				}
	}
	




