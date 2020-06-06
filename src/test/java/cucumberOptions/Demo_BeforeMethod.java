package cucumberOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_BeforeMethod {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Run trc mỗi test case");
	}

	@Test
	public void TC_01() {
		System.out.println("Run test case");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Run sau mỗi test case");
	}

}
