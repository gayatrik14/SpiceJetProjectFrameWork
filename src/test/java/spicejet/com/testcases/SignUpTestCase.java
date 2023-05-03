package spicejet.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import spicejet.com.pages.SignUpPage;
import spicejet.com.utils.BaseTestSJ;


public class SignUpTestCase extends SignUpTestCase2 {
	
	@Test
	public void signup() throws InterruptedException {
		
		
	//	launchBrowser("https://www.spicejet.com/");
		SignUpPage sp = PageFactory.initElements(driver, SignUpPage.class);
		sp.clickOnSignUp();
		windowHandling();
		aa();
		sp.clickOnTitle("MR");
		sp.firstname("satish");
		Thread.sleep(2000);
		sp.lastname("v");
		sp.dob();
		sp.year("1995");
		sp.month("April");
		sp.date("4");
		sp.phNo("9876543210");
		Thread.sleep(2000);
		sp.email("gayatrikyadav.1499@gmail.com");
		Thread.sleep(2000);
		sp.newPass("Japan@123");
		sp.conPass("Japan@123");
		sp.clickOnCheckBox();
		sp.clickOnSubmit();
		
		closebrowser();

}
}
