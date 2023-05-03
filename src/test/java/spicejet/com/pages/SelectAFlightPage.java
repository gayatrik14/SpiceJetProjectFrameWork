package spicejet.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import spicejet.com.utils.BaseTestSJ;

public class SelectAFlightPage extends BaseTestSJ {

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement contiune;

	public void clickOnContiune() {
		waitForElement(contiune);
		contiune.click();
	}

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement fname;

	public void firstName(String text) {
		waitForElement(fname);
		typeText(fname, text);
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement lname;

	public void lastName(String text) {
		waitForElement(lname);
		typeText(lname, text);
	}

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement phNo;

	public void phNo(String text) {
		waitForElement(phNo);
		typeText(phNo, text);
	}

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement email;

	public void email(String text) {
		waitForElement(email);
		typeText(email, text);
	}

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement city;

	public void city(String text) {
		waitForElement(city);
		typeText(city, text);
	}

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement passfname;

	public void passFirstName(String text) {
		waitForElement(passfname);
		typeText(passfname, text);
	}

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement passlname;

	public void passLastName(String text) {
		waitForElement(passlname);
		typeText(passlname, text);
	}

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement passPhNo;

	public void passPhNo(String text) {
		waitForElement(passPhNo);
		typeText(passPhNo, text);
	}

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement seContinue;

	public void seContinue() {
		waitForElement(seContinue);
		clickAction(seContinue);

	}

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")
	WebElement thContinue;

	public void thContinue() {
		waitForElement(thContinue);
		clickAction(thContinue);

	}

	@FindBy(xpath = "(//input[@class='card_number'])")
	WebElement card;

	public void card(String text) {
		waitForElement(card);
		typeText(card, text);
	}
	
	@FindBy(xpath="//div[text()='UPI']")
	WebElement upi;
	public void upiApp() {
		waitForElement(upi);
		clickAction(upi);
	}

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-mcxt9x r-1xfd6ze r-d045u9 r-1loqt21 r-14g73ha r-1mi0q7o r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1b94p3d'])[2]")
	WebElement upiApp;

	public void selectUpiApp() {
		clickAction(upiApp);
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement id;

	public void typeId(String text) {
		waitForElement(id);
		typeText(id, text);

	}
	//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-ubezar r-1kfrs79']
	
	@FindBy(xpath="//div[text()='Proceed to pay']")
	WebElement ptp;
	
	public void proceedTOPay() {
		waitForElement(ptp);
		actionClick(ptp);
	}
}
