package PIIT_ks.Trainingks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions it=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement sr=driver.findElement(By.id("draggable"));
		WebElement dr=driver.findElement(By.id("droppable"));
		it.dragAndDrop(sr, dr).build().perform();
		
	}
	
}
