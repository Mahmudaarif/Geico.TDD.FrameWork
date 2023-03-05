package geico.tdd.objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static geico.tdd.common.CommonActions.*;
//
public class LogInPage {
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Log In']//parent::a")
	WebElement logInBtn;

	@FindBy(xpath = "//div[text()='Access Your Policy']")
	WebElement accessYourPolicyHeader;

	// @FindBy(xpath = "//select[@id='manage_select']")
	// WebElement autoBtn;

	@FindBy(xpath = "(//button[@id='manageSubmit'])[1]")
	WebElement logInBtn1;

	@FindBy(xpath = "//input[@id='TextInputComponent-1']")
	WebElement userIdField;

	@FindBy(xpath = "//input[@id='TextInputComponent-2']")
	WebElement userPasswordField;
	

	public void clickLogInBtn() {
		click(logInBtn);
	}

	public void clickAccessYourPolicy() {
		click(accessYourPolicyHeader);
	}

	public void clickLogInBtn1() {
		click(logInBtn1);
	}

	public void inputId(String id) {
		insert(userPasswordField, id);

	}

	public void inputpassword(String password) {
		insert(userPasswordField, password);
	}

}
