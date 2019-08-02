package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class loginpagewithpagefactory {
	WebDriver driver;
	public loginpagewithpagefactory(WebDriver driver)
	{
		this.driver=driver;
	}
	//@FindBy is used instead of "by."-- used to optimise execution
	@FindBy(how=How.NAME,using="firstName")
	WebElement firstName;
	@FindBy(how=How.NAME,using="lastName")
	WebElement lastName;
	@FindBy(how=How.NAME,using="phone")
	WebElement phone;
	@FindBy(how=How.NAME,using="address1")
	WebElement address1;
	@FindBy(how=How.NAME,using="address2")
	WebElement address2;
	@FindBy(how=How.NAME,using="city")
	WebElement city;
	@FindBy(how=How.NAME,using="state")
	WebElement state;
	@FindBy(how=How.NAME,using="postalCode")
	WebElement postalCode;
		
	
	public void contact(String a,String b,String c)
	{
		firstName.sendKeys(a);
		lastName.sendKeys(b);
		phone.sendKeys(c);
	}	
	public void mailing(String d,String e,String f)
	{
		address1.sendKeys(d);
		address2.sendKeys(e);
		city.sendKeys(f);
	}	
	
}
