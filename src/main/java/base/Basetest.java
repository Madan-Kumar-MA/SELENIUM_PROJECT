package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import utils.Log;

public class Basetest {

	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
		Log.info("Opening Browser");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Log.info("Navigating the URL");
		driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@AfterMethod
	public void teardown() {
		Log.info("Closing...");
		if (driver != null) {
			driver.quit();
		}
	}

	@AfterSuite
	public void openPortfolio() throws InterruptedException {
		WebDriver portfolioDriver = new ChromeDriver();
		portfolioDriver.manage().window().fullscreen();
		portfolioDriver.get("https://madankumarma-portfolio.ai.studio");
		Thread.sleep(5000);
		portfolioDriver.quit();
	}
}