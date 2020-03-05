package itbootcampSeleniumVezbe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//prebacilo nas je sada na drugu stranicu
		driver.navigate().to("https://www.youtube.com/?hl=sr&gl=RS");
		
		//uraditi back i refresh
		driver.navigate().back();
		driver.navigate().forward();
		
		//ubaciti tekst u youtube
		driver.findElement(By.id("search")).click();
		
		driver.findElement(By.id("search")).sendKeys("Sport");
		
		// driver.findElement(By.id("search")).sendKeys(Keys.ENTER);  ISTO JE KAO I CLICK
		driver.findElement(By.id("search-icon-legacy")).click();
		
	}

}
