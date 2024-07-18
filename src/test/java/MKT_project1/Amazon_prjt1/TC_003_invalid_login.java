package MKT_project1.Amazon_prjt1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_003_invalid_login {
	WebDriver driver;
	@Test
	
	public void invalid_login() 
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	TC_003_src_invalid_login log=new TC_003_src_invalid_login(driver);
	log.accounthover(driver);
	log.signin();
	log.email();
	log.continuebtn();
	log.password();
	log.signinbutton();
	
	Assert.assertTrue(log.alert.isDisplayed(), "invalid login");
	}
	

}
