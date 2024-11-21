package Demo;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeggiesCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//list to buy
				String[] itemsNeeded = {"Brocolli", "Cauliflower", "Cucumber"};
					
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				Thread.sleep(3000);
				//total items in store
				List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
				
				
				for(int i=0;i<products.size();i++) {
					
					//Brocolli - 1 Kg
					String[] name = products.get(i).getText().split("-");
					//name[0]=Brocolli
					//name[1]= 1 kg
					String formattedName=name[0].trim();
					
					///convert to array to arraylist for easy search
					List<String> al = Arrays.asList(itemsNeeded);
					
					if(al.contains(formattedName)) {
						driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
						break;
					}
				}
				
	}

}
