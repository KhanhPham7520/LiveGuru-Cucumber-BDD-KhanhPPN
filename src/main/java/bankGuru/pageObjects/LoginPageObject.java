package bankGuru.pageObjects;

import org.openqa.selenium.WebDriver;

import bankGuru.pageUIs.LoginPageUI;
import commons.AbstractPages;

public class LoginPageObject extends AbstractPages {

	private final WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginPageUrl() {
		return getCurrentPageUrl(driver);
	}

	public RegisterPageObject clickToHereLink() {
		waitToElementClickable(driver, LoginPageUI.HERE_LINK);
		clickToElement(driver, LoginPageUI.HERE_LINK);
		return new RegisterPageObject(driver);
	}

	public void inputUserIDTxt(String userID) {
		waitToElementVisible(driver, LoginPageUI.USER_NAME_TXT);
		sendKeyToElement(driver, LoginPageUI.USER_NAME_TXT, userID);
	}

	public void inputPasswordTxt(String password) {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TXT);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TXT, password);
	}

	public void clickLoginButton() {
		waitToElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}

}
