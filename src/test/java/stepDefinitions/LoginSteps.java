package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver = setUpClass.driver;

	@Given("The user enter to login page")
	public void user_on_login_page() {
		driver.findElement(By.className("login")).click();
		
	}
	
	@When ("The user enter username as {string}")

	public void username(String username) {
		WebElement usernameLb1 = driver.findElement(By.id("email"));
		usernameLb1.sendKeys(username);
		
	}
	
	@And ("The user enter password as {string}")

	public void userpassword (String password) {
		WebElement passwdLb1 = driver.findElement(By.id("passwd"));
		passwdLb1.sendKeys(password);
	}
	
	@When ("The user click on sign in button")
	public void click_login() {
		WebElement loginBtn = driver.findElement(By.id("SubmitLogin"));
		loginBtn.click();
	}
	
	@Then ("the user should be logged correctly")
	public void user_able_to_view_credentials() {
		WebElement pageAssertion = driver.findElement(By.className("page-heading"));
		assertTrue(pageAssertion.getText().contentEquals("MY ACCOUNT"));
		driver.quit();
	}

}
