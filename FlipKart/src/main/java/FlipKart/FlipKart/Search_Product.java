package FlipKart.FlipKart;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search_Product {
	private WebDriver driver;
	
	
	public Search_Product() {
		this.driver = WebDriverUtil.getDriver();
	}
	@Test(priority = 2)
	public void searchAndAddProduct()
	{
		
    try {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.cssSelector("input[title=\"Search for Products, Brands and More\"]")).sendKeys("Iphone",Keys.CONTROL,Keys.ENTER);
		
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement product=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-id=\"MOBGTAGPDTKHHHZU\"] .KzDlHZ")));
		product.click();*/
		
		List<WebElement> s=driver.findElements(By.cssSelector("div[class=\"KzDlHZ\"]"));
		
		for(WebElement ls:s)
		{
			String products=ls.getText();
			if(products.equalsIgnoreCase("Apple iPhone 13 (Midnight, 128 GB)"))
			{
				ls.click();
				break;
			}
		}
	
		String firstWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(firstWindowHandle)) {
                // Switch to the second window
                driver.switchTo().window(handle);
                break;
            }
        }
        Thread.sleep(1000);
   // driver.findElement(By.cssSelector("input[class=\"zDPmFV\"]")).sendKeys("mobile");
  //  JavascriptExecutor js = (JavascriptExecutor) driver; 
    //WebElement element = driver.findElement(By.cssSelector("a[class=\"QqFHMw WPJGw9\"]"));
    //WebElement element = driver.findElement(By.xpath("//button[text()=\"Buy Now\"]"));
        WebElement element = driver.findElement(By.cssSelector("div[class=\"S1lW7R wK1mEC col\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 4500)");
        
        WebElement Buy = driver.findElement(By.xpath("//button[text()=\"Buy Now\"]"));
        Buy.click();
        //checkout page
        
       // WebElement contact=driver.findElement(By.cssSelector("input[class*=\"r4vIwl\"]"));
        //contact.sendKeys("9082061251");
       // WebElement continuee=driver.findElement(By.xpath("//span[text()=\"CONTINUE\"]"));
        //continuee.click();
     //   js.executeScript("arguments[0].scrollIntoView(true);", element);
    Thread.sleep(1000);
    //element.getLocation();
    
    }    catch(Exception e){
        System.out.println("Error occurred: " + e.getMessage());
    }
    }
	@AfterTest
    public void teardown() {
       
        // WebDriverUtil.quitDriver();  // Uncomment if you want to quit the driver after tests
    }	

}
