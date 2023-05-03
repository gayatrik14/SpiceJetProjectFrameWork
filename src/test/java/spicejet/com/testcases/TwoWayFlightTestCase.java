package spicejet.com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import spicejet.com.pages.SelectAFlightPage;
import spicejet.com.pages.TwoWayFlightPages;
import spicejet.com.utils.BaseTestSJ;


public class TwoWayFlightTestCase extends BaseTestSJ {

	@Test
	public void twoway() throws Exception {
		
	//	launchBrowser("https://www.spicejet.com/"); 
		TwoWayFlightPages tp =PageFactory.initElements(driver, TwoWayFlightPages.class);
		tp.clickOnRoundTrip();
		
		tp.clickOnFrom("MAA");
		Thread.sleep(2000);
		tp.clickOnDest("DEL");
		
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("(//div[text()='14'])[2]"));
		date.click();
		
		WebElement date1=driver.findElement(By.xpath("(//div[text()='14'])[3]"));
		date1.click();
		tp.searchFlights();
		
		SelectAFlightPage sp = PageFactory.initElements(driver, SelectAFlightPage.class);
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
		//screenShot("paymentFailed");
		Thread.sleep(5000);
		
		closebrowser(); 
		
		
	}

}
