package com.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage_PO {
	private WebDriver driver;
	Boolean value;
	String text;

	@FindBy(xpath="//a[text()='Data Structures']")WebElement dropdownmenu;
	@FindBy(xpath="//a[text()='Stack']")WebElement stackindropdown;
	@FindBy(xpath="//a[text()='Operations in Stack']")WebElement operationsinstack;
	@FindBy(xpath="//a[text()='Implementation']")WebElement implementation;
	@FindBy(xpath="//a[text()='Applications']")WebElement Applications;
	//@FindBy(partialLinkText = "Try here") WebElement tryhere;
	@FindBy(xpath="//a[text()='Try here>>>']") WebElement tryhere;

	@FindBy (xpath="//button[text()='Run']") WebElement runbtn;
	@FindBy (xpath ="//form[@id='answer_form']/div/div/div/textarea") WebElement tryeditor;
	@FindBy (id="output")WebElement output;
	@FindBy (xpath ="//a[text()='Practice Questions']") WebElement practicequestions;

	public StackPage_PO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);}
	
	
	public Boolean assessment() {

		if(value=runbtn.isDisplayed()) {
		}
		return value;
	}
	public void submoduleclick(String name) {
		switch(name) {

		case "Operations in Stack":operationsinstack.click();break;
		case "Implementation":implementation.click();break;
		case "Applications":Applications.click();break;
		case "Practice Questions":practicequestions.click();break;

		}
	}
	public void clicktryhere() {
		tryhere.click();
	}
	public void enterdatatotryeditor(String code) throws InterruptedException {

		text=code;			
		tryeditor.sendKeys(code);
}
	public void clickrunbtn() {
		runbtn.click();
	}
	public Boolean output() {
		String outputdata=text.replace("print","").replace("'","");
		if(output.getText().equals(outputdata)) { }
		return true;
	}
	public void geterrormsg() {
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().accept();
	}

}