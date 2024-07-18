package MKT_project1.Amazon_prjt1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_006_searchwithfilters {

	WebDriver driver;
	@Test
	
	public void filter_category_prize() 
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	TC_002_src_valid_login log=new TC_002_src_valid_login(driver);
	log.accounthover(driver);
	log.signin();
	log.email();
	log.continuebtn();
	log.password();
	log.signinbutton();
	TC_005_src_ShoesearchbyName search=new TC_005_src_ShoesearchbyName(driver);
	search.searching();
	//category
	TC_006_src_searchwithfilters categ=new TC_006_src_searchwithfilters(driver);
	categ.catergory();
//	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
//	w1.until(ExpectedConditions.urlContains("1000"));
	categ.lslider(driver);
//	categ.go();
	
}
}
