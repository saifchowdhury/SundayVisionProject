package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Sleev Length
	@FindBy(xpath="//h3[text()='Sleeve Length']")
	public WebElement txtSleeveLength;
	
	//Long Sleeve 
	@FindBy(xpath="//input[@aria-lebel='Long Sleeve']")
	public WebElement cbxLongSleeve;
	
	//Validate Long Sleeve
	@FindBy(xpath="//*[contains(text(),'Long Sleeve')]")
	public WebElement txtLongSleeve;
	
	//Brand Nike
	@FindBy(xpath="//*[@aria-lable='Nike')]")
	public WebElement cbxBrandNike;
	
	//Brand Adidas
	@FindBy(xpath="//*[@aria-lable='Adidas')]")
	public WebElement cbxBrandAdidas;
		
		
	//Unbranded
	@FindBy(xpath="//*[@aria-lable='Unbranded')]")
	public WebElement cbxUnbrandeds;
	

	//Validate Nike
	@FindBy(xpath="//input[@aria-lebel='Nike']")
	public WebElement txtNike;
	
	//Validate Adidas
		@FindBy(xpath="//input[@aria-lebel='Adidas']")
		public WebElement txtAdidas;
		
		
	//Validate Unbranded
		@FindBy(xpath="//input[@aria-lebel='Unbranded']")
		public WebElement txtUnbranded;
		
	
				
	
	

}
