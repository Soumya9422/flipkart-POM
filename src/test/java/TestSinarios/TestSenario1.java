package TestSinarios;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import Objects.FlipkartPage;
import Objects.Flipkartproduct;
import Objects.GooglehomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class TestSenario1 {
	WebDriver driver;
	GooglehomePage objectrepo;
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
				driver .get("http://www.google.com/");
				
	}
	
	@Test
	public void searchOperation() {
		GooglehomePage page = new GooglehomePage(driver);
		page.searchgoogle("Flipkart");
	}
	@Test
	public void verifyflipkart() {
		objectrepo = new GooglehomePage(driver); 
		objectrepo.clickflikart();
	}
	@Test
	public void searchflip() {
		FlipkartPage page = new FlipkartPage(driver);
		page.flipkartsearch();

	}

	@AfterSuite
	public void aftersuite() {
		driver.quit();
	}
}
