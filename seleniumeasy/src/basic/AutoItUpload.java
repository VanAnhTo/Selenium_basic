package basic;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AutoItUpload {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxDriver driver = new FirefoxDriver(options);
		
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		
		WebElement uploadBtn = driver.findElement(By.id("uploadfile"));		
		uploadBtn.click();
		Runtime.getRuntime().exec("E:\\Documents\\AutoIT\\UploadDemoFile.exe");	
	}
}
