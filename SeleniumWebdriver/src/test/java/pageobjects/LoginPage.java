package pageobjects;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends baseClass {

	@FindBy(how = How.XPATH, using = "//*[@id='Email']")
	public static WebElement Enter_EmailID;

	@FindBy(how = How.XPATH, using = "//*[@id='next']")
	public static WebElement ClickNext_Button;

	@FindBy(how = How.XPATH, using = "//*[@id='Passwd']")
	public static WebElement Enter_Password;

	@FindBy(how = How.XPATH, using = ".//*[@id='signIn']")
	public static WebElement clicksignIn_Button;
	/*
	 * @FindBy(how = How.XPATH, using =
	 * "//a[@href='https://mail.google.com/mail/u/0/#inbox']") public static
	 * WebElement Click_Inbox;
	 */
	@FindBy(how = How.XPATH, using = "//a[contains(@title,'Inbox (')]")
	public static WebElement Click_Inbox;
	@FindBy(how = How.XPATH, using = "//*[@ class='gb_2a gbii']")
	public static WebElement Signout_link;
	@FindBy(how = How.XPATH, using = "//*[@id='gb_71'][contains(.,'Sign out')]")
	public static WebElement signout_button;

	@FindBy(how = How.XPATH, using = ".//*[@href='https://mail.google.com/mail/u/0/#starred']")
	public static WebElement clickOn_StarredEmails;
	// Two elements were found with the same xpath value. We captured the
	// absolute xpath by going into the parent path
	// we can not capture id's and classes because they change each time
	@FindBy(how = How.XPATH, using = ".//div[@role='main']//tr[1]/td[3]/span[@title='Not starred']")
	public static WebElement clickon_Star;
	@FindBy(how = How.XPATH, using = "//.//tr[1][contains(.,'No starred messages. Stars let you give messages a special status to make them easier to find. To star a message, click on the star outline beside any message or conversation')]")
	public static WebElement VerifyNoStarredEmails;
	
	
	
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
		// CaptureScreen();

	}

	public void ClickOnInbox() throws InterruptedException {
		Thread.sleep(2000);

		Click_Inbox.click();
	}

	public void SignOut() throws InterruptedException {
		Thread.sleep(2000);
		Signout_link.click();
		signout_button.click();
	}

	public void TotalNumberOfEmails() throws InterruptedException {
		Thread.sleep(2000);
		ClickOnInbox();
		Thread.sleep(2000);
		System.out.println(Click_Inbox.getText());

	}

	public void clickOnstarredemails() {
		
		clickOn_StarredEmails.click();
	}
	public void NoStarredEmails() throws InterruptedException{
		Thread.sleep(2000);
		clickOn_StarredEmails.click();
		Thread.sleep(2000);
		 Assert.assertTrue(driver.getPageSource().contains("VerifyNoStarredEmails"));
	}

	public void ClickOnStarInEmais() throws InterruptedException {
		Thread.sleep(2000);
		Click_Inbox.click();
		Thread.sleep(2000);
		clickon_Star.click();
		Thread.sleep(2000);
		clickOn_StarredEmails.click();
		Thread.sleep(2000);
	}

	public void CaptureScreen() {

		try {

			File file = new File("/home/SImran/Documents/workspace-wspip/SeleniumWebdriver/src/test/java/error.jpg");
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, file);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}