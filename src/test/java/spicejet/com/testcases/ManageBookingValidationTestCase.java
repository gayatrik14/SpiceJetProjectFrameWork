package spicejet.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import spicejet.com.pages.ManageBookingValidationPages;
import spicejet.com.utils.BaseTestSJ;


public class ManageBookingValidationTestCase extends BaseTestSJ {
	
	@Test
	public void validate() {
	//	launchBrowser("https://www.spicejet.com/");
		
		ManageBookingValidationPages vp = PageFactory.initElements(driver, ManageBookingValidationPages.class);

		try {
			vp.clickOnManageBooking();
			vp.ticketNo("W8H8X3");
			vp.email("abcd.14@gmail.com");
			vp.booking();
			Thread.sleep(2000);
			screenShot("manageBookingFailed");
			Thread.sleep(2000);
			closebrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
