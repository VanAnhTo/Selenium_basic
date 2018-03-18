package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DropdownDynamic {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxDriver driver = new FirefoxDriver(options);

		driver.get("https://www.traveloka.com/vi-vn/");
		driver.findElement(By.xpath(".//*[@id='multiSearchContainerTabs']/li[1]/a")).click();
		driver.findElement(By.xpath(
				".//*[@id='tvDesktop-flightSearchForm']/div/div/div/div/div/div[1]/div/div/div/ul/li[1]/div/div[1]/div/div[1]/label/div/div/div[2]/div[2]/input")).clear();
		driver.findElement(By.xpath(".//*[@id='tvDesktop-flightSearchForm']/div/div/div/div/div/div[1]/div/div/div/ul/li[1]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[4]/td[1]/a")).click();
		
		
	}
}
