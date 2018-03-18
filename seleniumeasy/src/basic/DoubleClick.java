package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxDriver driver = new FirefoxDriver(options);
		
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		 
		 WebElement btn = driver.findElement(By.id("dblClkBtn"));
		 /*
		 * Thực hiện double click với class Action
		 * 
		 Actions action = new Actions(driver);
		 action.doubleClick(btn).build().perform();
		 */
		 
		 // Thực hiện double-click với Javascript Executor
		 
		 ((JavascriptExecutor) driver).executeScript("var evt = document.createEvent('MouseEvents');"+ 
		 "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"+ 
		 "arguments[0].dispatchEvent(evt);", btn);
		 
		 Thread.sleep(3000);
		 driver.quit();

	}

}
