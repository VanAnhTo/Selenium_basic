package basic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_2 {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver;
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.BINARY,new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		driver = new RemoteWebDriver(new URL("http://192.168.0.105:5566/wd/hub"), capabilities);
		driver.get("http://kenh14.vn");
		System.out.println(driver.getTitle());
	}
}
