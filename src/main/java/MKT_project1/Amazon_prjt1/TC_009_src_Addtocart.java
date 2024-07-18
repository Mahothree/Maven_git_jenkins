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
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div[2]/div/span/span/a")
	WebElement gotocartbn;
	
	@FindBy()
	WebElement quantitydd;
	public void cartadd() {
		addprdt.click();
	}
	public void gotocartbtn() {
		gotocartbn.click();
	}
	public void quantity() {
		gotocartbn.click();
	}
	public TC_009_src_Addtocart (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
