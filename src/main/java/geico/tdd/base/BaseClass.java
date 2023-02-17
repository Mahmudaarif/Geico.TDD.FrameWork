package geico.tdd.base;

import static geico.tdd.utils.IConstant.*;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.Status;

//org.testng.annotations.BeforeSuite;
//import Pages.AboutYouPage;
import Pages.HomePage;
import Pages.LogInPage;
import geico.tdd.utils.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends ExtentListener{

	protected WebDriver driver;
	ReadProperties envVar = new ReadProperties();;
	protected HomePage homePage;
	protected LogInPage logInPage;

	// protected AboutYouPage aboutYouPage;
	// public JavascriptExecutor js;
	public WebDriverWait wait;

	@Parameters("browser")
	@BeforeMethod
	public void setUpDriver(String browserName) {
		// String browserName = envVar.getProperty(BROWSER);

		String url = envVar.getProperty(URL);
		long pageLoadWait = envVar.getNumProperty(PAGELOAD_WAIT);
		initDriver(browserName);
		initClass(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	private void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		default:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}

	}

	public void initClass(WebDriver driver) {
		homePage = new HomePage(driver);
		logInPage = new LogInPage(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

	@AfterMethod
	public void getResult(ITestResult result, Method method) {
		if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, PASSED);
		}else if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, FAILED);
			test.addScreenCaptureFromPath(captureScreenShot(driver, method.getName()));
		}else if(result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, SKIPPED);
		}
	}

}
