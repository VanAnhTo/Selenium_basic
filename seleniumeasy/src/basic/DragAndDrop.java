package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Program\\Firefox\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); 
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("http://www.testingbar.com/drag-and-drop/");

		WebElement sourceLocator = driver.findElement(By.id("draggable"));
		WebElement destinationLocator = driver.findElement(By.id("droppable"));
		
		Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(sourceLocator)
            .moveToElement(destinationLocator)
            .release(destinationLocator)
            .build();
        dragAndDrop.perform();     

	}

}
