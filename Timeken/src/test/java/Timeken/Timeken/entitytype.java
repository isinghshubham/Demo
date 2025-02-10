package Timeken.Timeken;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class entitytype {

	
	public static void main(String args[])throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(option);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().window().maximize();
		driver.get("https://timkends.riversand.com/?idp=timkends_Auth0_idp");
		driver.findElement(By.id("username")).sendKeys("pimbusinessprocessowner.test1@timken.com");
		driver.findElement(By.id("password")).sendKeys("TimkenPbpo@24$");
		driver.findElement(By.xpath("//button[text()=\"Continue\"]")).click();
		Thread.sleep(1000);
		String parentWindowHandle = driver.getWindowHandle();
		System.out.print("parentWindowHandle" + parentWindowHandle);
		// code to click on search thing domain and navigate to the search thing domain
		// screen
		//Thread.sleep(3000);
		WebElement shadowHost = driver.findElement(By.cssSelector("#app"));
		//Thread.sleep(1000);
		SearchContext shadowRoot = shadowHost.getShadowRoot();
	//	Thread.sleep(3000);
		WebElement shadowHost2 = shadowRoot.findElement(By.cssSelector("app-common"));
		//Thread.sleep(2000);
		SearchContext shadowRoot2 = shadowHost2.getShadowRoot();
		WebElement shadowHost3 = shadowRoot2.findElement(By.cssSelector("#navMenu"));
	//	Thread.sleep(2000);
		SearchContext shadowRoot3 = shadowHost3.getShadowRoot();
		WebElement shadowHost4 = shadowRoot3
				.findElement(By.cssSelector("#pageMenuIcon_3 > a.menu-icon.page-title-icon > div"));
		shadowHost4.click();
		WebElement shadowHost5 = shadowRoot3.findElement(By.cssSelector("#pebbleActionDropdown"));
		//Thread.sleep(1000);
		SearchContext shadowRoot4 = shadowHost5.getShadowRoot();

		WebElement shadowHost6 = shadowRoot4.findElement(By.cssSelector("#actionsPopover"));
		//Thread.sleep(1000);
		WebElement shadowHost7 = shadowHost6.findElement(By.cssSelector("#actionItem"));
		shadowHost7.click();

		// Code to select entity type
		//Thread.sleep(8000);
		SearchContext shadow0 = driver.findElement(By.cssSelector("#app")).getShadowRoot();
		//Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#contentViewManager")).getShadowRoot();
		//Thread.sleep(3000);
		SearchContext shadow2 = shadow1
				.findElement(By.cssSelector("rock-content-view[id^=\"currentApp\"]")).getShadowRoot();
		//Thread.sleep(3000);
		SearchContext shadow3 = shadow2
				.findElement(By.cssSelector("app-entity-discovery[id^=\"app-entity-discovery-component\"]"))
				.getShadowRoot();
		//Thread.sleep(1000);
		SearchContext shadow4 = shadow3.findElement(By.cssSelector("#entitySearchDiscoveryGrid")).getShadowRoot();
		//Thread.sleep(1000);
		WebElement Clickingentitytypefilter = shadow4.findElement(By.cssSelector("span"));
		//Thread.sleep(1000);
		Clickingentitytypefilter.click();
		//Thread.sleep(3000);
		SearchContext shadow5 = shadow4.findElement(By.cssSelector("#entityTypeModelLov")).getShadowRoot();
		//Thread.sleep(1000);
		SearchContext shadow6 = shadow5.findElement(By.cssSelector("#typeMpdelLov")).getShadowRoot();
		//Thread.sleep(1000);
		SearchContext shadow7 = shadow6.findElement(By.cssSelector("pebble-grid[customclassname='ag-lov-theme']"))
				.getShadowRoot();
		//Thread.sleep(1000);
		SearchContext shadow8 = shadow7.findElement(By.cssSelector("#grid")).getShadowRoot();
		Thread.sleep(8000);

List<WebElement> taskscreenshadowHost25 = shadow8.findElements(By.cssSelector("pebble-lov-item"));
		
		// Thread.sleep(10000);
//		System.out.println("Length " + taskscreenshadowHost25.size());
		for (WebElement webElement : taskscreenshadowHost25) {
			try {
				System.out.println("taskscreenshadowHost25 webElement" + webElement);
			
				SearchContext entitytypecontext = webElement.getShadowRoot();
				WebElement element = entitytypecontext.findElement(By.cssSelector("div"));
				
					// TODO: handle exception
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				Object aa=executor.executeScript("var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;", element);
				System.out.println("Properties : "+ aa.toString());
               
				Thread.sleep(5000);
				WebElement element1 = element.findElement(By.cssSelector("div"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				Object aa1=executor1.executeScript("var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;", element1);
				System.out.println("Properties : "+ aa1.toString());
				
			
				String title = element1.getAttribute("title");
//				div > span.has-only-option'
			System.out.println("title : " + title);
				

				// the below if else condition thing to know if you want to clicks sellable and
				// engineering product
				// both remove "sellable product" condition from if condition
			
				
			if (title.equals("Engineered Product")) {
				try {
					new Actions(driver)
							.moveToElement(element1)
							.perform();
					Thread.sleep(1000);
					element1.findElement(By.cssSelector("div > span.only-badge")).click();
				}catch (Exception exp){
					element1.findElement(By.cssSelector("div > span.has-only-option")).click();
					Thread.sleep(3000);

				//SearchContext shadowsubmitbutton = shadow6.findElement(By.cssSelector("#confirmButton")).getShadowRoot();
				//Thread.sleep(8000);
				//shadowsubmitbutton.findElement(By.cssSelector("#buttonTextBox")).click();

				}
				}
			}

			catch (Exception e) {
				System.out.println("Error " + e.getMessage() + e.fillInStackTrace().toString());
			}

		}
		//SearchContext shadowsubmitbutton = shadow6.findElement(By.cssSelector("#confirmButton")).getShadowRoot();
		//Thread.sleep(8000);
		//shadowsubmitbutton.findElement(By.cssSelector("#buttonTextBox")).click();
		
		//Thread.sleep(4000);

		// search box code

	SearchContext shadowsearch1 = shadow4.findElement(By.cssSelector("#searchBar")).getShadowRoot();
//		//Thread.sleep(3000);
	shadowsearch1.findElement(By.cssSelector("#input")).sendKeys("EPLM13001-BSSB" + Keys.ENTER);
//
//		// select entity code
//
//		//Thread.sleep(3000);
//
		WebElement searchthingdomainentityselector6 = shadow4.findElement(By.cssSelector("#entitySearchGrid"));
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
		
		
		WebElement searchthingdomainentityselector10 = searchthingdomainentityselectorshadowRoot9
				.findElement(By.cssSelector(
						"div[title=\"EPLM13001-BSSB\"]"));
		Thread.sleep(7000);
		searchthingdomainentityselector10.click();
		// SearchContext searchthingdomainentityselectorshadowRoot11=
		// searchthingdomainentityselector10.getShadowRoot();

////Code for attribute tab

		SearchContext shadowgrp = shadow1
				.findElement(By.cssSelector("rock-content-view[id^=\"currentApp\"]")).getShadowRoot();
		//Thread.sleep(3000);
		SearchContext shadowgrp1 = shadowgrp
				.findElement(By.cssSelector("app-entity-manage[id^=\"app-entity-manage-component\"]")).getShadowRoot();
		//Thread.sleep(1000);
		SearchContext shadowgrp2 = shadowgrp1.findElement(By.cssSelector("#rockDetailTabs")).getShadowRoot();
		//Thread.sleep(1000);
		SearchContext shadowgrp3 = shadowgrp2.findElement(By.cssSelector("#rockTabs")).getShadowRoot();
		//Thread.sleep(1000);
		SearchContext shadowgrp4 = shadowgrp3.findElement(By.cssSelector("#tab-attributes")).getShadowRoot();
		//Thread.sleep(3000);

		
		 WebElement shadowgrp5 =
		 shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon"));
		 // Thread.sleep(1000);
		 
		 shadowgrp5.click();
		  
		 SearchContext shadowgrp6= shadowgrp5.getShadowRoot(); Thread.sleep(2000);
		 

		shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon")).click();
		//Thread.sleep(3000);

		// code for selecting attribute group

		/* sellable product code
		//Thread.sleep(3000);
		shadowgrp3.findElement(By.cssSelector("#attributes-Application\\ Related")).click();
		//Thread.sleep(1000);
		//shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon")).click();
		//Thread.sleep(3000);
		shadowgrp3.findElement(By.cssSelector("#attributes-Basic\\ Product\\ Information")).click();
		//Thread.sleep(1000);
		shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon")).click();
		//Thread.sleep(3000);
		shadowgrp3.findElement(By.cssSelector("#attributes-Bearing\\ Dimensions")).click();
		//Thread.sleep(1000);*/
		shadowgrp3.findElement(By.cssSelector("#attributes-Basic\\ Product\\ Information")).click();
		shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon")).click();
		shadowgrp3.findElement(By.cssSelector("#attributes-Bearing\\ Dimensions")).click();//#attributes-Bearing\\ Dimensions
		shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon")).click();
		shadowgrp3.findElement(By.cssSelector("#attributes-Classification")).click();
		shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon")).click();
		shadowgrp3.findElement(By.cssSelector("#attributes-Features")).click();
		shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon")).click();
		shadowgrp3.findElement(By.cssSelector("#attributes-Mounting")).click();
		shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon")).click();
		shadowgrp3.findElement(By.cssSelector("#attributes-Product\\ Classification")).click();
		
		
//		shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon")).click();
//		shadowgrp3.findElement(By.cssSelector("#attributes-System\\ Attributes")).click();
//		shadowgrp4.findElement(By.cssSelector("#dropdown-wrapper > pebble-icon")).click();
//		shadowgrp3.findElement(By.cssSelector("#attributes-Use\\ Case")).click();
//		
		// code to fetch all the attributes present in the attribute group
		
		SearchContext shadowforattribute = shadowgrp3.findElement(By.cssSelector("rock-attribute-split-screen[id^=\"rock-attribute-split-screen-component\"]")).getShadowRoot();
		//Thread.sleep(1000);
		SearchContext shadowforattribute1 = shadowforattribute.findElement(By.cssSelector("#undefined-attribute-container > rock-attribute-manage")).getShadowRoot();
		SearchContext shadowforattribute2 = shadowforattribute1.findElement(By.cssSelector("#rock-attribute-list-container > rock-attribute-list")).getShadowRoot();

		for(WebElement shadowgroup:shadowforattribute2)
		{
			SearchContext shadowgroup1=shadowgroup.getShadowRoot();
			shadowgroup1.findElement(By.cssSelector("rock-attribute")).getShadowRoot();
			
			
		}
		System.out.print("shadowgrp1"+shadowgrp1);
		
		
//		Thread.sleep(1000);
//		SearchContext shadowforattribute3 = shadowforattribute2.findElement(By.cssSelector("rock-attribute")).getShadowRoot();
//		Thread.sleep(1000);
//		SearchContext shadowforattribute4 = shadowforattribute3.findElement(By.cssSelector("rock-path-selector")).getShadowRoot();
//		SearchContext shadowforattribute5 = shadowforattribute4.findElement(By.cssSelector("pebble-collection-container")).getShadowRoot();
//		WebElement elemets = shadowforattribute5.findElement(By.cssSelector("#collection_container_wrapper > div.attribute-view-wrapper > span"));
//		
//		System.out.print("shadowforattribute6"+elemets);
//		System.out.println(elemets.getAttribute(parentWindowHandle));
		
	
		

//		// logout
//
	}
}