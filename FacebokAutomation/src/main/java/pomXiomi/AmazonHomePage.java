package pomXiomi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage{
	
	public static final String Thread = null;

	 private WebDriver driver;
	  private WebDriverWait Wait;
	
	@FindBy (xpath = "//input[@type=\"text\"]")
	 private WebElement SearchBar;
	
	@FindBy (xpath = "//input[@type=\"submit\"]")
	 private WebElement clickSearchButton;
	
	@FindBy (xpath ="//span[@class=\"nav-cart-icon nav-sprite\"]") 
	private WebElement AddToCard;
	
	@FindBy (xpath = "//span[text()='Hello, sign in']") 
	private WebElement SingInAcc;
	
	@FindBy (xpath = "//span[text()='Your Orders']")
	private WebElement MyOrderButton;
	
	@FindBy (xpath = "//div[@data-asin=\"B0BZCR6TNK\"]//h2//span")
	private WebElement SelectMobile;
	
	@FindBy (xpath = "//div[@data-asin=\"B0BZCR6TNK\"]//h2//span")
	private WebElement j;
	
	public AmazonHomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	
	}
	
	public void ClickOnSearchBar() {
		SearchBar.click();
	}
	public void SendValuesInSearchBar(String name ) {
		SearchBar.sendKeys(name);
	}
	public void ClickOnSearchButton() {
		clickSearchButton.click();
	}
	public void ClickOnAddToCardButton() {
		AddToCard.click();
	}
	public void MoveOnSingInButton() {
		Actions act = new Actions (driver);
		act .moveToElement(SingInAcc).click().build().perform();
	}
	public void ClickOnSigInButton() {
		SingInAcc.click();
	}
	public void ClickMyOrderButton() {
		MyOrderButton.click();
	}
	public void SelectTheMobile() {
		SelectMobile.click();
	}
	
}

