package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.TestBase;

public class PageObjectManager {
	
	public LandingPage landingPage;

	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPage getLandingPage()
	{
	
	 landingPage= new LandingPage(driver);
	 return landingPage;
	}
	
}
