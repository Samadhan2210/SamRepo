package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAndPass {
	
	

	@FindBy (xpath = "//input[@type=\"text\"]")
	private WebElement UserName;
	
	@FindBy (xpath = "//input[@type=\"password\"]")
	private WebElement Password;
	
	@FindBy (xpath = "//button[text() = 'Log in']")
	private WebElement login;

	public UserAndPass(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	public void SendUserName(String user) {
		UserName.sendKeys(user);
	}
	public void SendPassword(String pass) {
		Password.sendKeys(pass);
	}
	public void ClickloginButton() {
		login.click();
	}
}
