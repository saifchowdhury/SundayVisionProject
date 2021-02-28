package tt.ebay.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

public class EbayHomepageLocators {
	
	//search for anything
	@FindBy(xpath="//input[@id='gh-ac']")
	public WebElement txtbxsearchForAnything;
	
	//search
	@FindBy(xpath="//input[@id='gh-btn']")
	public WebElement btnSearch;
	
	WebElement btnSearch2 = SetupDrivers.driver.findElement(By.xpath("//input[@id='gh-btn']")); 
	

}
