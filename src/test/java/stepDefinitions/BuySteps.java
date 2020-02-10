package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuySteps {
	WebDriver driver = setUpClass.driver;

	@Given("The user enter to login page of buy")
	public void user_on_login_page_buy() {
		driver.findElement(By.className("login")).click();
		
	}
	
	@When ("The user of buy enter username as {string}")

	public void username_buy(String username) {
		WebElement usernameLb1 = driver.findElement(By.id("email"));
		usernameLb1.sendKeys(username);
		
	}
	
	@And ("The user of buys enter password as {string}")

	public void userpassword_buy (String password) {
		WebElement passwdLb1 = driver.findElement(By.id("passwd"));
		passwdLb1.sendKeys(password);
	}
	
	   
	    
	@And ("The user click on sign in button in the buys page")
	public void click_login_buy() {
		WebElement loginBtn = driver.findElement(By.id("SubmitLogin"));
		loginBtn.click();
	}
	    
	 
	
	@And ("The user goes to women items")
	public void click_women_buy() {
		WebElement womenButton = driver.findElement(By.linkText("Women"));
		womenButton.click();
		
	}
	    
	@And ("Select a dress from the list") 
	    public void selectDress_buy() throws InterruptedException {
		Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2000);
        WebElement cart = driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
        cart.click();
	    }
	
 
	@And ("Click on the add to cart button")
	public void clickAdd() {
		WebElement btnAdd = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		btnAdd.click();
	}
	
	
    
    @Then ("Do the checkout of the items")
    public void proceed_buy() {
    	
    
    	WebElement proceed = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
    	proceed.click();
    } 
    
    @And ("The user enters the information of address")
    public void enterInformation()
    {
    	WebElement buttonAccept = driver.findElement(By.xpath("//*[@id='center_column']/form/p/button"));
    	buttonAccept.click();

    }
    
    @And ("The accept terms and conditions")
    public void proceed2_buy()
    {
    	WebElement buttonAccept = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
    	buttonAccept.click();
    	
    	WebElement proceed2 = driver.findElement(By.xpath("//*[@id='center_column']//form//p//span//input"));
    	proceed2.click();

    }
    
    @And ("The user complete the order")
    public void completeOrder()
    {
    	WebElement buttonAccept = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
    	buttonAccept.click();
    	WebElement pay = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
    	pay.click();
    }
 
    
    @And ("The user confirm the order")
    public void confimr()
    {
    	WebElement confirm = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
    	confirm.click();
    }
    
    @And ("The user accept the check payment")
    public void checkPayment()
    {
    	WebElement checkPayment = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
    	checkPayment.click();
    }
	
	@Then ("The user logout")
	public void user_logout() throws InterruptedException {
		
		WebElement pageAssertion = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]"));
		assertTrue(pageAssertion.getText().contentEquals("Your order on My Store is complete."));
		WebElement signOut = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
		signOut.click();
		Thread.sleep(2000);
		driver.quit();
	}

}