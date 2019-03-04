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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData {
	@DataProvider
	public String[][] test() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		FileInputStream fis=new FileInputStream("./data/input.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet("Sheet1");
		int rc = s.getPhysicalNumberOfRows();
		Row r1 = s.getRow(0);
		int cc = s.getRow(0).getLastCellNum();
		
		String [][] arr=new String[rc-1][cc];
		
		for(int i=1;i<rc;i++) {
			for(int j=0;j<r1.getLastCellNum();j++)
			{
				Cell c = s.getRow(i).getCell(j);
				arr[i-1][j] = c.toString();
			}
			
		}
		return arr;
	}
	
	@Test(dataProvider="test")
	public void t1(String s1,String s2)
	{
		System.out.println(s1);
		System.out.println(s2);
	}
}
