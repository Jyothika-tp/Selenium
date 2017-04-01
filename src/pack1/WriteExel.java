package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExel 
{
	public static void main(String[] args) throws Exception 
	{
		
		File src=new File("C:\\Users\\Jyothi-PC\\Desktop\\data1.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(0).createCell(3).setCellValue("fail");
		sheet1.getRow(7).createCell(2).setCellValue("187");
		sheet1.getRow(8).createCell(3).setCellValue("1234");
		
		FileOutputStream fot=new FileOutputStream(src);
		wb.write(fot);
		wb.close();
		
	}
	

}
