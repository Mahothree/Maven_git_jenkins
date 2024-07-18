package MKT_project1.Amazon_prjt1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_005_shoesearchbyName {
	WebDriver driver;
	@Test
	
	public void search() 
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
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/?ref_=nav_signin");
	
	TC_005_src_ShoesearchbyName search=new TC_005_src_ShoesearchbyName(driver);
	search.searching();
	Assert.assertEquals("Amazon.in : shoe",driver.getTitle());

	}

}
