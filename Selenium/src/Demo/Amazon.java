package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Chocolates");
		//driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
//		Thread.sleep(2000);
//		List<WebElement> allItems = driver.findElements(By.cssSelector("span[data-component-type='s-search-results'"));
//		
//		for(WebElement item : allItems) {
//			Thread.sleep(2000);
//			if(item.findElement(By.xpath("//div[@data-csa-c-item-id='amzn1.asin.1.B0BHTWFQ5X']")).equals("LINDOR")) {
//				Thread.sleep(2000);
//				item.click();
//			}
//		}
		
		driver.findElement(By.xpath("//div[@class='a-size-base-plus a-color-base a-text-normal' and contains(text(),\"LINDOR\")]")).click();
			
		//driver.findElement(By.xpath("//h2[@class='a-size-medium s-inline s-access-title a-text-normal' and contains(text(), \"LINDOR\")]")).click();

		
	}

}
