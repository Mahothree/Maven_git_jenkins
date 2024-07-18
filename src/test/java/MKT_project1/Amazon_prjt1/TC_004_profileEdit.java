package MKT_project1.Amazon_prjt1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_004_profileEdit {
	WebDriver driver;

	@Test
	
	public void editprofile() {
		
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
		//aacount hover over
		log.accounthover(driver);
		
		TC_004_src_ProfileEdit pedit=new TC_004_src_ProfileEdit(driver);
		pedit.manageprofile();
		pedit.popupview();
		//profile name edit
	pedit.editpencil();
		pedit.profilename();
		pedit.continue1();
		//pref dept expansion
		
		pedit.prefdepatment();
		//pedit.pdaddbtn();
		
		
		
		
	}

}
