package advance;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class webdriver {
	WebDriver driver;
	//String expectedresult="Find a Flight: Mercury Tours:";
	
	
  @Test
  public void f() {
	  	//driver.findElement(By.name("userName")).sendKeys("tutorial");
	  //	driver.findElement(By.name("password")).sendKeys("tutorial");
	  	//driver.findElement(By.name("login")).click();
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	//WebDriverWait wait=new WebDriverWait(driver,30);
	  	//wait.until(ExpectedConditions.titleIs("Find a Flight: Mercury Tours:"));
	  	//Assert.assertEquals(expectedresult, driver.getTitle());
	    Actions act= new Actions(driver);
	  	WebElement resize= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	  	act.dragAndDropBy(resize, 400, 200).build().perform();
	  	
	  	
  }
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://jqueryui.com/resources/demos/resizable/default.html");	 
 }

  @AfterClass
  public void afterClass() {
	  System.out.println("After main function");
  }
}
