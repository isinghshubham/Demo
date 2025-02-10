package Timeken.Timeken;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload1 {

    public static void main(String[] args) throws IOException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // Implicit wait

        driver.get("https://timkends.riversand.com/?idp=timkends_Auth0_idp");

        // Login
        driver.findElement(By.id("username")).sendKeys("developerconfigurationspecialist.test1@timken.com");
        driver.findElement(By.id("password")).sendKeys("TimkenDcs@24$");
        driver.findElement(By.xpath("//button[text()='Continue']")).click();

        // Shadow DOM interactions
        WebElement shadowHost = driver.findElement(By.cssSelector("#app"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement shadowHost2 = shadowRoot.findElement(By.cssSelector("app-common"));
        SearchContext shadowRoot2 = shadowHost2.getShadowRoot();

        WebElement shadowHost3 = shadowRoot2.findElement(By.cssSelector("#navMenu"));
        SearchContext shadowRoot3 = shadowHost3.getShadowRoot();

        WebElement shadowHost4 = shadowRoot3.findElement(By.cssSelector("#pageMenuIcon_0"));
        shadowHost4.click();

        WebElement shadowHost5 = shadowRoot3.findElement(By.cssSelector("#pebbleActionDropdown"));
        SearchContext shadowRoot4 = shadowHost5.getShadowRoot();

        WebElement shadowHost6 = shadowRoot4.findElement(By.cssSelector("#actionItem"));
        shadowHost6.click();

        // Upload File Button Code
        WebElement uploadfileshadowHost1 = driver.findElement(By.cssSelector("#app"));
        SearchContext uploadfileshadowRoot1 = uploadfileshadowHost1.getShadowRoot();

        WebElement uploadfileshadowHost2 = uploadfileshadowRoot1.findElement(By.cssSelector("#contentViewManager"));
        SearchContext uploadfileshadowRoot2 = uploadfileshadowHost2.getShadowRoot();

        WebElement uploadfileshadowHost3 = uploadfileshadowRoot2.findElement(By.cssSelector("rock-content-view[id^='currentApp_upload-excel_rs']"));
        SearchContext uploadfileshadowRoot3 = uploadfileshadowHost3.getShadowRoot();

        WebElement uploadfileshadowHost4 = uploadfileshadowRoot3.findElement(By.cssSelector("app-business-function[id^='app-business-function-component']"));
        SearchContext uploadfileshadowRoot4 = uploadfileshadowHost4.getShadowRoot();

        WebElement uploadfileshadowHost5 = uploadfileshadowRoot4.findElement(By.cssSelector("#wizardManage"));
        SearchContext uploadfileshadowRoot5 = uploadfileshadowHost5.getShadowRoot();

        WebElement uploadfileshadowHost6 = uploadfileshadowRoot5.findElement(By.cssSelector("rock-entity-upload[id^='rock-entity-upload-component']"));
        SearchContext uploadfileshadowRoot6 = uploadfileshadowHost6.getShadowRoot();

        WebElement uploadfileshadowHost7 = uploadfileshadowRoot6.findElement(By.cssSelector("#content-entity-import > div.base-grid-structure-child-2.button-siblings > div > div > div.base-grid-structure-child-2 > rock-cloud-upload"));
        SearchContext uploadfileshadowRoot7 = uploadfileshadowHost7.getShadowRoot();

        WebElement uploadfileshadowHost8 = uploadfileshadowRoot7.findElement(By.cssSelector("#fileUpload"));
        SearchContext uploadfileshadowRoot8 = uploadfileshadowHost8.getShadowRoot();

        WebElement uploadfileshadowHost9 = uploadfileshadowRoot8.findElement(By.cssSelector("#addButton"));
        SearchContext uploadfileshadowRoot9 = uploadfileshadowHost9.getShadowRoot();

        WebElement uploadfileshadowHost10 = uploadfileshadowRoot9.findElement(By.cssSelector("#buttonTextBox"));
        uploadfileshadowHost10.click();

        Runtime.getRuntime().exec("C:\\Users\\ssingh\\Downloads\\uploadbutton.exe");

        WebElement uploadfileshadowHost11 = uploadfileshadowRoot5.findElement(By.cssSelector("rock-business-function-finish[id^='rock-business-function-finish-component']"));
        SearchContext uploadfileshadowRoot10 = uploadfileshadowHost11.getShadowRoot();

        WebElement uploadfileshadowHost12 = uploadfileshadowRoot10.findElement(By.cssSelector("pebble-button[buttontext='Show task details']"));
        SearchContext uploadfileshadowRoot11 = uploadfileshadowHost12.getShadowRoot();

        WebElement uploadfileshadowHost13 = uploadfileshadowRoot11.findElement(By.cssSelector("#buttonTextBox"));
        uploadfileshadowHost13.click();

        // Task detail screen code
        WebElement taskscreenshadowHost = driver.findElement(By.cssSelector("#app"));
        SearchContext taskscreenshadowRoot = taskscreenshadowHost.getShadowRoot();

        WebElement taskscreenshadowHost2 = taskscreenshadowRoot.findElement(By.cssSelector("#contentViewManager"));
        SearchContext taskscreenshadowRoot2 = taskscreenshadowHost2.getShadowRoot();

        WebElement taskscreenshadowHost3 = taskscreenshadowRoot2.findElement(By.cssSelector("rock-content-view[id^='currentApp_task-detail']"));
        SearchContext taskscreenshadowRoot3 = taskscreenshadowHost3.getShadowRoot();

        WebElement taskscreenshadowHost4 = taskscreenshadowRoot3.findElement(By.cssSelector("app-entity-manage[id^='app-entity-manage-component']"));
        SearchContext taskscreenshadowRoot4 = taskscreenshadowHost4.getShadowRoot();

        WebElement taskscreenshadowHost5 = taskscreenshadowRoot4.findElement(By.cssSelector("#entityManageHeader"));
        SearchContext taskscreenshadowRoot5 = taskscreenshadowHost5.getShadowRoot();

        WebElement taskscreenshadowHost6 = taskscreenshadowRoot5.findElement(By.cssSelector("#entityActions"));
        SearchContext taskscreenshadowRoot6 = taskscreenshadowHost6.getShadowRoot();

        WebElement taskscreenshadowHost7 = taskscreenshadowRoot6.findElement(By.cssSelector("#toolbar"));
        SearchContext taskscreenshadowRoot7 = taskscreenshadowHost7.getShadowRoot();

        WebElement taskscreenshadowHost8 = taskscreenshadowRoot7.findElement(By.cssSelector("#refresh"));
        SearchContext taskscreenshadowRoot8 = taskscreenshadowHost8.getShadowRoot();

        WebElement taskscreenshadowHost9 = taskscreenshadowRoot8.findElement(By.cssSelector("#simpleButton > pebble-icon"));
        for (int i = 1; i <= 5; i++) {
            taskscreenshadowHost9.click();
        }

        WebElement taskscreenshadowHost10 = taskscreenshadowRoot4.findElement(By.cssSelector("#rockDetailTabs"));
        SearchContext taskscreenshadowRoot10 = taskscreenshadowHost10.getShadowRoot();

        WebElement taskscreenshadowHost11 = taskscreenshadowRoot10.findElement(By.cssSelector("#rockTabs"));
        SearchContext taskscreenshadowRoot11 = taskscreenshadowHost11.getShadowRoot();

        WebElement taskscreenshadowHost12 = taskscreenshadowRoot11.findElement(By.cssSelector("rock-entity-summary[id^='rock-entity-summary-component']"));
        SearchContext taskscreenshadowRoot12 = taskscreenshadowHost12.getShadowRoot();

        WebElement taskscreenshadowHost13 = taskscreenshadowRoot12.findElement(By.cssSelector("rock-widget-panel"));
        SearchContext taskscreenshadowRoot13 = taskscreenshadowHost13.getShadowRoot();

        WebElement taskscreenshadowHost14 = taskscreenshadowRoot13.findElement(By.cssSelector("#subprocessing-details"));
        SearchContext taskscreenshadowRoot14 = taskscreenshadowHost14.getShadowRoot();

        WebElement taskscreenshadowHost15 = taskscreenshadowRoot14.findElement(By.cssSelector("rock-task-stats[id^='rock-task-stats-component']"));
        SearchContext taskscreenshadowRoot15 = taskscreenshadowHost15.getShadowRoot();

        WebElement taskscreenshadowHost16 = taskscreenshadowRoot15.findElement(By.cssSelector("#processingDetails"));
        SearchContext taskscreenshadowRoot16 = taskscreenshadowHost16.getShadowRoot();

        WebElement taskscreenshadowHost17 = taskscreenshadowRoot16.findElement(By.cssSelector("#create"));
        taskscreenshadowHost17.click();

        WebElement taskscreenshadowHost18 = taskscreenshadowRoot11.findElement(By.cssSelector("rock-wizard-manage"));
        SearchContext taskscreenshadowRoot18 = taskscreenshadowHost18.getShadowRoot();

        WebElement taskscreenshadowHost19 = taskscreenshadowRoot18.findElement(By.cssSelector("rock-task-content-panel[id^='rock-task-content-panel-component']"));
        SearchContext taskscreenshadowRoot19 = taskscreenshadowHost19.getShadowRoot();

        WebElement taskscreenshadowHost20 = taskscreenshadowRoot19.findElement(By.cssSelector("#entitySearchDiscoveryGrid"));
        SearchContext taskscreenshadowRoot20 = taskscreenshadowHost20.getShadowRoot();

        WebElement taskscreenshadowHost21 = taskscreenshadowRoot20.findElement(By.cssSelector("#searchInput"));
        taskscreenshadowHost21.sendKeys("Sample Search");

        // You may need to wait or perform further actions based on your application behavior

        // Remember to quit the driver
        driver.quit();
    }
}
