package PIIT_ks.Trainingks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to open the browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karim\\eclipse-workspace\\selinuim\\Trainingks\\Driver\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		




	} 

}
