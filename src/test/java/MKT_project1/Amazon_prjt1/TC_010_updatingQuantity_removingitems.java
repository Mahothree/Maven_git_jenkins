package MKT_project1.Amazon_prjt1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_010_updatingQuantity_removingitems {

	WebDriver driver;
	@Test
	
	public void Prdt_cart() 
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
	
	TC_007_src_productdetail prdt=new TC_007_src_productdetail(driver);
	prdt.prdt1();
	
	  Set<String> s=driver.getWindowHandles();
		Iterator<String> i=s.iterator();
		String w1=i.next();
		String w2=i.next();
		System.out.println(w1+","+w2);
		
		driver.switchTo().window(w2);
		
		TC_009_src_Addtocart cartadd=new TC_009_src_Addtocart(driver);
		cartadd.cartadd();
		cartadd.gotocartbtn();
}
}

