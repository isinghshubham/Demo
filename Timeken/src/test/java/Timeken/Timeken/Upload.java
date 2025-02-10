package Timeken.Timeken;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class Upload {


	public static void main(String args[]) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		driver.get("https://timkends.riversand.com/?idp=timkends_Auth0_idp");
		driver.findElement(By.id("username")).sendKeys("developerconfigurationspecialist.test1@timken.com");
		driver.findElement(By.id("password")).sendKeys("TimkenDcs@24$");
		driver.findElement(By.xpath("//button[text()=\"Continue\"]")).click();
		// Thread.sleep(1000);

		WebElement shadowHost = driver.findElement(By.cssSelector("#app"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		// Thread.sleep(8000);

		WebElement shadowHost2 = shadowRoot.findElement(By.cssSelector("app-common"));
		SearchContext shadowRoot2 = shadowHost2.getShadowRoot();
		// Thread.sleep(2000);
		WebElement shadowHost3 = shadowRoot2.findElement(By.cssSelector("#navMenu"));
		// Thread.sleep(2000);
		SearchContext shadowRoot3 = shadowHost3.getShadowRoot();
		// Thread.sleep(1000);
		WebElement shadowHost4 = shadowRoot3.findElement(By.cssSelector("#pageMenuIcon_0"));
		// Thread.sleep(8000);
		shadowHost4.click();

		WebElement shadowHost5 = shadowRoot3.findElement(By.cssSelector("#pebbleActionDropdown"));
		// Thread.sleep(1000);
		SearchContext shadowRoot4 = shadowHost5.getShadowRoot();
		// Thread.sleep(2000);

		WebElement shadowHost6 = shadowRoot4.findElement(By.cssSelector("#actionItem"));
		// Thread.sleep(1000);

		shadowHost6.click();
		// Thread.sleep(3000);

		// upload File Button Code

		WebElement uploadfileshadowHost1 = driver.findElement(By.cssSelector("#app"));
		// Thread.sleep(1000);
		SearchContext uploadfileshadowRoot1 = uploadfileshadowHost1.getShadowRoot();
		// Thread.sleep(2000);

		WebElement uploadfileshadowHost2 = uploadfileshadowRoot1.findElement(By.cssSelector("#contentViewManager"));
		// Thread.sleep(1000);
		SearchContext uploadfileshadowRoot2 = uploadfileshadowHost2.getShadowRoot();
		// Thread.sleep(2000);
		WebElement uploadfileshadowHost3 = uploadfileshadowRoot2
				.findElement(By.cssSelector("rock-content-view[id^=\"currentApp\"]"));
		// Thread.sleep(1000);
		SearchContext uploadfileshadowRoot3 = uploadfileshadowHost3.getShadowRoot();
		// Thread.sleep(3000);
		WebElement uploadfileshadowHost4 = uploadfileshadowRoot3
				.findElement(By.cssSelector("app-business-function[id^=\"app-business-function-component\"]"));
		// Thread.sleep(1000);
		SearchContext uploadfileshadowRoot4 = uploadfileshadowHost4.getShadowRoot();
		// Thread.sleep(3000);
		WebElement uploadfileshadowHost5 = uploadfileshadowRoot4.findElement(By.cssSelector("#wizardManage"));
		// Thread.sleep(1000);
		SearchContext uploadfileshadowRoot5 = uploadfileshadowHost5.getShadowRoot();
		// Thread.sleep(3000);
		WebElement uploadfileshadowHost6 = uploadfileshadowRoot5
				.findElement(By.cssSelector("rock-entity-upload[id^=\"rock-entity-upload-component\"]"));
		// Thread.sleep(1000);
		// System.out.println("uploadfileshadowHost6"+uploadfileshadowHost6);
		SearchContext uploadfileshadowRoot6 = uploadfileshadowHost6.getShadowRoot();
		// Thread.sleep(8000);

		WebElement uploadfileshadowHost7 = uploadfileshadowRoot6.findElement(By.cssSelector(
				"#content-entity-import > div.base-grid-structure-child-2.button-siblings > div > div > div.base-grid-structure-child-2 > rock-cloud-upload"));
		// Thread.sleep(1000);
		SearchContext uploadfileshadowRoot7 = uploadfileshadowHost7.getShadowRoot();
		// Thread.sleep(8000);

		WebElement uploadfileshadowHost8 = uploadfileshadowRoot7.findElement(By.cssSelector("#fileUpload"));
		// Thread.sleep(1000);
		SearchContext uploadfileshadowRoot8 = uploadfileshadowHost8.getShadowRoot();
		// Thread.sleep(1000);

		WebElement uploadfileshadowHost9 = uploadfileshadowRoot8.findElement(By.cssSelector("#addButton"));
		// Thread.sleep(1000);
		SearchContext uploadfileshadowRoot9 = uploadfileshadowHost9.getShadowRoot();
		// Thread.sleep(1000);

		WebElement uploadfileshadowHost10 = uploadfileshadowRoot9.findElement(By.cssSelector("#buttonTextBox"));
		// Thread.sleep(1000);
		uploadfileshadowHost10.click();
		// Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\ssingh\\Downloads\\uploadbutton.exe");

		// Thread.sleep(10000);

		WebElement uploadfileshadowHost11 = uploadfileshadowRoot5.findElement(
				By.cssSelector("rock-business-function-finish[id^=\"rock-business-function-finish-component\"]"));
		// Thread.sleep(1000);
		SearchContext uploadfileshadowRoot10 = uploadfileshadowHost11.getShadowRoot();
		// Thread.sleep(1000);

		WebElement uploadfileshadowHost12 = uploadfileshadowRoot10
				.findElement(By.cssSelector("pebble-button[buttontext=\"Show task details\"]"));
		// Thread.sleep(1000);
		SearchContext uploadfileshadowRoot11 = uploadfileshadowHost12.getShadowRoot();
		// Thread.sleep(3000);
		WebElement uploadfileshadowHost13 = uploadfileshadowRoot11.findElement(By.cssSelector("#buttonTextBox"));
		// Thread.sleep(1000);
		uploadfileshadowHost13.click();

		// Taskdetail screen code

		WebElement taskscreenshadowHost = driver.findElement(By.cssSelector("#app"));
		SearchContext taskscreenshadowRoot = shadowHost.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost2 = taskscreenshadowRoot.findElement(By.cssSelector("#contentViewManager"));
		SearchContext taskscreenshadowRoot2 = taskscreenshadowHost2.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost3 = taskscreenshadowRoot2
				.findElement(By.cssSelector("rock-content-view[id^=\"currentApp\"]"));
		SearchContext taskscreenshadowRoot3 = taskscreenshadowHost3.getShadowRoot();
		// Thread.sleep(4000);

		WebElement taskscreenshadowHost4 = taskscreenshadowRoot3
				.findElement(By.cssSelector("app-entity-manage[id^=\"app-entity-manage-component\"]"));
		SearchContext taskscreenshadowRoot4 = taskscreenshadowHost4.getShadowRoot();
		// Thread.sleep(8000);

		WebElement taskscreenshadowHost5 = taskscreenshadowRoot4.findElement(By.cssSelector("#entityManageHeader"));
		SearchContext taskscreenshadowRoot5 = taskscreenshadowHost5.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost6 = taskscreenshadowRoot5.findElement(By.cssSelector("#entityActions"));
		SearchContext taskscreenshadowRoot6 = taskscreenshadowHost6.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost7 = taskscreenshadowRoot6.findElement(By.cssSelector("#toolbar"));
		SearchContext taskscreenshadowRoot7 = taskscreenshadowHost7.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost8 = taskscreenshadowRoot7.findElement(By.cssSelector("#refresh"));
		SearchContext taskscreenshadowRoot8 = taskscreenshadowHost8.getShadowRoot();
		// Thread.sleep(8000);

		WebElement taskscreenshadowHost9 = taskscreenshadowRoot8
				.findElement(By.cssSelector("#simpleButton > pebble-icon"));
		// SearchContext taskscreenshadowRoot9= taskscreenshadowHost9.getShadowRoot();
		 Thread.sleep(3000);

		int a = 300;
		for (int i = 1; i <= a; i++) {
			taskscreenshadowHost9.click();
		}
		// code for create link displayed under the task summary tab after file get
		// created

		Thread.sleep(10000);
		WebElement taskscreenshadowHost10 = taskscreenshadowRoot4.findElement(By.cssSelector("#rockDetailTabs"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot10 = taskscreenshadowHost10.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost11 = taskscreenshadowRoot10.findElement(By.cssSelector("#rockTabs"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot11 = taskscreenshadowHost11.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost12 = taskscreenshadowRoot11
				.findElement(By.cssSelector("rock-entity-summary[id^=\"rock-entity-summary-component\"]"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot12 = taskscreenshadowHost12.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost13 = taskscreenshadowRoot12.findElement(By.cssSelector("rock-widget-panel"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot13 = taskscreenshadowHost13.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost14 = taskscreenshadowRoot13
				.findElement(By.cssSelector("#subprocessing-details"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot14 = taskscreenshadowHost14.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost15 = taskscreenshadowRoot14
				.findElement(By.cssSelector("rock-task-stats[id^=\"rock-task-stats-component\"]"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot15 = taskscreenshadowHost15.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost16 = taskscreenshadowRoot15.findElement(By.cssSelector("#processingDetails"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot16 = taskscreenshadowHost16.getShadowRoot();
		// Thread.sleep(1000);
		WebElement taskscreenshadowHost17 = taskscreenshadowRoot16.findElement(By.cssSelector("#create"));
		taskscreenshadowHost17.click();
		// Thread.sleep(40000);
		WebElement taskscreenshadowHost18 = taskscreenshadowRoot11.findElement(By.cssSelector("rock-wizard-manage"));
		// Thread.sleep(2000);
		SearchContext taskscreenshadowRoot18 = taskscreenshadowHost18.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost19 = taskscreenshadowRoot18
				.findElement(By.cssSelector("rock-task-content-panel[id^=\"rock-task-content-panel-component\"]"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot19 = taskscreenshadowHost19.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost20 = taskscreenshadowRoot19
				.findElement(By.cssSelector("#entitySearchDiscoveryGrid"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot20 = taskscreenshadowHost20.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost21 = taskscreenshadowRoot20.findElement(By.cssSelector("#entitySearchGrid"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot21 = taskscreenshadowHost21.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost22 = taskscreenshadowRoot21.findElement(By.cssSelector("#entityGrid"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot22 = taskscreenshadowHost22.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost23 = taskscreenshadowRoot22
				.findElement(By.cssSelector("#pebbleGridContainer > pebble-grid"));
		// Thread.sleep(1000);
		SearchContext taskscreenshadowRoot23 = taskscreenshadowHost23.getShadowRoot();
		// Thread.sleep(1000);

		WebElement taskscreenshadowHost24 = taskscreenshadowRoot23.findElement(By.cssSelector("#grid"));
		// Thread.sleep(1000);
		System.out.println("taskscreenshadowHost24" + taskscreenshadowHost24);

		SearchContext taskscreenshadowRoot24 = taskscreenshadowHost24.getShadowRoot();
		// Thread.sleep(10000);

		List<WebElement> taskscreenshadowHost25 = taskscreenshadowRoot24.findElements(
				By.cssSelector("div.ag-cell.ag-cell-not-inline-editing.ag-cell-auto-height.grid-link.ag-cell-value"));
		// Thread.sleep(10000);
		System.out.println("Length " + taskscreenshadowHost25.size());
		for (WebElement webElement : taskscreenshadowHost25) {
			try {
				System.out.println("taskscreenshadowHost25 webElement" + webElement);
				webElement.click();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
