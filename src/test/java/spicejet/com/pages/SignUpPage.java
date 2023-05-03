package spicejet.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import spicejet.com.utils.BaseTestSJ;

public class SignUpPage extends BaseTestSJ {
	
	@FindBy(xpath="//div[text()='Signup']")
	WebElement sigup;
	
	public void clickOnSignUp() {
		try {
			waitForElement(sigup);
			clickAction(sigup);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement fname;
	public void firstname(String text) {
		typeText(fname, text);
		
	}
	
	@FindBy(id="last_name")
	WebElement lname;
	
	public void lastname(String text) {
		typeText(lname, text);
		
	}
	
	@FindBy(id="dobDate")
	WebElement date;
	
	public void dob() {
		waitForElement(date);
		clickAction(date);
	}
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement year;
	
	public void year(String user) {
		selectDDByVisibleText(year, user);
		
	}
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement month;
	
	public void month(String user) {
		selectDDByVisibleText(month, user);
	}
	
	@FindBy(xpath="//div[text()='4']")
	WebElement sdate;
	
	public void date(String day) {
		
		WebElement sDate = driver.findElement(By.xpath("//div[text()="+day+"]"));
		clickAction(sDate);
	}
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement option;
	
	public void clickOnTitle(String title) {
		try {
			waitForElement(option);
			selectDDByValue(option, title);
		} catch (Exception e) {
		
			e.printStackTrace();
		} 
	}
	
	@FindBy(id="email_id")
	WebElement email;
	 
	public void email(String text)
	{
		try {
			waitForElement(email);
			typeText(email, text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FindBy(id="new-password")
	WebElement newPass;
	public void newPass(String text)
	{
		try {
			waitForElement(newPass);
			typeText(newPass, text);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement conPass;
	public void conPass(String text)
	{
		try {
			waitForElement(conPass);
			typeText(conPass, text);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	@FindBy(xpath="//div[text()='Phone']/following::input[1]")
	WebElement phno;
	public void phNo(String text) {
		try {
			waitForElement(phno);
			typeText(phno, text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//input[@id='defaultCheck1']")
	WebElement checkbox;
	
	public void clickOnCheckBox() {
		waitForElement(checkbox);
		jsClick(checkbox);
	}
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	public void clickOnSubmit() {
		waitForElement(submit);
		jsClick(submit);
	}
	
}
