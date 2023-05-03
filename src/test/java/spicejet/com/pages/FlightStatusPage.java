package spicejet.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import spicejet.com.utils.BaseTestSJ;

public class FlightStatusPage extends BaseTestSJ {
	
	@FindBy(xpath="//div[text()='flight status']")
	WebElement flightStatus;
	
	public void clickOnflightStatus() {
		waitForElement(flightStatus);
		clickAction(flightStatus);
		
	//	System.out.println("Click on flight vaidation successful");
	}
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement origin;
	public void selectOrigin(String text) {
		waitForElement(origin);
		typeText(origin, text);
	}
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement dest;
	public void selectDest(String text) {
		waitForElement(dest);
		typeText(dest, text);
	}
	
	@FindBy(xpath="//div[text()='Search Flights']")
	WebElement searchFlight;
	
	public void searchFlight() {
		waitForElement(searchFlight);
		actionClick(searchFlight);
		//System.out.println("flight status vaidation successful");
	}

	

}
