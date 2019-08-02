package advance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test (priority=0)
  public void f() {
	  System.out.println("Main function-1");
	  
  }
  @Test(enabled=false)
  public void f1() {
	  System.out.println("Main function-2");
	  
  }
  @Test(priority=1)
  public void f2() {
	  System.out.println("Main function-3");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before main function");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After main function");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }
}
