package liveGuru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;

public class LoginPageObject extends AbstractPages {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
