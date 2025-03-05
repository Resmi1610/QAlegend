package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell_Utility 

{
		
		static FileInputStream f;
		static XSSFWorkbook w;
		static XSSFSheet s;

		public static String getStringData(int a,int b, String filePathName,String sheetName ) throws IOException
		{
			f=new FileInputStream(System.getProperty("user.dir")+filePathName);
			w=new XSSFWorkbook(f);
			s= w.getSheet(sheetName);
			Row r=s.getRow(a);
			Cell c=r.getCell(b);
			
			
			return c.getStringCellValue();
			
			
		}
		public static String getIntegerData(int a,int b,String filePathName,String sheetName) throws IOException
		{
			f=new FileInputStream(System.getProperty("user.dir")+filePathName);
			w=new XSSFWorkbook(f);
			s= w.getSheet(sheetName);
			Row r=s.getRow(a);
			Cell c=r.getCell(b);
			int y=(int) c.getNumericCellValue();
			
			return String.valueOf(y);
			
			
		}
	}



