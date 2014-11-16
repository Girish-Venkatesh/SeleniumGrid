

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Runner {
	
	public static void main(String[] args) throws MalformedURLException {
		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://yahoo.com");
//		driver.quit();
		
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.XP);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"), capability);
		driver.get("http://yahoo.com");
		driver.quit();
	}
}
