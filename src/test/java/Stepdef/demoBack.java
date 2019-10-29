package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demoBack {
	WebDriver drive;
	
	@Given("User launched the Chrome browser")
	public void user_launched_the_Chrome_browser() {
		drive = Drivers.getDriver("Chrome");
		
	}

	@Given("launched the URl")
	public void launched_the_URl() {
		drive.get("http://demowebshop.tricentis.com/");
	}

	@Then("clicked on Login")
	public void clicked_on_Login() {
		drive.findElement(By.xpath("//a[@href = '/login']"));
	}

	@Then("Provided Credentials")
	public void provided_Credentials() {
		System.out.println("correct credentials provided");
	}

	@Then("he should be redirected to Home page")
	public void he_should_be_redirected_to_Home_page() {
		System.out.println("redirecteds to home page");
	}

	@Then("clicked on register")
	public void clicked_on_register() {
		System.out.println("clicks on register");
	}

	@Then("provided all details")
	public void provided_all_details() {
		System.out.println("provides all correct details");
	}

	@Then("he should be registered Successfully")
		public void Successful_registraion(){	
			
		System.out.println("registered successfully");
	}
}
