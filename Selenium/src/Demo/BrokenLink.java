package Demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		//broken links
		//java methods call the url and get the status code
		//1. get all urls
		
		//if status code>400 then that url is not working-> link tied up to the broken url
		//String url = driver.findElement(By.cssSelector("[href*='soapui']")).getAttribute("href");
		String url1 = driver.findElement(By.cssSelector("[href*='brokenlink']")).getAttribute("href");
		
		//HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();

		HttpURLConnection conn = (HttpURLConnection)new URL(url1).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		System.out.println(conn.getResponseCode());
	}

}
