package Timeken.Timeken;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Authentication {
	static int retry_nav_search_counter = 0;
	static int click = 0;

	@Test(priority=1)
	public void authentication() throws Exception {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		driver.get("https://timkends.riversand.com/?idp=timkends_Auth0_idp");
		driver.findElement(By.id("username")).sendKeys("pimbusinessprocessowner.test1@timken.com");
		driver.findElement(By.id("password")).sendKeys("TimkenPbpo@24$");
		driver.findElement(By.xpath("//button[text()=\"Continue\"]")).click();
	//	Thread.sleep(1000);
		SearchContext nav_shadow_root = get_nav_selector(driver);
		click_on_thing_domain_menu(nav_shadow_root);
		//Thread.sleep(1000);
		click_on_search_thing_domain_submenu(nav_shadow_root);
		//Thread.sleep(3000);

		WebElement searchthingdomainentityselector = driver.findElement(By.cssSelector("#app"));
		//Thread.sleep(1000);
		SearchContext searchthingdomainentityselectorshadowRoot = searchthingdomainentityselector.getShadowRoot();
		//Thread.sleep(1000);

		WebElement searchthingdomainentityselector2 = searchthingdomainentityselectorshadowRoot
				.findElement(By.cssSelector("#contentViewManager"));
		//Thread.sleep(1000);
		SearchContext searchthingdomainentityselectorshadowRoot2 = searchthingdomainentityselector2.getShadowRoot();
		//Thread.sleep(1000);

		
		WebElement searchthingdomainentityselector3 = searchthingdomainentityselectorshadowRoot2
				.findElement(By.cssSelector("rock-content-view[id^=\"currentApp\"]"));
		
		
		//Thread.sleep(1000);
		SearchContext searchthingdomainentityselectorshadowRoot3 = searchthingdomainentityselector3.getShadowRoot();
		//Thread.sleep(1000);

		WebElement searchthingdomainentityselector4 = searchthingdomainentityselectorshadowRoot3
				.findElement(By.cssSelector("app-entity-discovery[id^=\"app-entity-discovery-component\"]"));
		//Thread.sleep(1000);
		SearchContext searchthingdomainentityselectorshadowRoot4 = searchthingdomainentityselector4.getShadowRoot();
		//Thread.sleep(1000);

		WebElement searchthingdomainentityselector5 = searchthingdomainentityselectorshadowRoot4
				.findElement(By.cssSelector("#entitySearchDiscoveryGrid"));
		//Thread.sleep(1000);
		SearchContext searchthingdomainentityselectorshadowRoot5 = searchthingdomainentityselector5.getShadowRoot();
		//Thread.sleep(1000);

		WebElement searchthingdomainentityselector6 = searchthingdomainentityselectorshadowRoot5
				.findElement(By.cssSelector("#entitySearchGrid"));
		//Thread.sleep(1000);
		SearchContext searchthingdomainentityselectorshadowRoot6 = searchthingdomainentityselector6.getShadowRoot();
		//Thread.sleep(2000);

		WebElement searchthingdomainentityselector7 = searchthingdomainentityselectorshadowRoot6
				.findElement(By.cssSelector("#entityGrid"));
		//Thread.sleep(1000);
		SearchContext searchthingdomainentityselectorshadowRoot7 = searchthingdomainentityselector7.getShadowRoot();
		//Thread.sleep(1000);

		WebElement searchthingdomainentityselector8 = searchthingdomainentityselectorshadowRoot7
				.findElement(By.cssSelector("#pebbleGridContainer > pebble-grid"));
		//Thread.sleep(1000);
		SearchContext searchthingdomainentityselectorshadowRoot8 = searchthingdomainentityselector8.getShadowRoot();
		//Thread.sleep(1000);

		WebElement searchthingdomainentityselector9 = searchthingdomainentityselectorshadowRoot8
				.findElement(By.cssSelector("#grid"));
		//Thread.sleep(1000);
		SearchContext searchthingdomainentityselectorshadowRoot9 = searchthingdomainentityselector9.getShadowRoot();
		//Thread.sleep(2000);

		finalclicktoselectentity(searchthingdomainentityselectorshadowRoot9);

		// download code

		WebElement searchthingdomaindownload1 = searchthingdomainentityselectorshadowRoot6
				.findElement(By.cssSelector("#gridActions"));
		//Thread.sleep(1000);
		SearchContext searchthingdomadownloadshadowRoot1 = searchthingdomaindownload1.getShadowRoot();
		//Thread.sleep(1000);
		WebElement searchthingdomaindownload2 = searchthingdomadownloadshadowRoot1
				.findElement(By.cssSelector("#searchResultToolbar"));
		//Thread.sleep(1000);
		SearchContext searchthingdomadownloadshadowRoot2 = searchthingdomaindownload2.getShadowRoot();
		//Thread.sleep(1000);
		WebElement searchthingdomaindownload3 = searchthingdomadownloadshadowRoot2
				.findElement(By.cssSelector("#toolbar_actions"));
		//Thread.sleep(1000);
		SearchContext searchthingdomadownloadshadowRoot3 = searchthingdomaindownload3.getShadowRoot();
		//Thread.sleep(1000);

		WebElement searchthingdomaindownload4 = searchthingdomadownloadshadowRoot3
				.findElement(By.cssSelector("#actions"));
		//Thread.sleep(1000);
		SearchContext searchthingdomadownloadshadowRoot4 = searchthingdomaindownload4.getShadowRoot();
		//Thread.sleep(1000);

		WebElement searchthingdomaindownload5 = searchthingdomadownloadshadowRoot4
				.findElement(By.cssSelector("#simpleButton > pebble-icon.button-icon"));
		//Thread.sleep(1000);
		SearchContext searchthingdomadownloadshadowRoot5 = searchthingdomaindownload5.getShadowRoot();
		//Thread.sleep(1000);

		searchthingdomaindownload5.click();

		// clicking on excel

		WebElement searchthingdomaindownloadexcel1 = searchthingdomadownloadshadowRoot3
				.findElement(By.cssSelector("#pebbleActionDropdown"));
	//	Thread.sleep(1000);
		SearchContext searchthingdomadownloadexcelshadowRoot1 = searchthingdomaindownloadexcel1.getShadowRoot();
		//Thread.sleep(1000);
		WebElement searchthingdomaindownloadexcel2 = searchthingdomadownloadexcelshadowRoot1
				.findElement(By.cssSelector("#actionItem"));
		//Thread.sleep(1000);
		searchthingdomaindownloadexcel2.click();
		// SearchContext searchthingdomadownloadexcelshadowRoot2=
		// searchthingdomaindownloadexcel2.getShadowRoot();
		//Thread.sleep(2000);

		// Downlaod all button

		WebElement downloadallbutton1 = driver.findElement(By.cssSelector("#app"));
		//Thread.sleep(1000);
		SearchContext downloadallbuttonshadowRoot1 = downloadallbutton1.getShadowRoot();
		//Thread.sleep(1000);
		WebElement downloadallbutton2 = downloadallbuttonshadowRoot1.findElement(By.cssSelector("app-common"));
		//Thread.sleep(1000);
		SearchContext downloadallbuttonshadowRoot2 = downloadallbutton2.getShadowRoot();
		//Thread.sleep(1000);
		WebElement downloadallbutton3 = downloadallbuttonshadowRoot2.findElement(By.cssSelector("#contextDialog"));
		//Thread.sleep(1000);
		SearchContext downloadallbuttonshadowRoot3 = downloadallbutton3.getShadowRoot();
		//Thread.sleep(1000);
		WebElement downloadallbutton4 = downloadallbuttonshadowRoot3.findElement(By.cssSelector("#rockWizardManage"));
		//Thread.sleep(1000);
		SearchContext downloadallbuttonshadowRoot4 = downloadallbutton4.getShadowRoot();
		//Thread.sleep(1000);
		WebElement downloadallbutton5 = downloadallbuttonshadowRoot4
				.findElement(By.cssSelector("rock-scope-manage[id^=\"rock-scope-manage-component\"]"));
		//Thread.sleep(1000);
		SearchContext downloadallbuttonshadowRoot5 = downloadallbutton5.getShadowRoot();
	//	Thread.sleep(1000);
		WebElement downloadallbutton6 = downloadallbuttonshadowRoot5.findElement(By.cssSelector("#DownloadAll"));
		//Thread.sleep(1000);
		SearchContext downloadallbuttonshadowRoot6 = downloadallbutton6.getShadowRoot();
		//Thread.sleep(1000);
		WebElement downloadallbutton7 = downloadallbuttonshadowRoot6.findElement(By.cssSelector("#buttonTextBox"));
		//Thread.sleep(1000);
		downloadallbutton7.click();

		// taskdetail
		//Thread.sleep(2000);
		WebElement showtaskdetailsbutton = downloadallbuttonshadowRoot4
				.findElement(By.cssSelector("rock-business-function-finish"));
	//	Thread.sleep(1000);
		SearchContext showtaskdetailsbuttonshadowRoot1 = showtaskdetailsbutton.getShadowRoot();
		//Thread.sleep(1000);
		WebElement showtaskdetailsbutton1 = showtaskdetailsbuttonshadowRoot1
				.findElement(By.cssSelector("pebble-button[buttontext=\"Show task details\"]"));
		//Thread.sleep(1000);
		SearchContext showtaskdetailsbuttonshadowRoot2 = showtaskdetailsbutton1.getShadowRoot();
		//Thread.sleep(1000);
		WebElement showtaskdetailsbutton2 = showtaskdetailsbuttonshadowRoot2
				.findElement(By.cssSelector("#buttonTextBox"));
		//Thread.sleep(1000);
		showtaskdetailsbutton2.click();

	/*	//final downlaod code
		WebElement finaldownload0 = searchthingdomainentityselectorshadowRoot3
				.findElement(By.cssSelector("app-entity-manage[id=\"app-entity-manage-component\"]"));
		SearchContext finaldownlaodshadowRoot0 = finaldownload0.getShadowRoot();
		
		WebElement finaldownload1 = finaldownlaodshadowRoot0
				.findElement(By.cssSelector("#entityManageHeader"));
		SearchContext finaldownlaodshadowRoot1 = finaldownload1.getShadowRoot();
	
		WebElement finaldownload2 = finaldownlaodshadowRoot1
				.findElement(By.cssSelector("#entityActions"));
		SearchContext finaldownlaodshadowRoot2 = finaldownload2.getShadowRoot();
		
		WebElement finaldownload3 = finaldownlaodshadowRoot2
				.findElement(By.cssSelector("#toolbar"));
		SearchContext finaldownlaodshadowRoot3 = finaldownload3.getShadowRoot();
		
		WebElement finaldownload4 = finaldownlaodshadowRoot3
				.findElement(By.cssSelector("#toolbar"));
		SearchContext finaldownlaodshadowRoot4 = finaldownload4.getShadowRoot();
		WebElement finaldownload5 = finaldownlaodshadowRoot4
				.findElement(By.cssSelector("#downloadtaskfile"));
		SearchContext finaldownlaodshadowRoot5 = finaldownload5.getShadowRoot();
		
		WebElement finaldownload6 = finaldownlaodshadowRoot5
				.findElement(By.cssSelector("#simpleButton > pebble-icon"));
		SearchContext finaldownlaodshadowRoot6 = finaldownload6.getShadowRoot();
		finaldownload6.click();
		*/
		
		
		// Refresh button

		/*
		 * WebElement DigitalAssetNavigation =nav_shadow_root.findElement(By.
		 * cssSelector("#pageMenuIcon_4 > a.page-title > span")); Thread.sleep(1000);
		 * System.out.println("shadowHost8"+ DigitalAssetNavigation);
		 * DigitalAssetNavigation.click(); SearchContext
		 * app_common_shadow_root=get_common_app_selector(driver); Thread.sleep(3000);
		 */
		// logoutProfileIcon(app_common_shadow_root);

		// logout_button(app_common_shadow_root);

//		SearchContext shadowRoot5 =  shadowHost6.getShadowRoot();
//		Thread.sleep(1000);
//		
//		List<WebElement> shadowHost7=  shadowRoot5.findElements(By.cssSelector("div"));
//		for (WebElement webElement : shadowHost7) {
//			System.out.println(webElement);
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			Object aa=executor.executeScript("var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;", webElement);
//			System.out.println(aa.toString());
//
//		}
		//Thread.sleep(1000);

//		System.out.println("shadowHost5 " + shadowHost7);
//		
//		SearchContext shadowRoot5= shadowHost5.getShadowRoot();
//		Thread.sleep(1000);
//	    shadowRoot5.findElement(By.cssSelector("#actionItem")).click();
//		SearchContext shadowRoot3= shadowHost3.getShadowRoot();
		//Thread.sleep(3000);

	}

	public static void finalclicktoselectentity(SearchContext searchthingdomainentityselectorshadowRoot9)
			throws InterruptedException {
		try {
			WebElement searchthingdomainentityselector10 = searchthingdomainentityselectorshadowRoot9
					.findElement(By.cssSelector("#ag-450-input"));
			//Thread.sleep(2000);

			searchthingdomainentityselector10.click();
		} catch (Exception e) {
			System.out.println("Error :" + e.getMessage());

		}

	}

	public static void logout_button(SearchContext app_common_shadow_root) throws InterruptedException {
		SearchContext logoutprofile = logOutProfilepath(app_common_shadow_root);
		WebElement Logout = logoutprofile.findElement(By.cssSelector("#userProfile"));
	//	Thread.sleep(1000);

		SearchContext shadowRoot10 = Logout.getShadowRoot();
		WebElement Logout2 = shadowRoot10.findElement(By.cssSelector("#rsLogOut > span.option-value.text-ellipsis"));
		//Thread.sleep(1000);
		Logout2.click();
	}

	public static SearchContext logoutProfileIcon(SearchContext app_common_shadow_root) throws InterruptedException {
		SearchContext shadowRoot8 = logOutProfilepath(app_common_shadow_root);
		WebElement shadowHost11 = shadowRoot8.findElement(By.cssSelector(
				"div > div:nth-child(1) > div.header-action-wrapper > div.header-icon-wrapper > pebble-icon"));
		SearchContext profileIcon = shadowHost11.getShadowRoot();
		//Thread.sleep(1000);
		shadowHost11.click();
		return profileIcon;
	}

	public static SearchContext logOutProfilepath(SearchContext app_common_shadow_root) throws InterruptedException {
		WebElement shadowHost10 = app_common_shadow_root.findElement(By.cssSelector(
				"app-header > app-toolbar > div > div.right-content > div.right-content-bar > rock-header-actions"));
		//Thread.sleep(1000);
		SearchContext shadowRoot8 = shadowHost10.getShadowRoot();
		//Thread.sleep(1000);
		return shadowRoot8;
	}

	public static void click_on_search_thing_domain_submenu(SearchContext nav_shadow_root) throws InterruptedException {
		WebElement shadowHost5 = nav_shadow_root.findElement(By.cssSelector("#pebbleActionDropdown"));
		//Thread.sleep(1000);
		SearchContext shadowRoot4 = shadowHost5.getShadowRoot();

		WebElement shadowHost6 = shadowRoot4.findElement(By.cssSelector("#actionsPopover"));
		//Thread.sleep(1000);
		WebElement shadowHost7 = shadowHost6.findElement(By.cssSelector("#actionItem"));
		System.out.println("shadowHost6 " + shadowHost7);
		shadowHost7.click();
	}

	public static void click_on_thing_domain_menu(SearchContext nav_shadow_root) throws InterruptedException {
		//Thread.sleep(1000);
		WebElement shadowHost4 = nav_shadow_root
				.findElement(By.cssSelector("#pageMenuIcon_3 > a.menu-icon.page-title-icon > div"));
		shadowHost4.click();
	}

	public static SearchContext get_nav_selector(WebDriver driver) throws Exception {
		try {
			retry_nav_search_counter = retry_nav_search_counter + 1;
			SearchContext shadowRoot2 = get_common_app_selector(driver);
			System.out.println("shadowHost2" + shadowRoot2);
			//Thread.sleep(2000);
			WebElement shadowHost3 = shadowRoot2.findElement(By.cssSelector("#navMenu"));
			//Thread.sleep(2000);
			SearchContext shadowRoot3 = shadowHost3.getShadowRoot();
			return shadowRoot3;
		} catch (Exception e) {
			//Thread.sleep(2000);
			System.out.println("Error :" + e.getMessage());
			System.out.println("Retrying get_nav_selector method again");
			if (retry_nav_search_counter <= 3) {
				return get_nav_selector(driver);
			} else {
				throw new Exception(e);
			}

		}

	}

	public static SearchContext get_common_app_selector(WebDriver driver) throws InterruptedException {
		SearchContext shadowRoot = get_app_selector(driver);
		WebElement shadowHost2 = shadowRoot.findElement(By.cssSelector("app-common"));
		//Thread.sleep(2000);
		SearchContext shadowRoot2 = shadowHost2.getShadowRoot();
		return shadowRoot2;
	}

	public static SearchContext get_app_selector(WebDriver driver) throws InterruptedException {
		WebElement shadowHost = driver.findElement(By.cssSelector("#app"));
		//Thread.sleep(1000);
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		//Thread.sleep(1000);
		return shadowRoot;
	}

}
