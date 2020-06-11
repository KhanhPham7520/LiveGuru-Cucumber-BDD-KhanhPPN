package liveGuru.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commons.AbstractTest;
import commons.GlobalConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import liveGuru.HeaderPageObject;
import liveGuru.HomePageObject;
import liveGuru.LoginPageObject;

public class LiveGuruLogin extends AbstractTest {

	WebDriver driver;
	HeaderPageObject headerPage;
	LoginPageObject loginPage;
	HomePageObject homePage;

	@Given("^Open LiveGuru Application$")
	public void openLiveGuruApplication() throws Throwable {
		System.setProperty(GlobalConstants.CHROME_DRIVER_SYSTEM_KEY, GlobalConstants.CHROME_DRIVER_SYSTEM_VALUE);
		driver = new ChromeDriver();
		driver.manage().window();
		driver.get("http://live.demoguru99.com/index.php/");
	}

	@When("^Click to My Account$")
	public void clickToMyAccount() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Account']//parent::a")).click();
		driver.findElement(By.xpath("//div[@id='header-account']//li//a[text()='My Account']")).click();
	}

	@When("^Input to username with registered email$")
	public void inputToUsernameWithRegisteredEmail() throws Throwable {
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("kpham29@gmail.com");
	}

	@When("^Input to password with registered password$")
	public void inputToPasswordWithRegisteredPassword() throws Throwable {
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("foster1994");
	}

	@When("^Click Login button$")
	public void clickLoginButton() throws Throwable {
		driver.findElement(By.xpath("//button[@name='send']")).click();
	}

	@Then("^Verify My Dashboard is displayed$")
	public void verifyMyDashboardIsDisplayed() throws Throwable {
		verifyEquals(driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText(), "MY DASHBOARD");
		closeBrowserAndDriver(driver);
	}

}
