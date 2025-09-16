package StepDefination;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivern {

	
	public static void main(String args[]) throws FileNotFoundException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\ssingh\\Desktop\\UserDetail.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> row=sheet.iterator();
			Row	firstrow=row.next();
			Iterator<Cell> cel=firstrow.cellIterator();
			while(cel.hasNext())
			{
				Cell value=cel.next();
				System.out.println(value);
			}
			
			}
			
		}
		
		
	}
	
	
	
}
