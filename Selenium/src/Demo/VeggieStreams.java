package Demo;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VeggieStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column to get sorted list
		//capture all veggies to list
		//then get text of veggies to new list
		//apply sort on this new list
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
		List<WebElement> veggieNamesL = driver.findElements(By.xpath("//tbody/tr/td[1]"));	
		List<String> originalList=veggieNamesL.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
	}

}
