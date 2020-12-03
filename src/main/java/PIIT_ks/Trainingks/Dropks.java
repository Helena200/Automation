package PIIT_ks.Trainingks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropks {
	private static final WebElement CreateAnAccounts = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//how to open the browser
		System.setProperty(".chrome.driver","C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createacoounts=driver.findElement(By.linkText("Create New account"));
		CreateAnAccounts.click();
		Thread.sleep(6000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0.1000)");
		
		WebElement birth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(birth);
		ob.selectByValue("6");
	
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select di=new Select(day);
		di.selectByValue("10");
		
		
		
		
		
		
		
	}
	

}
