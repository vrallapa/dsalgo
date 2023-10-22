package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage_PO {
	
	@FindBy(name="username")WebElement username;
	@FindBy(name="password1")WebElement password;
	@FindBy(name="password2")WebElement confirmpassword;
	@FindBy(xpath="//input [@value='Register']")WebElement register;
	
	private WebDriver driver;
	
	public RegisterPage_PO(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver,this);
	}
	
	public void register() {
		
		register.click();
	}
	
	public void enterusername(String name) {
		username.sendKeys(name);
		
	}
	public void enterpassword(String pwsd) {
		password.sendKeys(pwsd);
		
	}
	public void confirmpwsd(String cpwsd) {
		confirmpassword.sendKeys(cpwsd);
		
		System.out.println(cpwsd);
	}
	
	
	public String  displayerror() {
		String error = null;
		
		String val=username.getAttribute("required"); 
		if(val.equalsIgnoreCase("true")) {
			
			 error="Please fill out this field.";
			
			
		}
		
		return error;
	
		
		
	}

	

	

}
