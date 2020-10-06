package com.exl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exl.qa.base.TestBase;


public class SearchPage extends TestBase {
	
	// PageFactory - Object Repository :> Page Objects
	//@FindBy(css="#gs_lc50")
	//WebElement searchLabel;
	
	@FindBy(xpath="//*[@id='searchboxinput']")
	WebElement searchLabel;
	
/*	@FindBy(css="#searchbox-searchbutton")
	WebElement searchButton;
	
	*/
	

	@FindBy(xpath="//div/button[@class='searchbox-searchbutton']")
	@CacheLookup
	WebElement searchButton;
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions - Methods
	
		public String validateSearchPageTitle()
		{
			return driver.getTitle();
		}
		
		public void enterTextOnSearchLabel()
		{
			searchLabel.sendKeys("San Francisco, California");
			searchButton.click();
		}
		
		public void clickOnSearchButton()
		{
			searchButton.click();
		}
		
		/*
		 * public LocationPage login(String un, String pwd) { username.sendKeys(un);
		 * password.sendKeys(pwd); loginBtn.click();
		 * 
		 * return new HomePage();
		 * 
		 * }
		 */
	

}
