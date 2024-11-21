package Demo;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		options.setCapability("Proxy", proxy);
		Map<String, Object> prefs = new HashMap<String,Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("pres", prefs);
		
		FirefoxOptions options1= new FirefoxOptions();
		options1.setAcceptInsecureCerts(true);
		
		EdgeOptions options2 = new EdgeOptions();
		options2.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		WebDriver driver1 = new FirefoxDriver(options1);
		driver1.get("https://expired.badssl.com/");
		
		System.out.println(driver1.getTitle());
		
		WebDriver driver2 = new EdgeDriver(options2);
		driver2.get("https://expired.badssl.com/");
		
		System.out.println(driver2.getTitle());
	}

}
