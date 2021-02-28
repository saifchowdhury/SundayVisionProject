package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import tt.ebay.pageElements.EbaySearchResultLocators;
import tt.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	private Object EbaySearchReasutlLocatorsObj;
	public EbaySearchResultActions(){EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
	PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);{
		}
	}
	public void verifyShirtRelatedProducts1(){
		//Option:1
		 EbaySearchResultLocatorsObj.txtSleeveLength.isDisplayed();
		 
		 //Option:2
		 System.out.println(EbaySearchResultLocatorsObj.txtSleeveLength.getText());
		 
		 //Option:3
		 Assert.assertEquals(EbaySearchResultLocatorsObj.txtSleeveLength.getText(), "Sleeve Length");
		 
		 //Option:4
		 Assert.assertEquals(true, EbaySearchResultLocatorsObj.txtSleeveLength.isDisplayed());
		 }
	     
	 public void filterLongSleeve() throws Exception{
		 Thread.sleep(3000);
		EbaySearchReasutlLocatorsObj.cbxLongSleeve.click();
		 Thread.sleep(3000);
	 }
	
	
         public Void ValidateLongSleeve(){
        	 EbaySearchReasutlLocatorsObj.txtLongSleeve.isDisplayed();
        	 
        	 
         }
         
       
         public void filterBrand(String Brand){  throws Exception{
        	 Thread.sleep(3000);
        if(Brand.equals("Adidas")){
        	 EbaySearchReasutlLocatorsObj.cbxBrandAdidas.click();
        }else if(Brand.equals("Nike")){ 
        	EbaySearchReasutlLocatorsObj.cbxBrandNike.click();
        	
        }else if(Brand.equals("Unbranded")){ 
        	EbaySearchReasutlLocatorsObj.cbxUnbranded.click();
        	
        }
        Thread.sleep(3000);
        	
         
         public void validateBrand(String brand){
        	 Thread.sleep(3000);
             if(Brand.equals("Adidas")){
             	 EbaySearchReasutlLocatorsObj.txtAdidas.isDisplayed();
             }else if(Brand.equals("Nike")){ 
             	EbaySearchReasutlLocatorsObj.txtNike.isDisplayed();
             	
             }else if(Brand.equals("Unbranded")){ 
             	EbaySearchReasutlLocatorsObj.txtUnbranded.isDisplayed();
             	
             }
             Thread.sleep(3000);
         }
        	 
         }
         
        	 
         
      
         

	


