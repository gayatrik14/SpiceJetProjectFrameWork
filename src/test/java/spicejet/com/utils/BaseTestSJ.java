package spicejet.com.utils;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestSJ {
	
	public static WebDriver driver = null;
		
		@BeforeMethod
		@Parameters({"browser"})
		public void launchBrowser(String browserName)
		{ 
			try 
			{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.get("https://www.spicejet.com/");
				
			}
			else if(browserName.equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.get("https://www.spicejet.com/");
			}
			}
		catch (Exception ex) {
			
			ex.printStackTrace();
			System.out.println("Problem while launching the browser");
		}
	}
	
	
	public void closebrowser() {
		driver.close();
	}

	public void quitbrowser() {
		driver.quit();
	}

	public void clickAction(WebElement ele) {
		try {
			ele.click();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void brokenLink(String url) {

		List<WebElement> links = driver.findElements(By.tagName("a"));
	
		try {
					HttpURLConnection httpConnection = (HttpURLConnection) (new URL(url).openConnection());
					httpConnection.connect();
					int respCode = httpConnection.getResponseCode();

					if (respCode >= 400) {

						System.out.println(url + " is broken and its response code is " + respCode);

					} else {

						System.out.println(url + " is a valid link and its reponse code is " + respCode);

					}
					
		}
			 catch (IOException e) {
				
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	public void typeText(WebElement ele, String text) {
		try {
			ele.clear();
			ele.sendKeys(text);
			
		}
		catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void waitForElement(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}
	public void jsScrollUpToElement(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void jsClick(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void selectDDByValue(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByValue(value);
			
		} catch (Exception ex) {
		
			ex.printStackTrace();
		}

	}
	
public void validate(String expectedTitle) {
		
		try {
			Assert.assertEquals(driver.getTitle(), expectedTitle);
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

public void bottomLink()
{
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("No.of.Links = " + links.size());

	List<String> urllist = new ArrayList<String>();
	
	
	//To traverse to each link and fetch the link value using href attribute
	for (WebElement e : links) {
		String url = e.getAttribute("href");
		urllist.add(url);

		if (url == null || url.isEmpty()) {
			System.out.println("URL is empty");
			continue;
		}
		try {
			HttpURLConnection httpConnection = (HttpURLConnection) (new URL(url).openConnection());
			httpConnection.connect();
			int respCode= httpConnection.getResponseCode();
			
			
			
			if ( respCode >= 400) {

				System.out.println(url + " is broken and its response code is "+respCode);

			} else {

				System.out.println(url + " is a valid link and its reponse code is "+respCode);

			}
			
			}
		catch(Exception ex)
		{
			
			ex.printStackTrace();
		}
		
	}
	System.out.println("All the URLS: "+urllist);

}


public void screenShot(String ssname) {
	try {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("./ScreenShotphoto/" + ssname + ".png");

		FileUtils.copyFile(source, dest);
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}



public void windowHandling() {
	try {
		String pWindow = driver.getWindowHandle();
		Set<String> windowHandle = driver.getWindowHandles();

		for (String adr : windowHandle) {

			if (!(pWindow.contentEquals(adr))) {
				driver.switchTo().window(adr);
			}
			System.out.println(adr);
	
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}

public void selectDDByVisibleText(WebElement ele, String VisibleText) {
	try {
		Select sel = new Select(ele);
		sel.selectByVisibleText(VisibleText);
		
	} catch (Exception ex) {
		
		ex.printStackTrace();
	}
}

	public void actionClick(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.click(ele).build().perform();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		
	}
}

