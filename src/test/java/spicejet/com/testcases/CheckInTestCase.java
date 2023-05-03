package spicejet.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import spicejet.com.pages.CheckInValidatePage;
import spicejet.com.utils.BaseTestSJ;



public class CheckInTestCase extends BaseTestSJ{
	

	@Test
	public void checkin() {
		//launchBrowser("https://www.spicejet.com/");
		try {
			
		CheckInValidatePage cip= PageFactory.initElements(driver, CheckInValidatePage.class);
		
			cip.clickOnCheckIn();
			cip.ticketNo("W3x3H8");
			cip.email("abcd.1499@gmail.com");
			cip.booking();
			Thread.sleep(6000);
			screenShot("checkInError");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closebrowser();
		
		
	}

}
