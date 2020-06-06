package commons;

import org.openqa.selenium.WebDriver;

import bankGuru.pageObjects.LoginPageObject;
import bankGuru.pageObjects.RegisterPageObject;

public class PageGeneratorManager {

	// Cấp phát việc khởi tạo đối tượng cho Home Page

	// Cấp phát việc khởi tạo đối tượng cho Register Page
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}

	// Cấp phát việc khởi tạo đối tượng cho Login Page
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

}
