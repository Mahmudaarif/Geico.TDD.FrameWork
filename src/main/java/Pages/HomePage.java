package Pages;

import static geico.tdd.common.CommonActions.*;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "h1")
	WebElement homepageTitle;

	@FindBy(xpath = "(//input[@class='zip-code-input'])[1]")
	WebElement zipcodeField;

	@FindBy(xpath = "//input[@value='Go']")
	WebElement goBtnElement;

	@FindBy(xpath = "(//div[@class='product-checkbox'])[1]")
	WebElement autoLOBElement;

	@FindBy(xpath = "//a[text()='Start My Quote']")
	WebElement startMyQuote;

	@FindBy(xpath = "(//input[@value='Continue'])[1]")
	WebElement continueBtn;

	@FindBy(xpath = "(//span[text()='Log In'])[1]")
	WebElement logInBtn;

	public void verifyHomePageTitle(String expectedTitle) {
		validate(homepageTitle, expectedTitle);
	}

	public void insertZipcodeField(String zip) {
		insert(zipcodeField, zip);
	}

	public void clickGoBtn() {
		click(goBtnElement);
	}

	public void clickAutoLOB() {
		click(autoLOBElement);

	}

	public void clickStartMyQuote() {
		click(startMyQuote);
	}

	// public void clickLogInBtn() {
	// click(logInBtn);

	// public void clickMotorcycle() {
	// click(motorcycleLOBElement);
}

// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
// wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
