package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("insta");
//		Thread.sleep(3000);
//		List<WebElement> options = driver.findElements(By.cssSelector("li[class='sbct PZPZlf'] div"));
//		
//		for(WebElement option : options) {
//			if((option.getText()).equalsIgnoreCase("Instacart")) {
//				option.click();
//			}
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));


		for(WebElement option :options)

		{

		if(option.getText().equalsIgnoreCase("India"))

		{

		option.click();

		break;

		}


		}
	}

}
