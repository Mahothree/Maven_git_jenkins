package MKT_project1.Amazon_prjt1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_002_src_valid_login {

	public static	WebDriver driver;
	//Locating each element in a page
	@FindBy(xpath="(//div[@id=\"nav-tools\"]/a)[2]")
	WebElement Acnthover;

	@FindBy(xpath="//span[.=\"Sign in\"]")
	WebElement signin;
	
	@FindBy(name="email")
	WebElement emailname;
	

	@FindBy(id="continue")
	WebElement cont;
	
	@FindBy(id="ap_password")
	WebElement pswd;
	
	@FindBy(id="signInSubmit")
	WebElement signinbtn;
	
	public void accounthover(WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(Acnthover).perform();
		
	}
	public void signin() {
		signin.click();
	}
	
	public void email() {
		emailname.sendKeys("Mahothree123@gmail.com");
	}
	
	public void continuebtn() {

		cont.click();
	}
	
	public void password() {
		pswd.sendKeys("Chinna@09");
	}
	public void signinbutton() {

		signinbtn.click();
	}
	
	public  TC_002_src_valid_login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
}
