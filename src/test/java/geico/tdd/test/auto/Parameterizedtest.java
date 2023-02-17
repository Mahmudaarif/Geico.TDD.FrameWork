package geico.tdd.test.auto;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import geico.tdd.base.BaseClass;
import geico.tdd.utils.AutoData;

public class Parameterizedtest extends BaseClass {

	@Parameters({"epectedHomePageTitle", "zipcode"})
	@Test(enabled = false,groups = "auto")
	public void autoTest(String epectedHomePageTitle, String zipcode) throws InterruptedException {

		homePage.verifyHomePageTitle(epectedHomePageTitle);
		homePage.insertZipcodeField(zipcode);
		homePage.clickGoBtn();
		homePage.clickAutoLOB();
		// homePage.clickMotorcycle();
		homePage.clickStartMyQuote();
		Thread.sleep(3000);

	}
	
	@Parameters({"epectedHomePageTitle", "zipcode"})
	@Test(enabled = true,groups = "auto")
	public void autoDataTest(String epectedHomePageTitle, String zipcode) throws InterruptedException {
		AutoData data = new AutoData(epectedHomePageTitle, zipcode);
		homePage.verifyHomePageTitle(data.getHomePageTitle());
		homePage.insertZipcodeField(data.getZipCode());
		homePage.clickGoBtn();
		homePage.clickAutoLOB();
		// homePage.clickMotorcycle();
		homePage.clickStartMyQuote();
		Thread.sleep(3000);

	}

}
