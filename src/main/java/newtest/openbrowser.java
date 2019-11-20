package newtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class openbrowser {
	WebDriver driver; 
  @BeforeTest
  public void beforeTest() {
	  driver=Utility.openBrowser("chrome");
	  driver.get("http://newtours.demoaut.com/");
  }
  @Test
  public void f() {
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	 WebDriverWait wait=new WebDriverWait(driver, 1000);
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
	  
	  Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
	  //System.out.println("Google...!!");
  }
  @Test
  public void f1() {
	  driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
  Select sel=new Select(driver.findElement(By.name("passCount")));
  sel.selectByIndex(2);
  sel=new Select(driver.findElement(By.name("fromPort")));
  sel.selectByValue("London");
  sel=new Select(driver.findElement(By.name("toPort")));
  sel.selectByVisibleText("Paris");
  driver.findElement(By.xpath("//input[@value='First' and @type='radio']")).click();
  }
  @AfterTest
  public void afterTest() {
	 driver.close();
  }

}
