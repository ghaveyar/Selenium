package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class switchto {
	WebDriver driver;
  @Test
  public void f() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		 //to get the message within alert box
		 String msg=driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
		 System.out.println(msg);
		 driver.close();
		 
  }
}
