package liveGuru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;

public class HomePageObject extends AbstractPages {

	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
}
