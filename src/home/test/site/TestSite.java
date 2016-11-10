package home.test.site;

import org.testng.annotations.Test;

public class TestSite extends TestMortagage {

	private String baseUrl = "http://ia.ca/";

	@Test
	public void testPage() {
		driver.get(baseUrl);
		OpenIA openSite = new OpenIA(driver);
		openSite.clickOnElements();
		openSite.clickOnElementsLink();
		CalculatePayments calc = new CalculatePayments(driver);
		calc.clickOnButton();
		ClickOnSlider sd = new ClickOnSlider(driver);
		sd.moveSlider();
	}

}
