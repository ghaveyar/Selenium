package advance;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class exceldatawithwebsite {
	WebDriver driver;
  @Test
  public void readdata() throws IOException
  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demoaut.com/");
		 
	  File src=new File("C:\\Training\\Seleniumexcel.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  
	  String username=sheet1.getRow(0).getCell(0).getStringCellValue();
	  System.out.println("Username is:"+username);
	  driver.findElement(By.name("userName")).sendKeys(username);
	  
	  String password=sheet1.getRow(0).getCell(1).getStringCellValue();
	  System.out.println("Password is:"+password);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  
	  wb.close();
	   
  }
}
