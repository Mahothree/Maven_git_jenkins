package MKT_project1.Amazon_prjt1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_004_src_ProfileEdit {
	public static	WebDriver driver;

	@FindBy(xpath="//span[.=\"Manage Profiles\"]")
	WebElement managep;

	@FindBy(xpath="//a[.=\"View\"]")//popupclick
	WebElement view;
	
	@FindBy(className="editNameIcon")//edit pencil 
	WebElement editicon;
	
	@FindBy(id="editProfileNameInputId")//profilename
	WebElement pflname;
	
	@FindBy(xpath="(//span[.=\"Continue\"])[1]")//contine click
	WebElement cont1;
	
	//preferred dept
	@FindBy(xpath="(//div[@class=\"accordion\"]/div)[1]")//expand collapse
	WebElement Prefdept;
	
	
	public void manageprofile() {
		managep.click();
	}
	public void popupview() {
		view.click();
	}
	public void editpencil() {
		editicon.click();
	}
	public void profilename() {
		pflname.sendKeys(Keys.CONTROL+"A");
		pflname.sendKeys(Keys.BACK_SPACE);
		pflname.sendKeys("Mahi");
	}
	public void continue1() {
		cont1.click();
	}
	
	public void prefdepatment() {
	//	WebDriverWait e=new WebDriverWait(driver,Duration.ofSeconds(10));
		//e.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"accordion\"]/div)[1]")));
		Prefdept.click();
	}
	/*public void pdaddbtn() {
		pdadd.click();
	}*/
	
	

	public  TC_004_src_ProfileEdit(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
}
