package data.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_Fetching {
	
	public String properties_Fetching(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\GCCA22\\actiLoginData.PROPERTIES");
		Properties pobj = new Properties();
		pobj.load(fis);
		String data = pobj.getProperty(key);
		return data;
			
	}
	public String Excel_Fetch(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\GCCA22\\Book1.xlsx");
		Workbook book =WorkbookFactory.create(fis);
		Sheet sh =book.getSheet(sheet);
		Row ro = sh.getRow(row);
		Cell ce = ro.getCell(cell);
		String data = ce.getStringCellValue();
		return data;
		
	
	}

}
