package commons;

import org.openqa.selenium.WebDriver;

import liveGuru.HeaderPageObject;
import liveGuru.HomePageObject;
import liveGuru.LoginPageObject;

public class PageGeneratorManager {

	public static HeaderPageObject getHeaderPage(WebDriver driver) {
		return new HeaderPageObject(driver);
	}

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
}
