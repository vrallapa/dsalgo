package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import com.pageObjects.HomePage_PO;
import com.pageObjects.LinkedList_PO;
import com.pageObjects.LoginPage_PO;
import com.pageObjects.RegisterPage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.loggerLoad;

import io.cucumber.java.en.*;

public class LinkedList_SD {
	
	private RegisterPage_PO rp = new RegisterPage_PO(DriverFactory.getDriver());
	private LoginPage_PO lp = new LoginPage_PO(DriverFactory.getDriver());
	private HomePage_PO hp = new HomePage_PO(DriverFactory.getDriver());
	private LinkedList_PO listpage = new LinkedList_PO(DriverFactory.getDriver());
	
	/*
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		rp.enterusername("pluton@gmail.com");
		lp.enterpassword("Nnsdet@115");
		lp.clicklogin();
	}*/

	/*@When("The user selecting {string} item from the drop down menu")
	public void the_user_selecting_item_from_the_drop_down_menu(String module) {
	    hp.mainDropDown();
	    hp.dropDownSelection(module);
	}*/

	/*@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String expectedTitle) {
		Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
	}*/
	
	/*@Given("The user is in the {string} page after logged in")
	public void the_user_is_in_the_page_after_logged_in(String module) {
		hp.mainDropDown();
		hp.dropDownSelection(module);
	}*/

	@When("The user clicks {string} link of Linked List page")
	public void the_user_clicks_link(String subLink) {
		listpage.subLinkClick(subLink);
		loggerLoad.info("The user clicks {string} link of Linked List page");
	}
	
	@Given("The user is on the {string} page of Linked List after logged in")
	public void the_user_is_on_the_after_logged_in(String subLink) {
		listpage.subLinkClick(subLink);
		loggerLoad.info("The user is on the {string} page of Linked List after logged in");
	}
	@When("The user clicks on the {string}")
	public void the_user_clicks_on_the(String subLink) {
		listpage.subLinkClick(subLink);
		loggerLoad.info("The user clicks on the {string}");
	}

	/*@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
	    listpage.clickTryHere();
	}
*/
	/*@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    Assert.assertTrue(listpage.assessment()); 
	}*/
	
	/*@Given("The user is in a try here page having tryEditor with a Run button to test")
	public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/tryEditor");
	}*/

	/*@When("The user Enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
	    List<Map<String,String>> testData = reader.getData("./src/test/resources/ProjectExcelSheets/tryEditor.xlsx", Sheetname);
	    String Data = testData.get(RowNumber).get("testData");
	    listpage.enterDataToTryEditor(Data);	
	}*/

	/*@When("user click on Run button")
	public void user_click_on_run_button() {
	    listpage.clickRunBtn();
	}*/

	/*@Then("The user should be presented with the Run output")
	public void the_user_should_be_presented_with_the_run_output() {
		Assert.assertTrue(listpage.runOutput());
	}*/
	
	/*@When("The user Enter invalid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_invalid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
	    List<Map<String,String>> testData = reader.getData("./src/test/resources/ProjectExcelSheets/tryEditor.xlsx", Sheetname);
	    String Data = testData.get(RowNumber).get("testData");
	    listpage.enterDataToTryEditor(Data);	
	}*/
	
	/*@Then("The user should be presented with the Run output with alert")
	public void the_user_should_be_presented_with_the_run_output_with_alert() {
	    DriverFactory.alert();
	    DriverFactory.navigateback();
	}*/
	
	
}