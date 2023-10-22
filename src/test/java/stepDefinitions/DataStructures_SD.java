package stepDefinitions;

import com.pageObjects.DataStructures_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.loggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataStructures_SD extends TR_PF {

	DataStructures_PO ds = new DataStructures_PO(DriverFactory.getDriver());
	TR_PF trpf = new TR_PF();
	
	@Given("User is clicks on Datastructuregetstarted button")
	public void user_is_clicks_on_datastructuregetstarted_button() {
	    ds.getStarted_ds();
	    loggerLoad.info("User is clicks on Datastructuregetstarted button");
	}

	@When("user clicks on time complexity sub module")
	public void user_clicks_on_time_complexity_sub_module() {
	    ds.timecomplex();
	    loggerLoad.info("user clicks on time complexity sub module");
	}

	@Then("user clicks on tryhere button")
	public void user_clicks_on_tryhere_button() {
		//TR_PF trpf = new TR_PF();
		trpf.th();
		loggerLoad.info("user clicks on tryhere button");
	}

	@Given("user sends valid pythoncode and click on run button and print the output in console")
	public void user_sends_valid_pythoncode_and_click_on_run_button_and_print_the_output_in_console() {
	    ds.dsinput1();
	    trpf.run();
	    ds.dsoutput1();
	    loggerLoad.info("user sends valid pythoncode and click on run button and print the output in console");
	}

	@When("user navigates refresh")
	public void user_navigates_refresh() {
	    DriverFactory.refresh();
	    loggerLoad.info("user navigates refresh");
	}

	@Then("user sends invalid syntax and click on run button and capture the alert messsage")
	public void user_sends_invalid_syntax_and_click_on_run_button_and_capture_the_alert_messsage() {
	    ds.dsinvalidinput();
	    trpf.run();
	    DriverFactory.alert();
	    loggerLoad.info("user sends invalid syntax and click on run button and capture the alert messsage");
	}

	@Then("user navigates back")
	public void user_navigates_back() {
		 DriverFactory.navigateback();
		 loggerLoad.info("user navigates back");
	}

	@Given("user clicks on practice Questions")
	public void user_clicks_on_practice_questions() {
	    ds.dspracticeQ();
	    loggerLoad.info("user clicks on practice Questions");
	}

	@Then("uset navigates back")
	public void uset_navigates_back() throws InterruptedException {
	    DriverFactory.navigateback();
	    Thread.sleep(3000);
	    loggerLoad.info("uset navigates back");
	    }

}