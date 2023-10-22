package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPage_PO {
	
		private WebDriver driver;
		
	    //By locators
	 @FindBy(xpath="//button[text()='Get Started']")WebElement getstartedbtn;
	 
		

		 //constructor of the page class
		 public PortalPage_PO(WebDriver driver) {
		this.driver=driver;
			 PageFactory.initElements(driver,this);}
		 
		 //page actions
		 
		 public String Getpagetitle() {
			 return driver.getTitle();
		 }
		 
		public void clickstartbutton() {
			getstartedbtn.click();
		}
		
		
		}
	

