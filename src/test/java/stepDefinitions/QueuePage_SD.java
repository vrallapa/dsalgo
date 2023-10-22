package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pageObjects.HomePage_PO;
import com.pageObjects.LoginPage_PO;
import com.pageObjects.QueuePage_PO;
import com.pageObjects.RegisterPage_PO;
import com.pageObjects.StackPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.loggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueuePage_SD {
	private StackPage_PO sp=new StackPage_PO(DriverFactory.getDriver());
	private LoginPage_PO lp=new LoginPage_PO (DriverFactory.getDriver());
	 private RegisterPage_PO rp=new RegisterPage_PO (DriverFactory.getDriver());
	private HomePage_PO hp=new HomePage_PO(DriverFactory.getDriver());
	private QueuePage_PO qp=new QueuePage_PO(DriverFactory.getDriver());

	/*@Given("user is on signin page")
	public void user_is_on_signin_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");    

	}

	@When("user enters the valid credentials {string} and {string}")
	public void user_enters_the_valid_credentials_and(String username, String password) {
		rp.enterusername(username);
	     lp.enterpassword(password);	}*/

	/*@Then("click login to verify and page title should be {string}")
	public void click_login_to_verify_and_page_title_should_be(String titleofhomepage) {
		lp.clicklogin();
	     Assert.assertEquals(titleofhomepage,DriverFactory.getdriverTitle());	}*/


@When("The user clicks on {string} link")
public void the_user_clicks_on_link(String module) {
    qp.submoduleclick1(module);
    loggerLoad.info("The user clicks on {string} link");

}

@Given("The user is on the {string} page in queue after logged in")
public void the_user_is_on_the_page_in_queue_after_logged_in(String module) {
	qp.submoduleclick1(module);
	 loggerLoad.info("The user is on the {string} page in queue after logged in");
}

/*
@When("The user clicks Try Here link")
public void the_user_clicks_on_try_here_button() throws InterruptedException {
	Thread.sleep(2000);
    sp.clicktryhere();
}
@Given("The user is in a page having an Editor with a Run Button to Test")
public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/tryEditor");    

}

*/




}