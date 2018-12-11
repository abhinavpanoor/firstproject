package cucumberproject;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class StepDefinition {
	RemoteWebDriver driver;
	
	@Given("open facebook")
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ABHINAV\\eclipse-workspace\\FirstProject\\driver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@And("enter email")
	public void enterEmail() {
		driver.findElementByXPath("//input[@id='email']").sendKeys("abhinavpanoor@gmail.com");
	}
	
	@And("enter password")
	public void enterPass() {
		driver.findElementByXPath("//input[@id='pass']").sendKeys("shemale88.");
		
	}
	@And("click on login")
	public void login() throws InterruptedException {
		driver.findElementByXPath("//input[@value='Log In']").click();
		Thread.sleep(5000);
	}
	
	@And("close browser")
	public void closeBrowser() {
		driver.quit();
	}
	
}
