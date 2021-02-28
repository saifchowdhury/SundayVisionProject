package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayBrandOutlineSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	
	@When("^Search for \"([^\"]*)\"$")
	public void search_for(String Item) throws Throwable {
		EbayHomePageActionsObj.searchItem(Item);

	}

	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {

	}

	@Then("^Item list should have product of \"([^\"]*)\"$")
	public void item_list_should_have_product_of(String brand) throws Throwable {
		
	}

}
