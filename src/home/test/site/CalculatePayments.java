package home.test.site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatePayments extends GoogleObject {

	@FindBy(xpath = "//*[@id='main']/div[2]/div[4]/div[1]/div[2]/a")//нестабільний локатор. інколи не спрацьовує.знаю що треба буде помняти
	private WebElement button;

	public CalculatePayments(WebDriver driver) {
		super(driver);
	}

	public void clickOnButton() {
		this.button.click();
	}

}
