package pack1;

import Library.ExcelDataConfig;

public class ReadExceldata 
{
	public static void main(String[] args) 
	{
		ExcelDataConfig obj=new ExcelDataConfig("C:\\Users\\Jyothi-PC\\Desktop\\data1.xlsx");
		
		System.out.println(obj.getData(1, 0, 0));
	
	}
}
