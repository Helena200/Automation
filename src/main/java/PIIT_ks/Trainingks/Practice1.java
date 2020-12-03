package PIIT_ks.Trainingks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
public static void main(String[]args) { 
System.setProperty("webdriver.chrome.driver","C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");



	
	driver.manage().window().maximize();
	WebElement Mail=driver.findElement(By.id("email"));
	Mail.sendKeys("abc");
	
	

	
	
	
			
	
}

}
