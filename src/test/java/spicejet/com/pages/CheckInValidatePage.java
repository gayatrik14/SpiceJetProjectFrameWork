package spicejet.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import spicejet.com.utils.BaseTestSJ;

public class CheckInValidatePage extends BaseTestSJ {
	
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkIn;
	
	public void clickOnCheckIn() {
		waitForElement(checkIn);
		clickAction(checkIn);
		
		//System.out.println("Check-in validation successful");
	}
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement no;
	
	public void ticketNo(String text) {
		waitForElement(no);
		typeText(no, text);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement email;
	
	public void email(String text) {
		waitForElement(email);
		typeText(email, text);
	}
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu'])[1]")
	WebElement booking;
	
	public void booking() {
		waitForElement(booking);
		clickAction(booking);
	}
	
	

}
