package FirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RemoteWebDriver driver;
System.setProperty("webdriver.gecko.driver", "C:\\Users\\ABHINAV\\eclipse-workspace\\FirstProject\\driver\\geckodriver.exe");
driver= new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.google.com");

	}

}
