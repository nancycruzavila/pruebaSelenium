package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
