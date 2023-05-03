package spicejet.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import spicejet.com.utils.BaseTestSJ;

public class LoginPage  extends BaseTestSJ {

	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	public void clickOnLogin() {
		waitForElement(login);
		clickAction(login);
	}
	
	@FindBy(xpath="//div[text()='Email']")
	WebElement checkEmail;
	
	public void clickOnEmail() {
		waitForElement(checkEmail);
		checkEmail.click();
	}
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")
	WebElement enteremail;
	
	public void enterEmail(String text) {
		waitForElement(enteremail);
		typeText(enteremail,text);
	}
	
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[2]")
	WebElement enterPass;
	
	public void enterPass(String text) {
		waitForElement(enterPass);
		typeText(enterPass, text);
	}
	
	@FindBy(xpath="//div[text()='LOGIN']")
	WebElement checkLogin;
	
	public void clickOnLoginp() {
		waitForElement(checkLogin);
		jsClick(checkLogin);
	}
	
	
	
	
}
