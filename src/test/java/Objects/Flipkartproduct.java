package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipkartproduct {
	WebDriver driver ;
	public Flipkartproduct(WebDriver driver) {
	this.driver = driver ;
}
	//By email_Enter = By.xpath("(//input[@type='text'])[2]");
	By Flipkart_search = By.name("q");
	By search_btn = By.name("L0Z3Pu");
	public void Flip_search(){
		driver.findElement(Flipkart_search).sendKeys("laptop");
		
}
}
