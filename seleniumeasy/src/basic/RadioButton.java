package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxDriver driver = new FirefoxDriver(options);

		driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		System.out.println(driver.findElement(By.xpath("//input[@value = 'Female']")).isEnabled());
		driver.findElement(By.xpath("//input[@value = 'Female']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value = 'Female']")).isSelected());
	}
}
