package Steps;

import java.sql.Driver;

import javax.net.ssl.HostnameVerifier;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageobjects.baseClass;
import pageobjects.LoginPage;

public class Stepdefinitions extends baseClass {

	LoginPage loginPage = PageFactory.initElements(baseClass.getdriver(), LoginPage.class);
	// getting driver from the base class and all the elements from the login
	// page and storing them into the login page variable .
	// now login page will have all the methods on the page

	@Given("^I login to the gmail\"([^\"]*)\"$")
	public void i_login_to_the_gmail(String Url) throws Throwable {

		loginPage.NavigateToUrl(Url);

	}

	@When("^I enter the email address as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_the_email_address_as_and(String email, String password) throws Throwable {
		loginPage.Enter_EmailPassword(email, password);
	}

	@When("^i click on inbox$")
	public void i_click_on_inbox() throws Throwable {
		loginPage.ClickOnInbox();
	}

	@When("^I logout$")
	public void i_logout() throws Throwable {
		loginPage.SignOut();
	}

	@When("^i check the total numbers of email in the inbox$")
	public void i_check_the_total_numbers_of_email_in_the_inbox() throws Throwable {
		loginPage.TotalNumberOfEmails();
	}

	@When("^i click on starred emails$")
	public void i_click_on_starred_emails() throws Throwable {
		loginPage.clickOnstarredemails();
	}

	@When("^I click on star$")
	public void i_click_on_star() throws Throwable {
		// click on inbox and then star one email
		loginPage.ClickOnStarInEmais();

	}

	@When("^I should have one email in stared$")
	public void i_should_have_one_email_in_stared() throws Throwable {

	}

	@When("^I click on stared emails$")
	public void i_click_on_stared_emails() throws Throwable {
		loginPage.clickOnstarredemails();
	}

	@When("^I should have the message present as \"([^\"]*)\"$")
	public void i_should_have_the_message_present_as(String arg1) throws Throwable {
		loginPage.NoStarredEmails();

	}

}
