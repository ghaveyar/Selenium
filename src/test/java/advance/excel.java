package advance;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel {
  @Test
  public void readdata() throws IOException
  {
	  File src=new File("C:\\Training\\Seleniumexcel.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  
	  String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	  System.out.println("Data from Excel is:"+data0);
	  
	  String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
	  System.out.println("Data from Excel is:"+data1);
	  
	  wb.close();
	   
  }
}
