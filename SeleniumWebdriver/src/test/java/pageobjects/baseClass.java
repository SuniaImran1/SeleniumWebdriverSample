package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// getting the driver from the getdriver method ,if the driver is null the browser will open another browserl
public class baseClass {
	static WebDriver driver;

	public baseClass() {
		getdriver();
	}

	public static WebDriver getdriver() {

		if (driver != null) {
			return driver;
		} else
			driver = new FirefoxDriver();
		return driver;

	}
}