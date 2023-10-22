package stepDefinitions;

import org.junit.Assert;

import com.pageObjects.HomePage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.loggerLoad;

import io.cucumber.java.en.*;

public class HomePage_SD {
	HomePage_PO hp=new HomePage_PO(DriverFactory.getDriver());
	
	
//comments
	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		 DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		 loggerLoad.info("The user opens Home Page");
	}
	
	@When("The user clicks on Get Started link on homepage {string} without login")
	   public void the_user_clicks_on_get_started_link_on_homepage_without_login(String modulename) {
	      hp.clickgetstarted(modulename);
	      loggerLoad.info("The user clicks on Get Started link on homepage {string} without login");
	   }

	 @Then("The user get warning message {string}")
	   public void the_user_get_warning_message(String string) {
	      
		  String error= hp.errormsg1();
		 Assert.assertEquals(string,error);
		 loggerLoad.info("The user get warning message ");
		  
	   }
	 @When("The user clicks Sign in")
	 public void the_user_clicks_sign_in() {
	     
	     hp.signin();
	     loggerLoad.info("The user clicks Sign in");
	 }

	 @Then("The user should be redirected to Sign in page")
	 public void the_user_should_be_redirected_to_sign_in_page() {
		 String titleofhomepage="Login";
	  hp.Getpagetitle();	
	  Assert.assertEquals(titleofhomepage,hp.Getpagetitle());
	  loggerLoad.info("The user should be redirected to Sign in page");
	 }
	 @When("The user clicks Register")
	 public void the_user_clicks_register() {
	     hp.registerclick();
	     loggerLoad.info("The user clicks Register");
	 }

	 @Then("The user should be redirected to Register form")
	 public void the_user_should_be_redirected_to_register_form() {
		 String titleofhomepage="Registration";
		  hp.Getpagetitle();	
		  Assert.assertEquals(titleofhomepage,hp.Getpagetitle());
		  loggerLoad.info("The user should be redirected to Register form");
	 }
	 
}
