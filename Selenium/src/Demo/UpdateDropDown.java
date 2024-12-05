package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class UpdateDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-notifications");

		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		
		
		
		
		
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		
		//another way to write for loop
//		int i=1;
//		while(i<4) {
//			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//			i++;
//		}
		
		for(int i=1;i<4;i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText(), "Passengers 4 Adults");
//		
//		
//		//working but above code is hiding this below
//		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73']"));
//		System.out.println(eles.size());
//		for(WebElement ele : eles) {
//			if(ele.getText().contains("Armed Forces")) {
//				ele.click();
//				break;
//			}
//		}
		
		
		
		Assert.assertFalse(driver.findElement(By.xpath("//div[contains(text(),'Govt. Employee')]")).isSelected());
		//Assert.assertTrue(false);
		
		
		
		
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'HYD')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'DEL')]")).click();
		
	
		driver.findElement(By.className(".css-1dbjc4n.r-1awozwy.r-16ru68a.r-y47klf.r-1loqt21.r-eu3ka.r-1otgn73.r-1aockid")).click();
		driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).click();
		
		
		//driver.quit();
	}

}
