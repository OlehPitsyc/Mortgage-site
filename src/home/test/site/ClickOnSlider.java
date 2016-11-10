package home.test.site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickOnSlider extends GoogleObject {

	@FindBy(xpath = "//*[@id='PrixProprietePlus']")//лайфхак к можна зібльшити значення на слайдері.
	private WebElement slider;
	
	public ClickOnSlider(WebDriver driver) {
		super(driver);
	}

	public void moveSlider() {
		this.slider.click();
	}
}