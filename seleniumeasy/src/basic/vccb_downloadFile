package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExportExcelFile {
	WebDriver browser;

	@BeforeTest
	public void beforeTest() {

	}

	@Test
	public void ExportFile() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\AnhTo\\Setup\\Wed_driver\\geckodriver.exe");

		FirefoxProfile profile = new FirefoxProfile();

		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.dir", "D:\\AnhTo\\Draft\\DownloadFile");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"text/csv,application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

		FirefoxDriver browser = new FirefoxDriver(profile);

		browser.get("http://CoGaiThangMuoiHai/6065708?view_id=-2");

		WebElement username = browser.findElementById("user");
		username.sendKeys("HaNoi");

		WebElement pas = browser.findElementById("password");
		pas.sendKeys("**********");

		WebElement btnLogin = browser.findElementByCssSelector(".login_button");
		btnLogin.click();

		Thread.sleep(2000);

		WebElement btnMenu = browser.findElementByCssSelector(
				"form#browseTrackerForm .bd ul.first-of-type li.yuimenubaritem.first-of-type");
		btnMenu.click();

		WebElement btnGoToExportMenu = browser.findElementById("ui-id-5");
		btnGoToExportMenu.click();

		Thread.sleep(2000);

		browser.switchTo().frame("inlinedPopupIframe");

		Thread.sleep(2000);

		WebElement btnExportToExcelTab = browser.findElementById("excelExportTabPane-tab");
		btnExportToExcelTab.click();

		Thread.sleep(1000);

		WebElement radioRoundTripSelected = browser.findElementById("roundtripExcelExport");
		radioRoundTripSelected.click();

		Thread.sleep(1000);

		WebElement btbExport = browser.findElementByCssSelector("div#excelExportTabPane input:nth-child(1).button");
		btbExport.click();

		Thread.sleep(5000);
	}

	@AfterTest
	public void afterTest() {
		browser.quit();
	}

}
