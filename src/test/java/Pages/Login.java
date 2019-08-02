package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By username=By.name("userName");
	By password=By.name("password");
	By signin=By.name("login");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Loginuser(String a,String b)
	{
		driver.findElement(username).sendKeys(a);
		driver.findElement(password).sendKeys(b);
		driver.findElement(signin).click();
	}
}
