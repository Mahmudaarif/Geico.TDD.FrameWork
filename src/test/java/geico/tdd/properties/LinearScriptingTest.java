package geico.tdd.properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinearScriptingTest {
WebDriver driver;
	
	@BeforeMethod
	public void init() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.geico.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@Test(enabled = false)
	public void linearScripting() {
		
		WebElement startQuoteBtn = driver.findElement(By.xpath("//a[text()='Start My Quote']"));
		startQuoteBtn.click();
	}
	
	@Test(enabled = true)
	public void linearScripting1() {
		WebElement logoElement = driver.findElement(By.xpath("//a[@class='icon-geico']"));
		logoElement.click();
		
	}
	
	
	

}
