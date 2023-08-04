package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	
	@FindBy (xpath = "//a[text()='Forgotten password?']")
	private WebElement ForgotPasswordButton;
	
	@FindBy (xpath = "//h2[text()='Find Your Account']") 
	private WebElement FindYourAccountText;
	
	@FindBy (xpath = "//div[@class=\"_9nq2 marginBottom16px\"]")
	private WebElement Massenge;
	
	@FindBy (xpath = "//input[@type=\"text\"]")
	private WebElement EmailAndPassword;
	
	@FindBy (xpath = "//button[text()= 'Search']") 
	private WebElement SearchButton;
	
	@FindBy (xpath = "//a[text()= 'Cancel']")
	private WebElement CancelButton;
	
	  
	
	public ForgotPassword (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickForgotPassWordButton () {
		
	}
	public void GetText() {
		
	}
	public void SendKeyEmail() {
		
		
	}
	public void ClickseachButton() {
		
	}
	public void ClickCancelButton() {
		
	}

}
