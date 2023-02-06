package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class FlipkartPage {
		WebDriver driver ;
		public FlipkartPage(WebDriver driver) {
		this.driver = driver ;
}
		//By email_Enter = By.xpath("(//input[@type='text'])[2]");
		By flipkart_search = By.name("q");
		public void flipkartsearch(){
			driver.findElement(flipkart_search).sendKeys("Laptop");
}
}