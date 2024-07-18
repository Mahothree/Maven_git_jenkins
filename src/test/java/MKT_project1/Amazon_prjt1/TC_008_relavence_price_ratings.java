package MKT_project1.Amazon_prjt1;

import java.time.Duration;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_008_relavence_price_ratings {

	WebDriver driver;
	@Test
	
	public void sorting() 
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	TC_002_src_valid_login log=new TC_002_src_valid_login(driver);
	log.accounthover(driver);
	log.signin();
	log.email();
	log.continuebtn();
	log.password();
	log.signinbutton();
	TC_005_src_ShoesearchbyName search=new TC_005_src_ShoesearchbyName(driver);
	search.searching();
	
	TC_008_src_relavence_price_ratings featuredd=new TC_008_src_relavence_price_ratings(driver);
	featuredd.sort_prize();
	featuredd.sort_cus_review();
	
	}
}
