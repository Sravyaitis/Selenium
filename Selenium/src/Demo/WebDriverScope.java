package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1. Give me the count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//2. Get the links count in footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3. get the count of links on one of the footer section
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//4. click on each link if the pages are opening?
		for(int i=1; i<columnDriver.findElements(By.tagName("a")).size();i++) {
			String clickOnLinkTab=Keys.chord(Keys.COMMAND,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
			
			//5. Now navigate to each tab and grab title and print it
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		String parent = it.next();
		System.out.println(driver.getTitle());
			
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());		
	}
}
