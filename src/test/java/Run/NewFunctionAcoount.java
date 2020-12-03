package Run;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.facebook.Forgot_password;
import Pages.facebook.Home;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewFunctionAcoount {
	public static WebDriver driver;
  @Test
  public void f6() {
	  //open the facebook site and verify the login function.
	  Home ob = new Home(driver);
	  ob.emailoffinput();
	  ob.passwfieldkeys();
	  ob.Signingin();
	  ob.emailofinput("karimanursing@gmail.com");
	  ob.psswrdofield("to");
	  ob.Signingin();
	  
  }
 @Test
 public void Forgotlinkforpassword() {
	 Home it=new Home(driver);
	 it.Forgotlink();
	 Forgot_password ds=new Forgot_password(driver);
	 SoftAssert gt=new SoftAssert();
	 
 }
  

  @BeforeClass
  public void beforeClass() {
	  Driver("Chrome","https://www.facebook.com");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
	  
  }
  public static void Driver(String browser,String URI) {
		if(browser.equalsIgnoreCase("Chrome")) {
			String director=System.getProperty("user.dir");
			
			System.out.println();
			System.setProperty("webdriver.chrome.driver",director+"\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(URI);
			driver.manage().window().maximize();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			String director=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",director+"\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(URI);
			driver.manage().window().maximize();
	  }
	  
	 }
		
			
}

