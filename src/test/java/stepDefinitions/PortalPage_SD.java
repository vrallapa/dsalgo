package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import com.pageObjects.PortalPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.loggerLoad;

import io.cucumber.java.en.*;

public class PortalPage_SD {
	
	 PortalPage_PO pp=new PortalPage_PO(DriverFactory.getDriver());
	String title;
	@Given("user opens portal page")
	public void user_opens_portal_page() {
		 DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
		 loggerLoad.info("user opens portal page");
	}

	//comments
	@When("user clicks getting started button")
	public void user_clicks_getting_started_button() {
		pp.clickstartbutton();
		loggerLoad.info("user clicks getting started button");
	   
	}

	@Then("user should go to home page")
	public void user_should_go_to_home_page() {
	   title= pp.Getpagetitle();
	  // System.out.println(title);
	   loggerLoad.info("user should go to home page");
	}
	   @Then("page title should be {string}")
	   public void page_title_should_be(String expectedtitlename) {
		
			System.out.println("page title is; " +title);
			
			Assert.assertTrue(title.contains(expectedtitlename));
			 loggerLoad.info("page title shoul be");
			
	       
	   }
	   
	   
	  

	}



