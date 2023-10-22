package stepDefinitions;


import java.io.IOException;
import java.util.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import com.pageObjects.LoginPage_PO;
import com.pageObjects.RegisterPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.loggerLoad;

import io.cucumber.java.en.*;


public class LoginPage_SD {
	LoginPage_PO lp=new LoginPage_PO(DriverFactory.getDriver());
	RegisterPage_PO rp=new RegisterPage_PO(DriverFactory.getDriver());
	
	@Given("The user is in the Sign in page")
	public void the_user_is_in_the_sign_in_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		loggerLoad.info("user is in the sign in page");
	}

	@When("The user enters a valid {string} and {string}")
	public void the_user_enters_a_valid_and(String name, String pwsd) {
	    rp.enterusername(name);
	    lp.enterpassword(pwsd);
	    loggerLoad.info("The user enters a valid {string} and {string}");
	   
	}

	@Then("click login button to verify and pagetitle is {string}")
	 public void click_login_button_to_verify_and_pagetitle_is(String expectedTitle) {
	  lp.clicklogin();
	  Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
	  loggerLoad.info("click login button to verify and pagetitle is ");
	 }
	//commnet
	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String name, String pwsd) {
		rp.enterusername(name);
	    lp.enterpassword(pwsd);
	    loggerLoad.info("The user enter invalid {string} and {string}");
	}
	@Then("logout of the page")
	public void logout_of_the_page() {
		lp.clicklogout();
		loggerLoad.info("logout of the page");
	}

	@When("The user clicks on register link on signin page")
	 public void the_user_clicks_on_register_link_on_signin_page() {
	     lp.clickregisterlink();
	     loggerLoad.info("The user clicks on register link on signin page");
	 }

	 @Then("The user redirected to Registration page from signin page and title is {string}")
	 public void the_user_redirected_to_registration_page_from_signin_page(String titleofregistrationpage ) {
	     Assert.assertEquals(titleofregistrationpage,DriverFactory.getdriverTitle() );
	     loggerLoad.info("The user redirected to Registration page from signin page and title is {string}");
	 }
	 @When("The user enter sheet {string} and {int}")
	 public void the_user_enter_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		 ExcelReader reader=new ExcelReader();
		 
			List<Map<String,String>> data=reader.getData("./src/test/resources/ProjectExcelSheets/login.xlsx" , sheetname);
		
		
	    
		 String username=data.get(rownumber).get("username");
		 String password=data.get(rownumber).get("password");
		 rp.enterusername(username);
		    lp.enterpassword(password);
		    loggerLoad.info("The user enter sheet {string} and {int}");
	 }

	
	 @Then("click login button to verify title of the page {string}")
	 public void click_login_button_to_verify_title_of_the_page(String expectedtitle) {
		 lp.clicklogin();
		 String actualtitle=DriverFactory.getdriverTitle();
		 if(actualtitle.equals("NumpyNinja")) {
			 Assert.assertEquals(expectedtitle,DriverFactory.getdriverTitle() );
		 }
		 else
			 Assert.assertNotSame(expectedtitle,DriverFactory.getdriverTitle() );
		 loggerLoad.info("click login button to verify title of the page {string}");
	 }
	 
	 @Given("The user is in the Home page with valid  log in {string} and {string}")
	 public void the_user_is_in_the_home_page_with_valid_log_in_and(String username, String password) {
		 rp.enterusername(username);
		    lp.enterpassword(password);
		    loggerLoad.info("The user is in the Home page with valid  log in {string} and {string}");
	 }

	 @When("The user clicks Sign out")
	 public void the_user_clicks_sign_out() {
		 lp.clicklogout();
		 loggerLoad.info("The user clicks Sign out");
	 }
}