package home.test.site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleObject {

	protected WebDriver driver;

	public GoogleObject(WebDriver driver) {
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	}

}
