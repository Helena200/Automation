package PIIT_ks.Trainingks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Popups {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//how to open the browser
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		driver.manage().window().maximize();
		/*WebElement sb=driver.findElement(By.name("submit"));
		sb.click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();*/
		driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
		Thread.sleep(6000);
		driver.findElement(By.id("cookie-closed")).click();
		WebElement dts=driver.findElement(By.id("T7-departure_1"));
		driver.findElement(By.xpath("//*[text()='26'])[2]")).click();
		
File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileHandler.copy(shots, new File("C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Pictures\\Airlines.png"));
	}





		
		
		
	}


