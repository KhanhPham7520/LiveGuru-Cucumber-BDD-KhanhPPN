package liveGuru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPages;

public class HeaderPageObject extends AbstractPages {

	WebDriver driver;

	public HeaderPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
