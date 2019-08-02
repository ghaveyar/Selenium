package advance;
import org.testng.annotations.Test;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Actionsdemo {
	WebDriver driver;	
  @Test
  public void f() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 WebElement aboutus=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
		 WebElement ouroffice=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
		 WebElement chennai=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"));
		 
		 Actions act=new Actions(driver);
		 act.moveToElement(aboutus).click().build().perform();
		 
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.elementToBeClickable(ouroffice));
		 act.moveToElement(ouroffice).click().build().perform();
		 
		 wait.until(ExpectedConditions.elementToBeClickable(chennai));
		 act.moveToElement(chennai).click().build().perform();	
		//Switch from parent to child window and get text and again navigate back to parent window
		 String parentid=driver.getWindowHandle();
		 Set<String> set=driver.getWindowHandles();
		 for(String s:set)
		 {
			 driver.switchTo().window(s);	 
		 }
		 driver.switchTo().frame(driver.findElement(By.name("main_page")));
		 //driver.switchTo().frame("main_page");
		 String address=driver.findElement(By.tagName("address")).getText();
		 System.out.println(address);
		 //driver.close();//closes child window
		 driver.switchTo().window(parentid);//it navigates back to parent window 
		 //driver.close();//closes last operating window
		//driver.quit();//closes both parent and child window
  }
}
