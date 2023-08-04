package pomXiomi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfMobilesPage {
	private WebDriver driver;
	
	@FindBy (xpath = "(//div[@data-index=\"2\"]//span)[15]")
	private WebElement selectPhone;
	
	@FindBy (xpath = "//span[text() = 'Add to Cart']")
	private WebElement AddToCardButton;
	
	@FindBy (xpath = "(//div[@data-index=\"2\"]//span)[16]")
	private WebElement ClickOnWatch;
	
	

	
	public   ListOfMobilesPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		 
	}
	
//	public void ClickOnMobile(){
//		selectPhone.click();
//	}
//	public void ClickOnAddToCardButton() {
//		AddToCardButton.click();
//	}

	public void ClickOnMobile() {
		selectPhone.click();
		
	}
	public void ClickOnWatch() {
		ClickOnWatch.click();
	}

}
