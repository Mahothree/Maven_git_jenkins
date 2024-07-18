package MKT_project1.Amazon_prjt1;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_001_Registration {

	WebDriver driver;
	@Test
	
	public void register() 
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	TC_001_src_Registration reg=new TC_001_src_Registration(driver);
	reg.accounthover(driver);
	reg.signin();
	reg.email();
	reg.continuebtn();
	reg.pnum();
	reg.cname();
	reg.password();
	reg.continuebtn();
	//String a[]= {"Authentication required","Amazon Phone Verification"};
//	for(int i=0;i<a.length;i++) {
		
		Assert.assertEquals("authentication", "Amazon Phone Verification", driver.getTitle());
//	}
	}
}
