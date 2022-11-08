package testGitJenkins;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProject {
	
	
	@Test
    public static void getDriver() throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	driver.findElement(By.name("q")).sendKeys("Dhaka", Keys.ENTER);
	Thread.sleep(2000);
	driver.close();
	}
}
