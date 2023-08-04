package TestNgPack;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomModules.CreateNewAccountPage;
import pomModules.ForgotPassword;
import pomModules.LogInToFacebookPage;
import pomModules.UserAndPass;

public class TestNGClass {
	
	private CreateNewAccountPage createNewAccoutPage;
	 private WebDriver driver;
	
	@BeforeTest 
	 public void beforeClass () {
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
	}
	
	@BeforeClass
	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		
		LogInToFacebookPage logInToFacebookPage = new LogInToFacebookPage(driver);
		logInToFacebookPage.ClickOnCreateNewAccount();
        
        
	}
	
	@Test(priority = 1)
	public void verifyTheTermsFunctionality() throws InterruptedException {
		 createNewAccoutPage = new CreateNewAccountPage(driver);
		createNewAccoutPage.ClickOnTermsButton();
		ArrayList<String> addr = new  ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		Thread.sleep(2000);
		String expectedeUrl = "https://www.facebook.com/legal/terms/update";
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedeUrl.equals(actualUrl))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
	}
	@Test (priority = 2)
	public void verifyTheCookiesPrivarcyFunctionality() {
	    createNewAccoutPage = new CreateNewAccountPage(driver);
		createNewAccoutPage.ClickOnCookiesPolicyButton();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String currenturl = "https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
        String expectedurl = "https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
		
        if (currenturl.equals(expectedurl))
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fails");
        }
		
	}
			
	@AfterMethod
	public void afteMethod () {
		driver.close();
		
	}
	@AfterClass
	public void afterClass() {
		
	}

}
