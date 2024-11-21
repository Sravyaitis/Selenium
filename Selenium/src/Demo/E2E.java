package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-notifications");

		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		
		
		
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'HYD')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'DEL')]")).click();
		
		driver.findElement(By.cssSelector("div[data-testid='undefined-calendar-picker']")).click();
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-16ru68a.r-y47klf.r-1loqt21.r-eu3ka.r-1otgn73.r-1aockid")).click();
		//driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).click();
		
		
		
		
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();

		for(int i=1;i<4;i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
	
		
	
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']"));
		
		for(WebElement ele : eles) {
			if(ele.getAttribute("style").contains("opacity: 1")) {
				ele.click();
				
				String option="USD";
				WebElement dropdown =driver.findElement(By.xpath("//div[contains(text(), '"+option+"')]"));
				dropdown.click();
				}
			}
	
		List<WebElement> radios=driver.findElements(By.cssSelector(".css-76zvg2.r-cqee49.r-1enofrn.r-1ozqkpa"));
		for(WebElement radio : radios) {
			if(radio.getText().contains("Govt. Employee")) {
				radio.click();
			}
		}
		
		
		driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();
		
		
//		driver.switchTo.alert(findElement(By.cssSelector("div[class='css-1dbjc4n r-zso239'] svg")).click());
		
	}
	

}
