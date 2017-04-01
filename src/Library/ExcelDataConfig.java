package Library;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig
{
// XML SpreadSheet Format
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelDataConfig(String excelPath) 
	{
		
				try 
				{
					File src=new File("C:\\Users\\Jyothi-PC\\Desktop\\data1.xlsx");
					FileInputStream fis = new FileInputStream(src);
					wb=new XSSFWorkbook(fis);
								 
				} catch (Exception e) 
				{
					System.out.println(e.getMessage());
				
				}
	}
	public String getData(int sheetNumber, int row, int column)
	{
m		sheet1=wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

}
