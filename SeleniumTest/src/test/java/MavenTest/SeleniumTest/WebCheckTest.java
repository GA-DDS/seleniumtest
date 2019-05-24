package MavenTest.SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebCheckTest {

	@Test

	public void Login() {
		System.out.println("Welcome to the WebCheck application");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mkondepati\\git\\seleniumtest\\SeleniumTest\\ChromeDriverUpdtaed\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
}
