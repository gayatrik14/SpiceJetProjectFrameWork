package spicejet.com.testcases;

import org.openqa.selenium.support.PageFactory;

import spicejet.com.pages.SignUpPage;
import spicejet.com.utils.BaseTestSJ;


public class SignUpTestCase2 extends BaseTestSJ {
	public void aa() throws InterruptedException {
	
		
//	launchBrowser("https://www.spicejet.com/");
	
	SignUpPage sp = PageFactory.initElements(driver, SignUpPage.class);
/*	sp.clickOnSignUp();
	windowHandling();*/
	sp.email("gayatrikyadav.1499@gmail.com");
	Thread.sleep(2000);
	sp.newPass("Japan@123");
	sp.conPass("Japan@123");
	}
}
