package com.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.factory.DriverFactory;

public class TreePage_PO {
	
private WebDriver driver;
@FindBy (xpath="//a[text()='Data Structures']")	WebElement dropdown;
@FindBy (xpath="//a[text()='Tree']") WebElement treeoption;	
@FindBy (xpath="//a[text()='Overview of Trees']") WebElement overviewoftrees;
@FindBy (xpath="//a[text()='Terminologies']") WebElement Terminologies;
@FindBy (xpath="//a[text()='Types of Trees']") WebElement TypesofTrees;
@FindBy (xpath="//a[text()='Tree Traversals']") WebElement TreeTraversals;
@FindBy (xpath="//a[text()='Traversals-Illustration']") WebElement TraversalsIllustration;
@FindBy (xpath="//a[text()='Binary Trees']") WebElement BinaryTrees;
@FindBy (xpath="//a[text()='Types of Binary Trees']") WebElement TypesofBinaryTrees;
@FindBy (xpath="//a[text()='Implementation in Python']") WebElement ImplementationinPython;
@FindBy (xpath="//a[text()='Binary Tree Traversals']") WebElement BinaryTreeTraversals;
@FindBy (xpath="//a[text()='Implementation of Binary Trees']") WebElement ImplementationofBinaryTrees;
@FindBy (xpath="//a[text()='Applications of Binary trees']") WebElement ApplicationsofBinarytrees;
@FindBy (xpath="//a[text()='Binary Search Trees']") WebElement BinarySearchTrees;
@FindBy (xpath="//a[text()='Implementation Of BST']") WebElement ImplementationOfBST;
@FindBy (xpath="//a[text()='Try here>>>']") WebElement tryherebtn;
@FindBy (xpath="//button[text()='Run']") WebElement runbtn;
@FindBy (xpath="//a[text()='Practice Questions']") WebElement practicequestions;
@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement tryeditor;
@FindBy (id="output")WebElement output;
//String outputdata;
Boolean value;
public Boolean display;
public String inputData;

	public TreePage_PO(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver,this);
		
	}
	public void dropdown() {
		dropdown.click();
		treeoption.click();
		
	}
	
/*public void openpage(String url) {
	String commonurl="https://dsportalapp.herokuapp.com/tree/";
	String url1=url.toLowerCase().replace(" ","-");
	commonurl = commonurl.concat(url1);
	
	DriverFactory.getDriver().get(commonurl);
     }	*/

public void submoduleclick(String name) {
	
	switch(name) {
	
	case "Overview of Trees":overviewoftrees.click();break;
	case "Terminologies":Terminologies.click();break;
	case "Types of Trees":TypesofTrees.click();break;
	case "Tree Traversals":TreeTraversals.click();break;
	case "Traversals-Illustration":TraversalsIllustration.click();break;
	case "Binary Trees":BinaryTrees.click();break;
	case "Types of Binary Trees":TypesofBinaryTrees.click();break;
	case "Implementation in Python":ImplementationinPython.click();break;
	case "Binary Tree Traversals":BinaryTreeTraversals.click();break;
	case "Implementation of Binary Trees":ImplementationofBinaryTrees.click();break;
	case "Applications of Binary trees":ApplicationsofBinarytrees.click();break;
	case "Binary Search Trees":BinarySearchTrees.click();break;
	case "Implementation Of BST":ImplementationOfBST.click();break;
	case "Practice Questions":practicequestions.click();
	}
		
	
}
public void tryhereclick() {
	tryherebtn.click();
}
public void runclick() {
	runbtn.click();
}

public Boolean assessment() {
	
	if(value=runbtn.isDisplayed()) {
	}
	return value;
}
/*public void enterdatatoeditor(String value) throws InterruptedException {
	
	outputdata=value;
	String datatoenter="print '"+value.toString()+"'";

	tryeditor.sendKeys(datatoenter);
		
	
}*/
public void enterDataToTryEditor(String data) {
	inputData = data;
	tryeditor.sendKeys(data);
}
public Boolean runOutput() {
	String outputData = inputData.replace("print", "").replace("'", "");
	if(output.getText().equals(outputData)) {}
	return true;
}
/*public void enterinvaliddatatoeditor(String value) throws InterruptedException {
	
	outputdata=value;
	tryeditor.sendKeys(value);
		
	
}*/
/*public Boolean output() {
	
	if(output.getText().equals(outputdata)) { }
  return true;
}*/
/*public void geterrormsg() {
	Alert alert = driver.switchTo().alert();
	//String alertMessage= driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
}*/

	
}




