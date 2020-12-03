package PIIT_ks.Trainingks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
 

public class ScreenShootTest {
	static WebDriver driver ;
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Driver\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement Helena= driver.findElement(By.name("_nkw"));
		WebElement Imane=driver.findElement(By.id("gh-btn"));
		
		piccture(Imane, "yacine");
		
		piccture(Helena,"Ali");
	
	}
	
	public static void piccture(WebElement element ,String FileName) throws IOException {
		File pictures=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(pictures,new File(  "C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Driver\\"+FileName+".png"));	
		

	
	}
	
}
