package stepDefinitions;

import org.junit.Assert;

import com.pageObjects.GraphPage_PO;
import com.pageObjects.LoginPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.loggerLoad;

import io.cucumber.java.en.*;

public class GraphPage_SD {

	private GraphPage_PO gp = new GraphPage_PO(DriverFactory.getDriver());
	private LoginPage_PO lp = new LoginPage_PO(DriverFactory.getDriver());
	
	@When("The user clicks {string} sub link of Graph Page")
	public void the_user_clicks_sub_link_of_graph_page(String subLink) {
	    gp.subLinkClick(subLink);
	    loggerLoad.info("The user clicks {string} sub link of Graph Page");
	}
	
	@Then("The user should be directed to {string} of Graph Page")
	public void the_user_should_be_directed_to_of_graph_page(String expectedTitle) {
		Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
		loggerLoad.info("The user should be directed to {string} of Graph Page");
	}
	
	@Given("The user is on the {string} sub link of Graph page")
	public void the_user_is_on_the_sub_link_of_graph_page(String subLink) {
	    gp.subLinkClick(subLink);
	    loggerLoad.info("The user is on the {string} sub link of Graph page");
	}
	
	@Then("The user clicks Sign Out button")
	public void the_user_clicks_sign_out_button() {
		lp.clicklogout();
		loggerLoad.info("The user clicks Sign Out button");
	}
}