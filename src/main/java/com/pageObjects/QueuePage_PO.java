package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;

public class QueuePage_PO {
	private WebDriver driver;
	@FindBy(xpath="//a[text()='Queue']")WebElement queueindropdown;
	@FindBy(xpath="//a[text()='Implementation of Queue in Python']")WebElement impofqueinpython;
	@FindBy(xpath="//a[text()='Implementation using collections.deque']")WebElement impcollectdeque;
	@FindBy(xpath="//a[text()='Implementation using array']")WebElement impusingarray;
	@FindBy(xpath="//a[text()='Queue Operations']")WebElement queueoperations;
	@FindBy (xpath ="//a[text()='Practice Questions']") WebElement practicequestions;



	public QueuePage_PO(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);}
	
	public void submoduleclick1(String name) {
		switch(name) {
		
		case "Implementation of Queue in Python":impofqueinpython.click();break;
		case "Implementation using collections.deque":impcollectdeque.click();break;
		case "Implementation using array":impusingarray.click();System.out.println("Opening Implementation array link");break;
		case "Queue Operations":queueoperations.click();break;
		case "Practice Questions":practicequestions.click();break;

}
	}
	}
