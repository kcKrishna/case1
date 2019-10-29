package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions {
	WebDriver drive;
	@Given("user is on fb login page")
	public void user_is_on_fb_login_page() {
	    
		drive = Drivers.getDriver("Chrome");
		drive.get("https://www.facebook.com");

		}

	@When("user provides Correct credentials")
	public void user_provides_Correct_credentials() {
		
		drive = Drivers.getDriver("Chrome");
		drive.get("https://www.facebook.com");
		drive.findElement(By.xpath("//input[@name = 'email']")).sendKeys("pgod");
		drive.findElement(By.xpath("//input[@name='pass']")).sendKeys("g-god");
		//drive.findElement(By.xpath("//input[@value = 'Log In']"));
	    
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
		System.out.println("login button is clicked");
	}


	@Then("user is in Homepage")
	public void user_is_in_Homepage() {
		//WebDriver drive;
	    System.out.println("you are in Home Page");
	}

	@Then("a welcome back message should be displayed")
	public void a_welcome_back_message_should_be_displayed() {
		//WebDriver drive;
		System.out.println("Welcome Back Howle");
	}


}
