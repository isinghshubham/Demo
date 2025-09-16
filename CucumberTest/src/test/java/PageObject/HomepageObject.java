package PageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

public class HomepageObject {

	public WebDriver driver;

	public HomepageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
