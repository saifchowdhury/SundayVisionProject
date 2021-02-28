package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbayHomepageLocators;
import tt.utilities.SetupDrivers;

public class EbayHomePageActions {
	
	EbayHomepageLocators EbayHomepageLocatorsObj;
	
	public EbayHomePageActions(){
		EbayHomepageLocatorsObj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);
		
	}
	public static void loadEbayHomePage() throws Exception{
		
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SetupDrivers.driver.manage().window().maximize();
		
	}
	public void searchShirt() throws Exception{
		EbayHomepageLocatorsObj.txtbxsearchForAnything.clear();
		EbayHomepageLocatorsObj.txtbxsearchForAnything.sendKeys("Shirt");
		EbayHomepageLocatorsObj.btnSearch.click();
		Thread.sleep(3000);
	}
		
		public void searchItem(String item) throws Exception{
			EbayHomepageLocatorsObj.txtbxsearchForAnything.clear();
			EbayHomepageLocatorsObj.txtbxsearchForAnything.sendKeys(item);
			EbayHomepageLocatorsObj.btnSearch.click();
			Thread.sleep(3000);
			
			
		}
		
		
	}
	


