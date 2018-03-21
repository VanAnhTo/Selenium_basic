package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Download_FireFoxFile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		
		// Create FireFox Profile object
		FirefoxProfile profile = new FirefoxProfile();

		// Set Location to store files after downloading.
		profile.setPreference("browser.download.dir", "E:\\Draft\\");

		// profile.setPreference("browser.download.folderList", 2);
		// profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
		// "application/zip");

		profile.setPreference("browser.download.folderList", 2);

		// Set Preference to not show file download confirmation dialogue using
		// MIME types Of different file extension types.
		//profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
			//	"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                "application/octet-stream,text/csv");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("pdfjs.disabled", true);

		// Pass FProfile parameter In webdriver to use preferences to download
		// file.
		FirefoxDriver driver = new FirefoxDriver(profile);

		// Open APP to download application
		driver.get("http://toolsqa.com/automation-practice-form/");

		// Click to download
		driver.findElement(By.linkText("Test File to Download")).click();

		// Download zip file is OK
		/*
		 * FirefoxDriver driver = new FirefoxDriver(profile);
		 * driver.get("http://docs.seleniumhq.org/download/");
		 * driver.findElement(By.xpath("//tr[1]/td[4]/a[text()='Download']")).
		 * click();
		 */

		// Halting the execution for 5 secs to donwload the file completely
		Thread.sleep(5000);

		driver.close();

	}

}