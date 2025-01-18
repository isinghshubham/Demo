package DemoProject.Demo;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.io.*;
import java.time.Duration;
import java.util.Iterator;

public class Login {

	WebDriver driver;
	String excelFilePath;
    String outputExcelPath;
	@Parameters({"excelFilePath", "outputExcelPath", "headless"})
	@BeforeClass
	public void setUp(String excelFilePath, String outputExcelPath, boolean headless) {
		
		this.excelFilePath = excelFilePath;
        this.outputExcelPath = outputExcelPath;
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		if (headless) {
            option.addArguments("--headless");
            option.addArguments("--disable-gpu");
        }
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);

	}
    @Parameters("url")
	@Test
	public void loginTest(String url) throws IOException, InterruptedException {
		// Read credentials from Excel
		String[][] credentials = readExcelData(excelFilePath);

		// Iterate through each user (if multiple users in the file)
		for (int i = 1; i < credentials.length; i++) {
			String userId = credentials[i][0];
			String password = credentials[i][1];
			String expectedResult = credentials[i][2];
			// String actualResult = credentials[i][3];

			// Launch website
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(url);

			//https://timkends.syndigo.com/home?idp=timkends_auth0_idp
			// Log in using provided credentials
			//Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
			WebElement userInput = driver.findElement(By.id("username"));
			WebElement passwordInput = driver.findElement(By.id("password"));
			Thread.sleep(2000);
			WebElement loginButton = driver.findElement(By.xpath("//button[text()=\"Continue\"]"));

			userInput.sendKeys(userId);
			passwordInput.sendKeys(password);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", loginButton);

			// code checking if user have valid username and password
			boolean val = false;
			try {
				val = driver.findElement(By.id("error-element-password")).isDisplayed();
				System.out.println("val " + val);
			} catch (Exception e) {
				System.out.println("User pass");

			}

			if (val == false) {

//Code to find Pim username
				Thread.sleep(8000);
				SearchContext shadow0 = driver.findElement(By.cssSelector("#app")).getShadowRoot();
				Thread.sleep(2000);
				SearchContext shadow1 = shadow0.findElement(By.cssSelector("app-common")).getShadowRoot();
				Thread.sleep(2000);
				SearchContext shadow2 = shadow1.findElement(By.cssSelector("rock-header-actions")).getShadowRoot();
				Thread.sleep(2000);
				String actualName = shadow2.findElement(By.cssSelector(".profile-name")).getText();

				// Extract the username before '@'
				if (userId.contains("@")) {
					String username = userId.split("@")[0]; // Extract part before '@'

					//System.out.println("username" + username);
					//System.out.println("actualName" + actualName);
					if (actualName.contains(username)) {
						// Store the result in Excel if login is successful
						writeResultToExcel(i, "Login Success");
					} else {
						writeResultToExcel(i, "Login Failed,Username Not Matched");
					}

				}

				Thread.sleep(1000);
				shadow2.findElement(By.cssSelector(
						" div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > pebble-icon:nth-child(1)"))
						.click();
				;

				Thread.sleep(1000);

				SearchContext shadow3 = shadow2.findElement(By.cssSelector("#userProfile")).getShadowRoot();
				Thread.sleep(1000);
				shadow3.findElement(By.cssSelector("span[title='Logout']")).click();
				Thread.sleep(8000);

			} else {

				writeResultToExcel(i, "Login Failed..Please Check Username & Password");
			}

		}
	}

	@AfterClass
	public void tearDown() throws InterruptedException {

		driver.quit();

	}

	// Read Excel Data
	public String[][] readExcelData(String excelPath) throws IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.iterator();
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rowCount][colCount];

		int rowIndex = 0;
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			for (int colIndex = 0; colIndex < colCount; colIndex++) {
				data[rowIndex][colIndex] = row.getCell(colIndex).getStringCellValue();
			}
			rowIndex++;
		}

		workbook.close();
		fis.close();
		return data;
	}

	// Write login result to Excel

	public void writeResultToExcel(int rowIndex, String result) throws IOException {
		// Open the Excel file for reading
		FileInputStream fis = new FileInputStream(outputExcelPath); // Read the existing file
		Workbook workbook = new XSSFWorkbook(fis); // Create a workbook object
		Sheet sheet = workbook.getSheetAt(0); // Get the first sheet

		// Ensure the row exists, create it if not
		Row row = sheet.getRow(rowIndex);
		if (row == null) { // If the row doesn't exist, create it
			row = sheet.createRow(rowIndex);
		}

		// Ensure the cell exists in the required column (3rd column)
		Cell resultCell = row.getCell(3); // Get the cell in the 4th column (index 3)
		if (resultCell == null) { // If the cell doesn't exist, create it
			resultCell = row.createCell(3);
		}

		// Set the result in the cell
		resultCell.setCellValue(result);

		// Now write the updated workbook back to the same file
		FileOutputStream fos = new FileOutputStream(outputExcelPath); // Open for writing back to the same file
		workbook.write(fos); // Write changes to the file
		fos.close(); // Close the output stream
		workbook.close(); // Close the workbook
		fis.close(); // Close the input stream
	}

}
