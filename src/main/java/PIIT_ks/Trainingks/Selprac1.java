package PIIT_ks.Trainingks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.navigate().back();
driver.navigate().forward();
/*WebElement Search= driver.findElement(By.id("twotabsearchtextbox"));
Search.sendKeys("karima");
WebElement searchbutton=driver.findElement(By.id("nav-search-submit-text"));
searchbutton.click();*/
WebElement Name=driver.findElement(By.name("email"));
Name.sendKeys("karimanursing@gmail.com");
WebElement password=driver.findElement(By.name("pass"));
password.sendKeys("abc");
WebElement sign=driver.findElement(By.name("login"));
sign.click();





	}
}
