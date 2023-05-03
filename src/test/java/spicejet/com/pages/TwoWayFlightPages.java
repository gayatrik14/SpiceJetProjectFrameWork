package spicejet.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import spicejet.com.utils.BaseTestSJ;

public class TwoWayFlightPages extends BaseTestSJ {
	
	@FindBy(xpath="//div[text()='round trip']")
	WebElement rt;
	
	public void clickOnRoundTrip() {
		waitForElement(rt);
		clickAction(rt);
		
	}
	@FindBy(xpath="(//input[@type='text'])[1]")

	WebElement from;
	
	public void clickOnFrom(String text) {
		waitForElement(from);
		typeText(from, text);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement dest;
	
	public void clickOnDest(String text) {
		waitForElement(dest);
		typeText(dest, text);
	}
	
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement search;
	
	public void searchFlights() {
		waitForElement(search);
		clickAction(search);
	}
	
}
