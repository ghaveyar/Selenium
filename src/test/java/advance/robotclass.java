package advance;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class robotclass {
  @Test
  public void f() throws AWTException {
	  	 Robot robot=new Robot();
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 //open page
		 driver.get("file:///C:/Training/login.html");
		 driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
		 robot.setAutoDelay(1000);
		 String path="C:\\Training\\seleniumexcel.xlsx";
		 StringSelection sel=new StringSelection(path);
		 //copy to clipboard--performs ctrl+c operation
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		 robot.setAutoDelay(1000);
		 //paste to clipboard function
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.setAutoDelay(1000);
		 //after pasting release key to navigate cursor to next highlighted button
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_ENTER);	 
  }
}
