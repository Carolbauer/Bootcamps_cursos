package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



@SuppressWarnings("unused")
public class Utils {
	private static final byte[] TakesScreenshot = null;
	public static WebDriver driver;
	
	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "/Users/ramon/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://bugbank.netlify.app/");
	}	

}
