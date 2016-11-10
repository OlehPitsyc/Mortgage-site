package home.test.site1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenSiteInMozila {
	private WebDriver driver;
	private String baseUrl;

	@BeforeClass
	private void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://ia.ca/mortgage-payment-calculator";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//@FindBy.
	}

	@Test
	private void test1() {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.findElement(By.xpath("//*[@id='nav-secondaire']/div[1]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@aria-labelledby = 'Produits']/ul[1]/li[1]/a")).click();;
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div[4]/div[1]/div[2]/a")).click();*/
		//driver.findElement(By.xpath("//input[@id='PrixPropriete']")).sendKeys("25000");
		driver.findElement(By.xpath("//*[@id='PrixProprietePlus']")).click();
		
	}
}
