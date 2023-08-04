package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewAccountPage {
	
	private  WebDriver DriverG ;
	
	 private Actions act ;
	 
	 private WebDriverWait wait;
	
	@FindBy (xpath = "//a[@rel=\\\"async\\\"]")
	private WebElement CreatAac;
	
	@FindBy (xpath = "//input[@type=\\\"text\\\"])[2]")
	private WebElement firstname;
	
	@FindBy (xpath = "(//input[@type=\\\"text\\\"])[3]")
	private WebElement username;
	
	@FindBy (xpath = "/input[@name=\\\"reg_email__\\\"]")
	private WebElement email;
	
	@FindBy (xpath = "(//input[@type=\\\"password\\\"])[2]")
	private WebElement password;
	
	@FindBy (xpath = "//select[@title=\\\"Day\\\"]\"")
	private WebElement days;
	
	@FindBy (xpath = "//option[@value=\\\"7\\")
	private WebElement selectday;
	
	@FindBy (xpath = "//select[@title=\\\"Month\\\"]")
	private WebElement month;
	
	@FindBy (xpath = "//option[@value=\\\"8\\\"]")
	private WebElement selectMonth;
	
	@FindBy (xpath = "//select[@title=\\\"Year\\\"]")
	private WebElement year;
	
	@FindBy (xpath = "//option[@value=\\\"2000\\\"]")
	private WebElement selectYear;
	
	@FindBy (xpath = "(//input[@type=\\\"radio\\\"])[1]")
	private WebElement male;
	
	@FindBy (xpath = "//button[text()='Sign Up']")
	private WebElement ClickOnSignIn;
	
	@FindBy (xpath = "(//a[text()= 'Terms'])[2]")
	private WebElement ClickOnTerms;
	
	@FindBy (xpath = "(//a[text()= 'Privacy Policy'])[2]")
	private WebElement ClickOnPrivacyPolicy;
	
	@FindBy (xpath = "//a[text()= 'Cookies Policy']")
	private WebElement ClickOnCookiesPolicy;
	
	public CreateNewAccountPage  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.DriverG = driver;
		 new Actions (driver);
		 wait = new WebDriverWait(driver, 20);
	}
	
	public void ClickOnCreateAccount() {
		
		act.click().perform();
	}
	
	public void SendFirstName (String name) {
		 firstname.sendKeys(name);
	}
	
	public void sendusername(String user) {
		username.sendKeys(user);
	}
	
	public void sendPassword (String email) {
		password.sendKeys(email);
	}
	public void Days() {
		Select as = new Select(days);
		as.selectByVisibleText("5");
	}
//	public void selectDay() {
//		act.click().perform();
//	}
	public void selectmonth() {
		Select se = new Select(month);
		se.selectByVisibleText("se");
	}
//	public void selectMonth() {
//		
//	}
	public void selectYear() {
		Select as = new Select (year);
	as.selectByVisibleText("2020");
	}
//	public void selectyear() {
//		selectYear.click();
//	}
	public void male () {
		act.click().perform();
	}
	public void ClickOnSignInButton() {
		ClickOnSignIn.click();
	}
	
	public void ClickOnTermsButton() {
		ClickOnTerms.click();
	}
	public void ClickOnPrivacyPolicy() {
		ClickOnPrivacyPolicy.click();
	}
	public void ClickOnCookiesPolicyButton() {
		ClickOnCookiesPolicy.click();
	}
	

}


