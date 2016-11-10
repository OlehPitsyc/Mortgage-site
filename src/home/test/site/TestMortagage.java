package home.test.site;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestMortagage {

	protected WebDriver driver;
	// protected String baseUrl;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		// baseUrl = "www.i.ua";
	}

	@AfterClass
	public void cleanUp() {
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
