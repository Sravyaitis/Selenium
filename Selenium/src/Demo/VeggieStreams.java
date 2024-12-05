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
		
		//get the column
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
		
		//capture all veggies to list
		List<WebElement> veggieNamesL = driver.findElements(By.xpath("//tbody/tr/td[1]"));	
		
		//then get text of veggies to new list
		List<String> originalList=veggieNamesL.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//apply sort on this new list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		//compare original and sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		//scan the name column with getTExt -->Rice -->print the price of the rice
		List<String> price=veggieNamesL.stream().filter(s->s.getText().contains("Beans"))
		.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		//prints each and every item in the list
		price.forEach(a->System.out.println("Beans Price: "+a)); //forEach(item->action on that item)
		
		
		//pagination testing	
		List<String> ricePrice;
		do {
			List<WebElement> newVeggieList = driver.findElements(By.xpath("//tbody/tr/td[1]"));	
			ricePrice=newVeggieList.stream().filter(s->s.getText().contains("Rice"))
					.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
			
			ricePrice.forEach(b -> System.out.println("Rice Price: "+ b));
			
			if(ricePrice.size()<1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}while (ricePrice.size()<1);
		
		
//		List<String> tomatoesprice;
//		do {
//			List<WebElement> discountPriceList = driver.findElements(By.xpath("//tbody/tr/td[3]"));
//			tomatoesprice = discountPriceList.stream().filter(d -> d.getText().contains("Tomato"))
//					.map(d -> getDiscountPrice(d)).collect(Collectors.toList());;
//			
//			tomatoesprice.forEach(a -> System.out.println("Tomato's discount price: "+a));
//			
//			if(tomatoesprice.size()<1) {
//				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
//			}
//		} while (tomatoesprice.size()<1);
		
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
	}
	
//	public static String getDiscountPrice(WebElement d) {
//		String discountPrice =d.findElement(By.xpath("following-sibling::td[1]")).getText();
//		return discountPrice;
//	}

}
