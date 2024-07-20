package MKT_project1.Amazon_prjt1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC_009_src_Addtocart {
	WebDriver driver;
	@FindBy(id="add-to-cart-button")
	WebElement addprdt;
	
	@FindBy(id="nav-cart-count-container")
	WebElement gotocartbn;
			
	@FindBy(name="quantity")
	WebElement quan;
	
	public void cartadd() {
		addprdt.click();
	}
	public void gotocartbtn() {
		gotocartbn.click();
	}
	public void quantity() {
		Select s1=new Select(quan);
		s1.selectByVisibleText("1");
		
	}
	public TC_009_src_Addtocart (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
