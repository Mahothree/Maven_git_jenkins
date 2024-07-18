package MKT_project1.Amazon_prjt1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_005_src_ShoesearchbyName {

		WebDriver driver;
		@FindBy(name="field-keywords")
		WebElement search;
		
		public void searching() {
			search.sendKeys("shoe"+Keys.ENTER);
		}
		
		public TC_005_src_ShoesearchbyName(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

}
