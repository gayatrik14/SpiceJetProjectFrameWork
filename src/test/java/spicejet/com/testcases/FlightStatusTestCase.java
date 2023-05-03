package spicejet.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import spicejet.com.pages.FlightStatusPage;
import spicejet.com.utils.BaseTestSJ;


public class FlightStatusTestCase extends BaseTestSJ {
	
	
	@Test
	public void status() {
		try {
			
		//	launchBrowser("https://www.spicejet.com/");
			FlightStatusPage fp=PageFactory.initElements(driver, FlightStatusPage.class);
			fp.clickOnflightStatus();
			Thread.sleep(3000);
			fp.selectOrigin("CHEN");
			fp.selectDest("DEL");
			fp.searchFlight();
			Thread.sleep(6000);
			screenShot("flightstatusfailed");
			
			closebrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
