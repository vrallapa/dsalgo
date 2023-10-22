package com.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PO {
	
private WebDriver driver;
@FindBy (name = "username") WebElement usernameTxtBox;
@FindBy (name = "password") WebElement password;
@FindBy (xpath="//input[@value='Login']")WebElement login;
@FindBy (xpath="//a[text()='Register!']")WebElement register;	
@FindBy (xpath = "//a[text()='Sign out']") WebElement logoutbtn;
	

public LoginPage_PO(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver,this);
	}
	public void enterpassword(String pwsd) {
		password.sendKeys(pwsd);
		
	}
	
	public void clicklogin() {
		login.click();
		
	}
	public void clickregisterlink() {
		register.click();
	}
	public void clicklogout() {
		logoutbtn.click();
	}
	
}
