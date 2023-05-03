package spicejet.com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import spicejet.com.pages.OneWayFlightPage;
import spicejet.com.utils.BaseTestSJ;


public class OneWayFlightTestCase extends BaseTestSJ {
	
	
	@Test
	
	public void oneway() throws Exception {
	//	launchBrowser("https://www.spicejet.com/");
	
		OneWayFlightPage op = PageFactory.initElements(driver, OneWayFlightPage.class);
	
		
		op.clickOnFrom("MAA");
		Thread.sleep(2000);
		op.clickOnDest("DEL");
		
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("(//div[text()='14'])[2]"));
		date.click();
		
		op.searchFlights();
		
		closebrowser();
	}

}
