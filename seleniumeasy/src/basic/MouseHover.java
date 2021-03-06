package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxDriver driver = new FirefoxDriver(options);
		
		driver.get("http://www.myntra.com");
		
		WebElement women = driver.findElement(By.linkText("Women"));		
		Actions action = new Actions(driver);
		action.moveToElement(women).build().perform();		
		WebElement type = driver.findElement(By.linkText("Kurtis, Tunics & Tops"));		
		type.click();
	}
}
