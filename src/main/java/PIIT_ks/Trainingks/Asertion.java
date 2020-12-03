package PIIT_ks.Trainingks;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Asertion {
	private static final String URI = null;
	static WebDriver driver;

	public static void main(String[] args) {
		Driver("Firefox", "https://www.Amazon.com");
		
		// TODO Auto-generated method stub
		//System.setProperty(
		 //driver=new ChromeDriver();
		//FireFox
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Driver\\geckodriver.exe");
		//driver=new FirefoxDriver();
		//driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
		WebElement CreateNewAccounts= driver.findElement(By.linkText("Create New Account"));
		Boolean button=CreateNewAccounts.isDisplayed();
		System.out.println(button);
		WebElement ds= driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
		 String textheading=ds.getText();
		 System.out.println(textheading);
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
