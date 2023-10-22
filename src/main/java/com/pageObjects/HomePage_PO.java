package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PO {
	
	private WebDriver driver;

	@FindBy (xpath="//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']")WebElement datastrgetstarted;
    @FindBy (xpath="//div[@class='alert alert-primary']")WebElement errormsg1;
	@FindBy(xpath="//h5[text()='Array']/..//a[text()='Get Started']")WebElement arraygetstarted;
	@FindBy (xpath="//h5[text()='Linked List']/..//a[text()='Get Started']")WebElement linklistgetstarted;
	@FindBy (xpath="//h5[text()='Stack']/..//a[text()='Get Started']")WebElement stackgetstarted;
	@FindBy (xpath="//h5[text()='Queue']/..//a[text()='Get Started']")WebElement queuegetstarted;
	@FindBy (xpath="//h5[text()='Tree']/..//a[text()='Get Started']")WebElement treegetstarted;
	@FindBy (xpath="//h5[text()='Graph']/..//a[text()='Get Started']")WebElement graphgetstarted;
	@FindBy (xpath="//a[text()='Sign in']")WebElement signin;
	@FindBy (xpath="//a[text()=' Register ']")WebElement register;
	@FindBy (linkText = "Data Structures") WebElement mainDropDown;
	 @FindBy (linkText = "Arrays") WebElement arrayDropDown;
	 @FindBy (linkText = "Linked List") WebElement linkedListDropDown;
	 @FindBy (linkText = "Stack") WebElement stackDropDown;
	 @FindBy (linkText = "Queue") WebElement queueDropDown;
	 @FindBy (linkText = "Tree") WebElement treeDropDown;
	 @FindBy (linkText = "Graph") WebElement graphDropDown;
	
	 public HomePage_PO(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 }

public void clickgetstarted(String option) {
	
	
			
			switch(option) {
			case "Datastructures": datastrgetstarted.click();break;
			case "Arrays":arraygetstarted.click();break;
			case "Linkedlist":arraygetstarted.click();break;
			case "Stack":stackgetstarted.click();break;
			case "Queue":queuegetstarted.click();break;
			case "Tree":treegetstarted.click();break;
			case "Graph":graphgetstarted.click();break;
			
		}
			}
public String errormsg1() {
	return errormsg1.getText();
	
}
	public void signin() {
		signin.click();
	}
	public String Getpagetitle() {
		 return driver.getTitle();
	 }
	public void registerclick() {
		register.click();
	}
	public void mainDropDown() {
		  mainDropDown.click();
		 }
		 
		 public void dropDownSelection(String option) {
		  switch(option) {
		  case "Arrays": 
		   arrayDropDown.click();break;
		  case "Linked List": 
		   linkedListDropDown.click();break;
		  case "Stack": 
		   stackDropDown.click();break;
		  case "Queue": 
		   queueDropDown.click();break;
		  case "Tree": 
		   treeDropDown.click();break;
		  case "Graph": 
		   graphDropDown.click();break;
		  }
		 }
}
