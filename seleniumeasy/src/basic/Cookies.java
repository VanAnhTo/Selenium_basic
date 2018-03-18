package basic;

import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Cookies {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxDriver driver = new FirefoxDriver(options);

		driver.get("http://flipkart.com/");

		// we should pass name and value for cookie as parameters
		// In this example we are passing, name=mycookie and value=123456789123
		
		Cookie name = new Cookie("mycookie", "123456789123");
		//Add cookie 
		driver.manage().addCookie(name);

		// After adding the cookie we will check that by displaying all the cookies.
		Set<Cookie> cookiesList = driver.manage().getCookies();
		for (Cookie getcookies : cookiesList) {
			System.out.println(getcookies);
		}		
		/*
		
		//To delete cookie with cookieName = "__utmb"
		driver.manage().deleteCookieNamed("__utmb");
		
		//To delete all cookies
		driver.manage().deleteAllCookies();
		*/		
	}
}
