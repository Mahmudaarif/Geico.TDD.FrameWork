package geico.tdd.objects;

import static geico.tdd.common.CommonActions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AboutYouPage {
	public AboutYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[text()='Let’s get started.']//parent::div")
	WebElement aboutYouPageTitle;

	@FindBy(xpath = "//input[@id='Id_GiveDateOfBirth_23308']")
	WebElement dobBtn;

	@FindBy(id = "Id_GiveDateOfBirth_98791")
	WebElement nextBtn;

	@FindBy(xpath = "(//input[@size='21'])[1]")
	WebElement firstName;

	@FindBy(xpath = "//input[@data-formotivid='LastName']")
	WebElement lastName;

	public void verifyAboutYouPage(String expectedTitle) {
		validate(aboutYouPageTitle, expectedTitle);

	}

	public void insertDOB(String dob) {
		insert(dobBtn, dob);
	}

	public void clickNextBtn() {
		click(nextBtn);

	}

	public void insertFirstName(String value) {
		insert(firstName, value);

	}

	public void insertLastName(String value) {
		insert(lastName, value);
	}

}
