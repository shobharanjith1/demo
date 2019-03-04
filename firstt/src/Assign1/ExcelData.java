package Assign1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelData {
	@Test
	public void excel() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/input.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		System.out.println(c.toString());	
}
}
