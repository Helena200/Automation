package Pages.facebook;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver Driver;
@FindBy(name="email")
WebElement emailfieldkeys;
@FindBy(name="pass")
WebElement passwfieldkeys;
@FindBy(name="login")
WebElement sign;
@FindBy(linkText = "Forgot password?")
WebElement Forgot;
public Home(WebDriver driver){
	this.Driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void emailoffinput() {
	emailfieldkeys.sendKeys("abcd");
	
}
public void passwfieldkeys() {
	passwfieldkeys.sendKeys("Helena");
}
	public void Signingin() {
		sign.click();
	
	
	
}
	public void emailofinput(String string) {
		// TODO Auto-generated method stub
		
	}
	public void psswrdofield(String string) {
		// TODO Auto-generated method stub
		
	}
	public void Forgotlink() {
		// TODO Auto-generated method stub
		
	}
}
