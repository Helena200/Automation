package PIIT_ks.Trainingks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wind {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//how to open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions its=new Actions(driver);
		its.moveToElement(driver.findElement(By.xpath("//*[text()='Hello Sign in']"))).build().perform();
		Thread.sleep(3000);
		its.moveToElement(driver.findElement(By.xpath("//*[text()='Sign in'])[2]"))).build().perform();
		
		Set<String>MultipleWindows=driver.getWindowHandles();
		
		
	}

}
