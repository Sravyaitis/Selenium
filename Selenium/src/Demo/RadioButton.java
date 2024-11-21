package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.cssSelector("input[value='radio2']")).getAttribute("type"));
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		
		if(driver.findElement(By.cssSelector("input[value='radio2']")).getAttribute("type").contains("radio")) {
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

}
