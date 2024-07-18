package MKT_project1.Amazon_prjt1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_007_src_productdetail {

	WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]")
	WebElement fstprdt;
	
	@FindBy(xpath="/html/body/div[2]/div/div[5]/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/div[3]/div/div/div[4]/div[1]/span[3]/span[2]/span[2]")
	WebElement prize;
	
	@FindBy(xpath="/html/body/div[2]/div/div[5]/div[9]/div[1]/div")
	WebElement prdt_desc;
	
	@FindBy(id="acrCustomerReviewText")
	WebElement reviews;

	@FindBy(xpath="//*[@id=\"reviews-medley-footer\"]/div[2]/a")
	WebElement seemorereviews;
	
	public void prdt1() {
		fstprdt.click();
		}
	public void prdt_prize() {
		prize.isDisplayed();
		}
	public void prdt_description() {
		prdt_desc.isDisplayed();
		}
	public void prdt_review() {
		reviews.click();
		}
	public void more_review() {
		seemorereviews.isDisplayed();
		}
	
	public TC_007_src_productdetail (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
