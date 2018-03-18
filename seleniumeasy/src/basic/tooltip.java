package basic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class tooltip {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxDriver driver = new FirefoxDriver(options);
		/*
		driver.get("http://kenh14.vn/");
		
		WebElement translatetooltip = driver.findElementByCssSelector("div.khw-top-header h1 a");
		String tooltipText = translatetooltip.getAttribute("title");
		
		System.out.println(tooltipText);
		*/
		driver.get("https://jqueryui.com/tooltip/");
		WebElement element2 = driver.findElementById("age");
		// Using Action class to mouse hover on Text-box &amp; then identifying the tool-tip element
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		WebElement toolTipElement = driver.findElementByCssSelector(".ui-tooltip");
		// Get the tool tip text
		String toolTipText2 = toolTipElement.getText();
		System.out.println("Tool tip text: " + toolTipText2);		
		
	
	
	}
}
