package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglehomePage {
	WebDriver driver ;
	public GooglehomePage(WebDriver driver) {
	this.driver = driver ;
}
By searchbox = By.xpath("//input[@name='q']") ;
//By search_btn = By.xpath("//input[@name='btnk'][1]");
By search_btn = By.name("btnK");
//By flipkart_link = By.xpath("//a//h3[text()='LC20lb MBeuO DKV0Md']");
By flipkart_link = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3");
public void searchgoogle(String Searchinput) {
	try {
	driver.findElement(searchbox).sendKeys(Searchinput);
	Thread.sleep(5000);
	driver.findElement(search_btn).click();
	Thread.sleep(5000);
}catch (Exception e) {
	System.out.println("Exception Caught"+e.getMessage());
}
}

public void clickflikart() {
try{
	driver.findElement(flipkart_link).click();
	Thread.sleep(5000);
}catch (Exception e) {
	System.out.println("Exception Caught"+e.getMessage());
	
}}}