package Demo;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//switching window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
//		Set<String> handles=driver.getWindowHandles();
//		Iterator<String> it = handles.iterator();
//		String parentWindowId=it.next();
//		String childWindowId=it.next();
//		
//		driver.switchTo().window(childWindowId);
//		driver.get("https://rahulshettyacademy.com/");
//		String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
//		
//		driver.switchTo().window(parentWindowId);
//		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
//		name.sendKeys(courseName);
//		File file = name.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("logo.png"));
//		
//		//get height and width 
//		System.out.println(name.getRect().getDimension().getHeight());
//		System.out.println(name.getRect().getDimension().getWidth());
		
	}

}
