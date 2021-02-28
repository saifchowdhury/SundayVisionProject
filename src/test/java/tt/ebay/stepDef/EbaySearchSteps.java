package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@Given("^Open Ebay Website$")
	public void open_Ebay_Website() throws Throwable {
		System.out.println("Open Ebay Webside");
		EbayHomePageActions.loadEbayHomePage();
	   
	    System.out.println("Framework by Saif");}

	@When("^search for shirts$")
	public void in_search_bar_type_in_shirts() throws Throwable {
		System.out.println("Search for shirts");
		EbayHomePageActionsObj.searchShirt();
	 
	}


	@Then("^Item list should have only shirt related products$")
	public void item_list_should_have_only_shirt_related_products() throws Throwable {
		EbaySearchResultActionsObj.validateBrand(brand);
		
	


}
