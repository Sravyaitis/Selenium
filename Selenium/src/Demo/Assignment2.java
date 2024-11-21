package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
		
		driver.findElements(By.xpath("//table[@name='courses']"));
		List<WebElement> actualValues = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		
		int sum=0;
		for(int i=0; i<actualValues.size();i++) {
			System.out.println(actualValues.get(i).getText());
			sum += Integer.parseInt(actualValues.get(i).getText());
		}
		System.out.println(sum);
	}

}
