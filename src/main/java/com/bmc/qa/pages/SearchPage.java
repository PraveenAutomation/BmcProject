package com.bmc.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.bmc.qa.base.TestBase;


public class SearchPage extends TestBase {
	
	// PageFactory - Object Repository :> Page Objects

	
	@FindBy(xpath="//input[@title='Search']")
	WebElement searchLabel;
	

	@FindBy(xpath="//span[@class='QCzoEc z1asCe MZy1Rb']//*[name()='svg']")
	@CacheLookup
	WebElement searchButton;
	

	@FindBys( {
		@FindBy(xpath="(//div[@class='eIPGRd'])")
		} )
		private List<WebElement> searchCount;;
	
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
			searchLabel.sendKeys("Amazon");
			searchButton.click();
		}
		
		public void clickOnSearchButton()
		{
			searchButton.click();
		}
		
		public int searchListCount()
		{
			int totalCount=searchCount.size();
			return totalCount;
		}
		

	

}
