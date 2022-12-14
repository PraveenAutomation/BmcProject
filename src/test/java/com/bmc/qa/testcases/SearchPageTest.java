package com.bmc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bmc.qa.base.TestBase;

import com.bmc.qa.pages.SearchPage;
import com.bmc.qa.utils.TestUtils;

public class SearchPageTest extends TestBase {

	SearchPage searchPage;
	TestUtils testUtils;
	LandingPage landingPage;

	public SearchPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initilization();
		searchPage = new SearchPage();
		testUtils = new TestUtils();
		landingPage = new LandingPage();

	}

	@Test(priority = 1)
	public void verifySearchPageTitleTest() {
		String searchPageTitle = searchPage.validateSearchPageTitle();
		Assert.assertEquals(searchPageTitle, "Google");

	}

	@Test(priority = 2)
	public void verifyEnterTextOnSerchBox() {
		searchPage.enterTextOnSearchLabel();
		searchPage.clickOnSearchButton();

	}
	
	@Test(priority = 3)
	public void searchList() {
		int searchCount = searchPage.searchListCount();
		Assert.assertEquals(searchCount, searchPage.searchListCount());
	}

	  @AfterMethod 
	  public void tearDown() 
	  { 
		  if(driver!=null)
		  {
		  driver.quit();
		  }
	  }

}
