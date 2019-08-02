package advance;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

 
public class search {
	WebDriver driver;
  @Test
  public void f() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 //WebElement search=driver.findElement(By.id("myInput"));
		 //Actions act=new Actions(driver);
		 //act.keyDown(search,Keys.SHIFT).perform();
		 //act.sendKeys("b").pause(1000).sendKeys("a").pause(1000).sendKeys("g").build().perform();
		 //act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
		 
		 //driver.findElement(By.cssSelector("//input[value='FIND DETAILS']")).click();
		 
		 //String text=driver.findElement(By.xpath("//h4[contains(text(),'shoes')]")).getText();
		 //Assert.assertTrue(text.contains("shoes"));
		 
		 
	  
	  
  }
}
