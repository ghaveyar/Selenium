package advance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.openqa.selenium.WebDriver;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

public class resultsexcel {
	WebDriver driver;
  @Test
  public void readdata() throws IOException
  {
	  File src=new File("C:\\Training\\Seleniumexcel.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  //to write the data to excel
	  sheet1.getRow(0).createCell(2).setCellValue("pass");
	  sheet1.getRow(1).createCell(2).setCellValue("fail");
	 
	  FileOutputStream fo=new FileOutputStream(src);
	  wb.write(fo);//to save the data written in excel
	  wb.close();
	   
  }
}
