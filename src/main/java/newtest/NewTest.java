package newtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class NewTest {
	WebDriver driver;
  @Test(priority=2)
  public void f() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_C2a.04.30\\Desktop\\selenium drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.google.com");
Assert.assertEquals("Google",driver.getTitle());
driver.close();

  }
@Test(priority=1)
public void f1() {
System.setProperty("webdriver.ie.driver","C:\\Users\\Training_C2a.04.30\\Desktop\\selenium drivers\\IEDriverServer.exe");
driver = new InternetExplorerDriver();
driver.get("https://www.google.com");
Assert.assertEquals("Google",driver.getTitle());
driver.close();


	  
  }
}










