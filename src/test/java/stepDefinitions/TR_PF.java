package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.factory.DriverFactory;

public class TR_PF {
	
	static WebDriver driver = DriverFactory.getDriver();
	
	//TR_PF trpf = new TR_PF (WebDriver driver);
	
	public void th() {		
		WebElement tryhere1 = driver.findElement(By.xpath("//*[text()='Try here>>>']"));
		tryhere1.click(); }
	
	public void run() {
		WebElement run1 = driver.findElement(By.xpath("//*[text()='Run']"));
		run1.click(); }
		
	public void clear1() {
		WebElement t = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
		String s = Keys.chord(Keys.CONTROL,"a");
		t.sendKeys(s);
		t.sendKeys(Keys.DELETE);	}
	
}
	/*@FindBy(xpath = "//*[text()='Try here>>>']") WebElement tryhere;
	//@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement input;
	@FindBy(xpath = "//*[text()='Run']") WebElement run;
	@FindBy(xpath = "//div//pre[@id='output']")
	static WebElement output;
	
	public TR_PF (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void th_all() {
		tryhere.click();	}
	
	public void run_all() {
		run.click();
	}
	
	/*public void ip_all() {
		input.sendKeys(null);
	}
	
	public static String op_all() {
		return output.getText();
	}*/
	
	
	
	
	
	
	

