package stepDefinitions;

import java.util.List;

import org.junit.Assert;

import com.pageObjects.HomePage_PO;
import com.pageObjects.RegisterPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.loggerLoad;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegisterPage_SD {
	RegisterPage_PO rp=new RegisterPage_PO(DriverFactory.getDriver());
	HomePage_PO hp=new HomePage_PO(DriverFactory.getDriver());
	//comments
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/register");
		loggerLoad.info("user opens Register page");
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty() {
		rp.register();
		 loggerLoad.info("The user clicks Register button with all fields empty");
	   
	}
	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String error) throws InterruptedException {
		String error1=rp.displayerror();
		Assert.assertEquals(error1,error);
		 loggerLoad.info("It should display an error {string} below Username textbox");
	}
	@When("When The user clicks Register button after entering username with other fields empty")
	public void when_the_user_clicks_register_button_after_entering_username_with_other_fields_empty(io.cucumber.datatable.DataTable dataTable) {
		List<String> rows = dataTable.asList(String.class);
		 rp.enterusername(rows.get(1));
		 rp.register();
		 loggerLoad.info("When The user clicks Register button after entering username with other fields empty");
	}

	

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String error) {
		
		String error1=rp.displayerror();
		Assert.assertEquals(error1,error);
		 loggerLoad.info("It should display an error {string} below Password textbox");
	}
	
	@When("The user enters a username with characters other than Letters, digits and special characters")
	public void the_user_enters_a_username_with_characters_other_than_letters_digits_and(DataTable dataTable) {
		List<List<String>> userdata = dataTable.asLists(String.class);
		 rp.enterusername(userdata.get(1).get(0));
		 rp.enterpassword(userdata.get(1).get(1));
		 rp.confirmpwsd(userdata.get(1).get(2));
		 rp.register();
		 loggerLoad.info("The user enters a username with characters other than Letters, digits and special characters");
	}


	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String error) {
	  String error1= hp.errormsg1();
	   Assert.assertEquals(error1,error);
	   loggerLoad.info("It should display an error message");
	}
	
	@When("The user clicks Register button after entering valid username and different passwords in password and password confirmation fields")
	public void the_user_clicks_register_button_after_entering_valid_username_and_different_passwords_in_password_and_password_confirmation_fields(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> userdata = dataTable.asLists(String.class);
		 rp.enterusername(userdata.get(1).get(0));
		 rp.enterpassword(userdata.get(1).get(1));
		 rp.confirmpwsd(userdata.get(1).get(2));
		 rp.register();
		 loggerLoad.info("The user clicks Register button after entering valid username and different passwords in password and password confirmation fields");
	}
	@When("The user enters a valid username and password and password confirmation")
	public void the_user_enters_a_valid_username_and_password_and_password_confirmation(DataTable dataTable) {
		List<List<String>> userdata = dataTable.asLists(String.class);
		 rp.enterusername(userdata.get(1).get(0));
		 rp.enterpassword(userdata.get(1).get(1));
		 rp.confirmpwsd(userdata.get(1).get(2));
		 rp.register();
		 loggerLoad.info("The user enters a valid username and password and password confirmation");
	}

	@Then("The user should be redirected to Homepage and pagetitle is {string}")
	public void the_user_should_be_redirected_to_homepage_and_pagetitle_is(String title) {
			
		  Assert.assertEquals(title,DriverFactory.getdriverTitle());
		  loggerLoad.info("The user should be redirected to Homepage and pagetitle is");
	}

}
