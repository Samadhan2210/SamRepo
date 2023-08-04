package pomXiomi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileDeitailsPage {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//input[@type=\"button\"]")
	private WebElement AddtocartButton;
	
	@FindBy (xpath = "(//input[@type=\"submit\"])[52]")
	private WebElement CartButton;
	
	@FindBy (xpath = "//input[@title=\"Buy Now\"]")
	private WebElement BuyButton;
	
	@FindBy (xpath = "//input[@name=\"email\"]")
	private WebElement SendEmail;
	
	@FindBy (xpath = "//input[@tabindex=\"5\"]")
	private WebElement ClickOnContiniuButton;
	




public MobileDeitailsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}



public void ClickOnAddToCardButton()
{
	AddtocartButton.click();
}
public void clickOnCardButton()
{
	CartButton.click();
}

public void ClickOnBuyButton() {
	BuyButton.click();
}
public void SendEmail(String email) {
	SendEmail.sendKeys(email);
}
public void ClickOnContiniuButton() {
	ClickOnContiniuButton.click();
}

}