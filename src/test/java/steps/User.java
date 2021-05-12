package steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User {
	
	
	
	@Given("User in home")
	public void user_in_home() {
	   System.out.println("giver");
	}
	@When("I click")
	public void i_click() {
		System.out.println("when1");
	}
	@When("I enter the firstname {string},{string}")
	public void i_enter_the_firstname(String string, String string2) {
		
		assertEquals(string, "ahmed");
		assertEquals(string2, "sehs");
	}
	
	@Then("You are good to go")
	public void you_are_good_to_go() {
		System.out.println("then");
		
	}
}
