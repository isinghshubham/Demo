package FlipKart.FlipKart;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FlipKartLogin extends Delivery_Page {

	String excelFilePath;
	String sheetName = "Sheet1";
	private static String Phone;
	public static WebDriver driver;

	@Test(priority = 1)
	@Parameters("UserDetail")
	@BeforeTest
	public void setup(String excelFilePath) {
		// Initialize the driver from WebDriverUtil
		this.driver = WebDriverUtil.getDriver();
		this.excelFilePath=excelFilePath;
		
	
	}

	@Parameters("URL")
	@Test(priority = 1)
	public void flipkartLoginTest(String url) {

		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			driver.get(url);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement profileIcon = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("a[class='_1TOQfO']"))));
			profileIcon.click();
			// String phoneNumber = Delivery_Page.getPhone();
			// System.out.print(phoneNumber);

			Object[][] data = ReadExcel.readExcelData(excelFilePath, sheetName);
			for (int i = 0; i < data.length; i++) {

				Phone = data[i][1].toString();
				driver.findElement(By.cssSelector("input[class*='r4vIwl']")).sendKeys(Phone);
				//driver.findElement(By.xpath("//button[text()='Request OTP']")).click();

				Search_Product searchProduct = new Search_Product();
				searchProduct.searchAndAddProduct();
				Delivery_Page deliverypage = new Delivery_Page();
				deliverypage.DeliveryScreen();

			}
		} catch (Exception e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
	}

	@AfterTest
	public void teardown() {

		// WebDriverUtil.quitDriver();
	}

	public static String getPhone() {
		// TODO Auto-generated method stub
		return Phone;
	}

}
