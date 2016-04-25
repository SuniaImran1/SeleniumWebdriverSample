package pageobjects;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage extends baseClass {

	@FindBy(how = How.XPATH, using = ".//*[@id='Email']")
	public static WebElement Enter_EmailID;

	@FindBy(how = How.XPATH, using = "//*[@id='next']")
	public static WebElement ClickNext_Button;

	@FindBy(how = How.XPATH, using = "//*[@id='Passwd']")
	public static WebElement Enter_Password;

	@FindBy(how = How.XPATH, using = ".//*[@id='signIn']")
	public static WebElement clicksignIn_Button;

	public void NavigateToUrl(String Url) throws InterruptedException {
		baseClass.getdriver();
		driver.get(Url);

		Thread.sleep(1000);

	}

	public void Enter_EmailPassword(String email, String pwd) throws InterruptedException {
		Enter_EmailID.sendKeys(email);
		Thread.sleep(1000);
		ClickNext_Button.click();
		Thread.sleep(1000);
		Enter_Password.sendKeys(pwd);
		clicksignIn_Button.click();
		CaptureScreen();

	}
public void CaptureScreen(){

	try {
		
		File file=new File("/home/SImran/Documents/workspace-wspip/SeleniumWebdriver/src/test/java/error.jpg");
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source, file);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
}
}