package MKT_project1.Amazon_prjt1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC_008_src_relavence_price_ratings {
	WebDriver driver;

	@FindBy(name="s")
	WebElement featdd;
	@FindBy(id="s-result-sort-select")
	WebElement featddrev;
	
	public void sort_prize() {
		Select a=new Select(featdd);
		a.selectByVisibleText("Price: Low to High");
	}
	public void sort_cus_review() {
		Select a=new Select(featddrev);
		a.selectByVisibleText("Avg. Customer Review");
	}
	public TC_008_src_relavence_price_ratings (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
