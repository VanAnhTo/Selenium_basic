package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.name("submit")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}

}
