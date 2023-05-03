package spicejet.com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import spicejet.com.pages.OneWayFlightPage;
import spicejet.com.pages.SelectAFlightPage;
import spicejet.com.utils.BaseTestSJ;

public class SelectAFlightTestCase extends OneWayFlightTestCase {

	@Test
	public void select() throws Exception {
		
		oneway();
		
		SelectAFlightPage sp = PageFactory.initElements(driver, SelectAFlightPage.class);
		
	//	sp.selectFlight();
		sp.clickOnContiune();
		
		sp.firstName("Satish");
		sp.lastName("yadav");
		Thread.sleep(2000);
		sp.phNo("9876543210");
		sp.email("gayatrikyadav.14@gmail.com");
		Thread.sleep(2000);
		sp.city("Bangalore");
		Thread.sleep(2000);
		sp.passFirstName("Satish");
		sp.passLastName("yadav");
		Thread.sleep(2000);
		sp.passPhNo("9876543210");
		sp.seContinue();
		sp.thContinue();
	//framesByWebElement(card);
	//	sp.card("1234567890123456");
		sp.upiApp();
		sp.selectUpiApp();
		sp.typeId("higuviteam");
		sp.proceedTOPay();
		Thread.sleep(4000);
		screenShot("paymentFailed");
		Thread.sleep(5000);
		
		closebrowser(); 
	
	}

}
