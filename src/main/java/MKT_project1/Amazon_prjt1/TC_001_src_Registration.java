package MKT_project1.Amazon_prjt1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_001_src_Registration {

	
public static	WebDriver driver;
	//Locating each element in a page
	@FindBy(xpath="(//div[@id=\"nav-tools\"]/a)[2]")
	WebElement Acnthover;

	@FindBy(xpath="//span[.=\"Sign in\"]")
	WebElement signin;
	
	@FindBy(name="email")
	WebElement emailname;
	
	@FindBy(id="ap_phone_number")
	WebElement pno;
	
	@FindBy(id="ap_customer_name")
	WebElement cname;
	
	@FindBy(id="ap_password")
	WebElement pswd;
	
	@FindBy(id="continue")
	WebElement cont;
	
	public void accounthover(WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(Acnthover).perform();
		
	}
	public void signin() {
		signin.click();
	}
	
	public void email() {
		emailname.sendKeys("Mahohree12@gmail.com");
	}
	public void pnum() {
		pno.sendKeys("8341479809");
	}
	public void cname() {
		cname.sendKeys("mahothree");
	}
	public void password() {
		pswd.sendKeys("Mahothree#12");
	}
	public void continuebtn() {

		cont.click();
	}
	
	public  TC_001_src_Registration(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
}
