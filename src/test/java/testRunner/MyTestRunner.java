package testRunner;


//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
	import org.junit.runner.RunWith;
	//import org.junit.Test;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions
	
		(features = { "./src/test/resources/com.features" },
		 glue = {"stepDefinitions","appHooks" }, 
		 monochrome = true,
		 tags = "", 
		 plugin = {"pretty","json:target/cucumber-reports/Cucumber.json",
				 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
	 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	})
	 
	public class MyTestRunner  {

	}

