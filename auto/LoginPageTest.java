package geico.tdd.test.auto;

import org.testng.annotations.Test;

import geico.tdd.base.BaseClass;

public class LoginPageTest extends BaseClass {

	@Test(enabled = true, priority = 1, groups = { "login", "non-functional" })
	public void loginTest() throws InterruptedException {

		logInPage.clickLogInBtn();
		Thread.sleep(3000);

		logInPage.clickAccessYourPolicy();

		logInPage.clickLogInBtn1();

		logInPage.inputId("Mahmuda");

		logInPage.inputpassword("3412");

	}

}
