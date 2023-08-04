package TestNgPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pomModules.CreateNewAccountPage;
import pomModules.LogInToFacebookPage;
import utils.utility;



public class TestFile1 {
	 private WebDriver driver;
	 LogInToFacebookPage logInToFacebookPage ;
	 CreateNewAccountPage createNewAccountPage;
	  String testID;
	@Parameters("Browser123")
	@BeforeTest
	public void lounchBrowser(String browser) {
		System.out.println("BeforeClass");
		if(browser.equals("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "D:\\Selenium\\operadriver_linux64\\operadriver_linux64");
			driver = new OperaDriver();
		}
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	@BeforeClass
	public void CreatePOMObject() {
	 logInToFacebookPage  = new LogInToFacebookPage (driver);
	 createNewAccountPage = new CreateNewAccountPage (driver);
	}
	
	@BeforeMethod
	public void VarifyTheCreateNewAccountButton() throws InterruptedException {
		logInToFacebookPage.ClickOnCreateNewAccount();
		
		Thread.sleep(30000);
	}
	@Test
	public void VarifyTheCreateNewAccountFunctionality() throws InterruptedException, EncryptedDocumentException, IOException {
		testID = "T110";
		Thread.sleep(3000);
		
		createNewAccountPage.SendFirstName("samadhan");
		createNewAccountPage.sendusername( utility.FetchTheDataFromExcelSheet(testID, 1, 0));
		createNewAccountPage.sendPassword("samadhanmali3355@gmali.com");
		createNewAccountPage.selectmonth();
		createNewAccountPage.selectYear();
		createNewAccountPage.male();
}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
		System.out.println();
	}
	@AfterClass
	public void afterClass(ITestResult result) {
//		if(ITestResult.FAILURE == result.getStatus()) {
//			utility.CaptureScreenshoot(driver, testID);
//		}
		logInToFacebookPage = null;
		createNewAccountPage= null;
		
	}
	@AfterTest
	public void afterTest() {
//		driver.close();
//		System.gc();
	}
} 
