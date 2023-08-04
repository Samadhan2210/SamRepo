package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInToFacebookPage {
	
	@FindBy (xpath = "//input[@type=\"password\"]")
	private WebElement PassWord;
	
	@FindBy (xpath = "//div[@class=\"_9ay7\"]")
	private WebElement WrongPassMassege;
	
	@FindBy (xpath = "//button[text()='Log in']")
	private WebElement LogInButton;
	
	@FindBy (xpath = "(//a[@role=\"button\"])[2]")
	private WebElement ForgotPassWordButton;
	

	@FindBy (xpath = "(//a[@role='button'])[2]")
	private WebElement ClickOnCreateNewAccount;
	
	public LogInToFacebookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SendPassword(String pass) {
		PassWord.sendKeys(pass);
	}
	public void GetWrongMassege() {
	String mass =WrongPassMassege.getText();
	System.out.println(mass);
	}
	public void ClickLogInButton() {
		LogInButton.click();
	}
	public void ClickOnForgotPasswordButton() {
		ForgotPassWordButton.click();
	}
	public void ClickOnCreateNewAccount() {
		ClickOnCreateNewAccount.click();
	}

}
