package Pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.implementation.bind.annotation.This;

public class Forgot_password {
	public WebDriver driver;
	@FindBy(id = "identify_email")
	WebElement search;
	
	@FindBy(name ="email")
	WebElement searchbutton;
	public Forgot_password(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void  searchfieldemail(String name) {
		search.sendKeys(name);
		
	}
	public void buttonlk() {
		searchbutton.click();
	}

}
