package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		 
		Boolean isSelected = driver.findElement(By.id("isAgeSelected")).isSelected();
		if(isSelected == true){
			driver.findElement(By.id("isAgeSelected")).click();
		}
		System.out.println(driver.findElement(By.id("isAgeSelected")).isSelected());
		 
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[4]/label/input")).click();
		}
}
