package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructures_PO {
	
	

		
			@FindBy(xpath = "//div//a[text()='Get Started'][1]") WebElement dsGetStarted;
			@FindBy(xpath = "//div//a[text()='Time Complexity']") WebElement timecom;
			//@FindBy(xpath = "//*[text()='Try here>>>']") WebElement tryhere;
			@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement dsinput;
			//@FindBy(xpath = "//*[text()='Run']") WebElement dsrun;
			@FindBy(xpath = "//div//pre[@id='output']") WebElement dsoutput;
			@FindBy(xpath="//*[text()='Practice Questions']") WebElement ds_pQ;
			
				public DataStructures_PO(WebDriver driver) {

				PageFactory.initElements(driver, this);		}
			
			public void getStarted_ds() {
				dsGetStarted.click();	}
			
			public void timecomplex() {
				timecom.click();	}
			
			//public void tryhereds() {
				//tryhere.click();	}
			
			public void dsinput1() {
				dsinput.sendKeys("print'Data_Structures'");	}
			
			//public void dsrun1() {
			//	dsrun.click();	}
			
			public void dsoutput1() {
			System.out.println(dsoutput.getText());	}
			
			public void dsinvalidinput() {
				dsinput.sendKeys("print Data_Structures");	}
			
			//public void dsrun2() {
				//dsrun.click();	}
			
			public void dspracticeQ() {
				ds_pQ.click(); 	}
				
			}



