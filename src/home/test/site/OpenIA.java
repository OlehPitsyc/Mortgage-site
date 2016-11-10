package home.test.site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenIA extends GoogleObject {

	@FindBy(xpath = "//*[@id='nav-secondaire']/div[1]/ul/li[4]/a")
	private WebElement loans;

	@FindBy(xpath = "//*[@aria-labelledby = 'Produits']/ul[1]/li[1]/a")
	private WebElement mortagages;

	public OpenIA(WebDriver driver) {
		super(driver);

	}

	public void clickOnElements() {
		this.loans.click();

	}

	public void clickOnElementsLink() {
		this.mortagages.click();
	}
}
