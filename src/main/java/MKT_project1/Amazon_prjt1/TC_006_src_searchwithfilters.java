package MKT_project1.Amazon_prjt1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_006_src_searchwithfilters {

	public static WebDriver driver;
	
	@FindBy(xpath="//span[.=\"Women's Running Shoes\"]")
	WebElement cate;
	
	@FindBy(id="p_36/range-slider_slider-item_lower-bound-slider")
	WebElement lslider;
	
	@FindBy(id="p_36/range-slider_slider-item_upper-bound-slider")
	WebElement rslider;
	
	@FindBy(xpath="//div[@class=\"a-section sf-submit-range-button\"]")
	WebElement go;
	
	public void catergory() {
		cate.click();
	}
	public void lslider(WebDriver driver) {
		/*Point loc=prizeslide.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		//JavascriptExecutor e1= (JavascriptExecutor) driver;
		//e1.executeScript("window.ScrollBy(0,"+y+")");
		*/
		Actions a1=new Actions(driver);
		a1.dragAndDropBy(lslider, 800, 0).build().perform();;

		
	}
	public void rslider(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.dragAndDropBy(rslider,-200, 0).perform();
		}
	public void go() {
		go.click();
	}
	

	public  TC_006_src_searchwithfilters(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	

}