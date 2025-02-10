package FlipKart.FlipKart;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Delivery_Page {
	
	
	String excelFilePath="C:\\Users\\ssingh\\eclipse-workspace\\FlipKart\\src\\main\\java\\FlipKart\\FlipKart\\UserDetail\\UserDetail.xlsx";
	String sheetName = "Sheet1";
	
private WebDriver driver;
	
	public Delivery_Page() {
		this.driver = WebDriverUtil.getDriver();
	}
	@Test(priority = 3)
	public void DeliveryScreen()
	{
		try {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//WebElement search = driver.findElement(By.xpath("//button[text()=\"Deliver Here\"]"));
			driver.findElement(By.xpath("//button[text()=\"Change\"]")).click();
			//WebElement searchh = driver.findElement(By.cssSelector("div[class=\"_2vQwZw\"]"));
      //  JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0, 700)");
        Thread.sleep(1000);
       // WebElement NewAddress = driver.findElement(By.cssSelector("div[class=\"_2vQwZw\"]"));
        //NewAddress.click();
        
        
        Object[][] data = ReadExcel.readExcelData(excelFilePath, sheetName);
		for (int i = 0; i < data.length; i++) {
            String name = data[i][0].toString();
       //      Phone=data[i][1].toString(); 
           String pincode =data[i][2].toString();
            String addressline2 = data[i][3].toString();
            String addressline1 = data[i][4].toString();
            String city = data[i][5].toString();
            String landmark = data[i][6].toString();
            String phoneNumber = FlipKartLogin.getPhone();
           
           
            driver.findElement(By.cssSelector("input[name=\"name\"]")).sendKeys(name);
            driver.findElement(By.cssSelector("input[name=\"phone\"]")).sendKeys(phoneNumber);
            driver.findElement(By.cssSelector("input[name=\"pincode\"]")).sendKeys(pincode);
            driver.findElement(By.cssSelector("input[name=\"addressLine2\"]")).sendKeys(addressline2);
            driver.findElement(By.cssSelector("textarea[name=\"addressLine1\"]")).sendKeys(addressline1);
            driver.findElement(By.cssSelector("input[name=\"city\"]")).sendKeys(city);
     
        
        driver.findElement(By.cssSelector("input[name=\"landmark\"]")).sendKeys(landmark);
        Thread.sleep(1000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      //  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id=\"HOME\"]")));
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        
        
       // driver.findElement(By.cssSelector("input[name=\"locationTypeTag\"]")).click();
        driver.findElement(By.xpath("//button[text()=\"Cancel\"]")).click();
        driver.findElement(By.xpath("//button[text()=\"Deliver Here\"]")).click();
		}
		}
		catch(Exception e)
		{
			System.out.println("Error occurred: " + e.getMessage());
		}
        }
	
	
	@AfterTest
    public void teardown() {
       
        // WebDriverUtil.quitDriver();  
    }		
}


