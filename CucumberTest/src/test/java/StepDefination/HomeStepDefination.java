package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeStepDefination {

	public WebDriver driver;

	@Given("User open the chrome browser")
	public void lauchChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("User search the URL {string}")
	public void openURL(String url) {
		driver.get(url);
	}

	@Then("The user should be able to view Home tab should be open")
	public void verifytab() {
		System.out.println(driver.getTitle());
	}
}
