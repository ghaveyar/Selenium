package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.Login;
import utilitypackage.browserfactory;

public class logintestcase {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriver driver=browserfactory.startBrowser("chrome", "http://demoaut.com/");
	  Login log=new Login(driver);
	  log.Loginuser("tutorial", "tutorial");
	  
  }
}
