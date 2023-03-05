package geico.tdd.test.auto;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.auto.common.BasicAnnotationProcessor.Step;

import geico.tdd.base.BaseClass;
import geico.tdd.reporting.Logs;

public class AutoQuoteTest extends BaseClass {

	@Test(enabled = true, groups = "auto")
	public void autoTest() throws InterruptedException {

		homePage.verifyHomePageTitle("The Insurance Savings You Expect");
		homePage.insertZipcodeField("10461");
		homePage.clickGoBtn();
		homePage.clickAutoLOB();
		homePage.clickStartMyQuote();
		Thread.sleep(3000);
		// homePage.clickLogInBtn();
		// Thread.sleep(3000);

		// accessYourPolicyPage.clickAutoBtn();
		// accessYourPolicyPage.clickLogInBtn();
		// homePage.clickContinueBtn(driver);
		// aboutYouPage.verifyAboutYouPage("Let’s get started.");
		// Thread.sleep(4000);
		// aboutYouPage.insertDOB("02021985");

	}

	@Test(enabled = false, priority = 0, groups = { "auto",
			"non-func" }, dependsOnMethods = "test", ignoreMissingDependencies = true)
	public void test1() {
		Logs.log("Test1");
	}

	@Test(enabled = false, priority = 1, groups = { "auto", "non-func" }, invocationCount = 2)
	public void test2() {
		Logs.log("test2");
	}

	@Test(enabled = false, priority = 0, groups = { "auto", "non-func" })
	public void test3() {
		// Step1
		// Step2
		Logs.log("Test3");
		Assert.fail();
	}

	@Test(enabled = false, priority = 0, retryAnalyzer = geico.tdd.retry.RetryFailedTests.class)
	public void testRetry() {
		Logs.log("Retry Test");
		Assert.fail();

	}

}
