package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String checkBoxValue=driver.findElement(By.xpath("//input[@value='option2']")).getAttribute("value");
		System.out.println(checkBoxValue);
		
		
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		dropDown.click();
		System.out.println(dropDown.getText());
	
		Select dropdown = new Select(dropDown);
		dropdown.selectByValue(checkBoxValue);

		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys(checkBoxValue);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String message = driver.switchTo().alert().getText();
		
		if(message.contains(checkBoxValue)) {
			System.out.println("text is present");
		} else {
			System.out.println("text not present");
		}
		
//		driver.switchTo().alert().accept();
	}

}
