package spicejet.com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import spicejet.com.pages.LoginPage;
import spicejet.com.utils.BaseTestSJ;


public class LoginTestCase extends BaseTestSJ{

	@Test
	public void login() throws InterruptedException {
	
	
	//	driver.get("https://www.spicejet.com/");
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.clickOnLogin();
		lp.clickOnEmail();
		lp.enterEmail("gayatrikyadav.14@gmail");
		Thread.sleep(2000);
		lp.enterPass("Japan@123");
		lp.clickOnLoginp();
		
		closebrowser();
	}

}
