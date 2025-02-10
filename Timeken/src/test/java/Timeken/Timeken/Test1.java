package Timeken.Timeken;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test1 {


	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions s=new ChromeOptions();
		s.addArguments("incognito");
		WebDriver driver=new ChromeDriver(s);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input[title=\"Search for Products, Brands and More\"]")).sendKeys("Iphone",Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.cssSelector("div[data-id=\"MOBGTAGPDTKHHHZU\"] .KzDlHZ")).click();
		Set<String> windows = driver.getWindowHandles();
		String parent = driver.getWindowHandle(); // Store the parent window handle

		for (String window : windows) {
		    if (!window.equals(parent)) {
		        driver.switchTo().window(window);
		        break; // Exit loop once switched to the child window
		    }
		}

	driver.findElement(By.cssSelector("#container > div > div.krHvwW > div.J\\+HqMZ > div.Ja1j8k > div.RbF1Du.UB4mMK > div > div > div > a")).click();

		
	}

}