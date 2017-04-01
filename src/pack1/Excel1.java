package pack1;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1
{
	public static void main(String[] args) throws Exception 
	{
			File src=new File("C:\\Users\\Jyothi-PC\\Desktop\\data1.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheetAt(0);
			int rc = sheet1.getLastRowNum();
			System.out.println(rc);
			for(int i=0; i<rc;i++)
			{
				String data = sheet1.getRow(i).getCell(0).getStringCellValue();
				System.out.println(data);
				String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(i+data1);
			}
			
			
			wb.close();
			
	}

}
