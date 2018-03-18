package basic;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import java.util.List;
public class calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click(); 
		
		while(!driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("May")){
			driver.findElement(By.cssSelector(".datepicker-days .next")).click();
			
		}
		
		
		//List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		int count = driver.findElements(By.cssSelector(".day")).size(); 
		for (int i = 0; i < count; i++){ 
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if (text.equalsIgnoreCase("10")){
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
				
			}
		}
		
		
	}
}
