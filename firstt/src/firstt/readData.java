package firstt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class readData {
	
	
	@Test
	public void test() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter subject");
		String st = sc.next();
		
		FileInputStream fis=new FileInputStream("./data/input.xlsx");
		Workbook W = WorkbookFactory.create(fis);
		Sheet s = W.getSheet("Sheet1");
		Row r = s.getRow(0);
		int c = r.getPhysicalNumberOfCells();
		System.out.println(c);
		//String s1="social";
		int col=-1;
		for(int i=0;i<c;i++)
		{
			String s2 = r.getCell(i).getStringCellValue();
			boolean flag = s2.equals(st);
			if(flag==true)
			{
				col = i;
				break;
			}
		}
		int r1 = s.getLastRowNum();
		System.out.println(r1);
		for(int j=0;j<r1;j++) {
		String s3 = s.getRow(j).getCell(col).getStringCellValue();
		System.out.println(s3);
		}
		
		
	}

}
