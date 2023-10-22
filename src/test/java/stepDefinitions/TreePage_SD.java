package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import com.pageObjects.HomePage_PO;
import com.pageObjects.LoginPage_PO;
import com.pageObjects.RegisterPage_PO;
import com.pageObjects.TreePage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.loggerLoad;

import io.cucumber.java.en.*;

public class TreePage_SD {
	HomePage_PO hp=new HomePage_PO(DriverFactory.getDriver());
	TreePage_PO tm=new TreePage_PO(DriverFactory.getDriver());
	LoginPage_PO lp=new LoginPage_PO(DriverFactory.getDriver());
	RegisterPage_PO rp=new RegisterPage_PO(DriverFactory.getDriver());
	Boolean value;
	
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		rp.enterusername("pluton@gmail.com");
		lp.enterpassword("Nnsdet@115");
		lp.clicklogin();
		loggerLoad.info("The user is in the Home page after logged in");
	}
	@When("The user selecting {string} item from the drop down menu")
	public void the_user_select_tree_item_from_the_drop_down_menu(String module) {
	  hp.mainDropDown();
	  hp.dropDownSelection(module);
	  loggerLoad.info("The user selecting {string} item from the drop down menu");
	    
	}
		//commenting the line
	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String expectedTitle) {
		Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
		loggerLoad.info("The user should be directed to {string} Page");
	}
	@Given("The user is in the {string} page after logged in")
	public void the_user_is_in_the_after_logged_in(String module) {
		hp.mainDropDown();
		  hp.dropDownSelection(module);
		  loggerLoad.info("The user is in the {string} page after logged in");
	}
	@Given("The user is on the {string} page after logged in")
	public void the_user_is_on_the_after_logged_in(String submodule) {
		//hp.mainDropDown();
	    tm.submoduleclick(submodule);
	    loggerLoad.info("The user is on the {string} page after logged in");
	}

	@When("The user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String name) {
	    tm.submoduleclick(name);
	    loggerLoad.info("The user clicks on the {string} link");
	}

	
	/*@Then("The user should then be directed to {string} Page")
	public void the_user_should_then_be_directed_to_page(String expectedTitle) {
		Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
	}*/
	

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button_in_page() {
	    tm.tryhereclick();
	    loggerLoad.info("The user clicks Try Here button");
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	 value=tm.assessment();
	Assert.assertTrue(value);
	loggerLoad.info("The user should be redirected to a page having an tryEditor with a Run button to test");
    
}
	@Given("The user is in a try here page having tryEditor with a Run button to test")
	public void the_user_is_in_trees_page_having_an_try_editor_with_a_run_button_to_test() {
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/tryEditor");
	loggerLoad.info("The user is in a try here page having tryEditor with a Run button to test");
}

	@When("The user gets input from sheet {string} and {int}")
	public void the_user_gets_input_from_sheet_and_in_trees(String sheetname, Integer rownumber) throws IOException, InvalidFormatException, InterruptedException {
	ExcelReader reader=new ExcelReader();
	 
	List<Map<String,String>> data=reader.getData("./src/test/resources/ProjectExcelSheets/tryEditor.xlsx" , sheetname);
	String cellvalue1=data.get(rownumber).get("testData");
	tm.enterDataToTryEditor(cellvalue1);
	loggerLoad.info("The user gets input from sheet {string} and {int}");
}

	@When("user click on Run button")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_trees_try_editor() {
   tm.runclick();
   loggerLoad.info("user click on Run button");
}

	@Then("The user should be presented with Run output")
	public void the_user_should_be_presented_with_run_output_for_trees() {
    Assert.assertTrue(tm.runOutput());
    loggerLoad.info("The user should be presented with Run output");
    		}

	@When("The user gets invalid input from sheet {string} and {int}")
	public void the_user_gets_invalid_input_from_sheet_and_in_trees(String sheetname, Integer rownumber) throws IOException, InvalidFormatException, InterruptedException {
	ExcelReader reader=new ExcelReader();
	 
	List<Map<String,String>> data=reader.getData("./src/test/resources/ProjectExcelSheets/tryEditor.xlsx" , sheetname);
	String cellvalue1=data.get(rownumber).get("testData");
	//String datatoenter="print '"+cellvalue1.toString()+"'";
	tm.enterDataToTryEditor(cellvalue1);
	loggerLoad.info("The user gets invalid input from sheet {string} and {int}");
}
	@Then("The user should be presented with the Run output with alert")
	public void the_user_should_get_the_error_message_for_trees() {
       DriverFactory.alert();
       DriverFactory.navigateback();
       loggerLoad.info("The user should be presented with the Run output with alert");
}

	@Then("The user should be directed to {string} of tree Page")
	public void the_user_should_be_directed_to_of_tree_page(String string) {
	    tm.submoduleclick(string);
	    loggerLoad.info("The user should be directed to {string} of tree Page");
	}





}
