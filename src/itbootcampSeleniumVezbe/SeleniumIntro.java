package itbootcampSeleniumVezbe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		//apsolutna putanja krece od sistema, dok relativna putanja ide iz projekta
		
		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resourses/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		// I nacin
		String title = driver.getTitle();
		System.out.println(title);
		//II nacin
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.youtube.com/?hl=sr&gl=RS");
		title=driver.getTitle();
		System.out.println(title);
		
		//zatvara driver.. close zatvara samo poslednji prozor, a quit zatvara sve prozore i oba se pisu na kraju 
		// driver.close();
		
		/* zakomentarisali smo da bi mogli da izvrsimo uzimanje naslova sa stranice
		
		//prebacilo nas je sada na drugu stranicu
		driver.navigate().to("https://www.youtube.com/?hl=sr&gl=RS");
		
		//uraditi back i refresh
		driver.navigate().back();
		driver.navigate().forward(); */
		
		//ubaciti tekst u youtube
		// driver.findElement(By.id("search")).click();
		//driver.findElement(By.id("search")).sendKeys("Sport");
		//driver.findElement(By.id("search")).sendKeys(Keys.ENTER);  ISTO JE KAO I CLICK
		//driver.findElement(By.id("search-icon-legacy")).click();
		
		//drugi nacin za trazenje
		
		WebElement search=driver.findElement(By.id("search"));
		search.sendKeys("Sport");
		
		
		 // search.sendKeys(Keys.ENTER);  
		// driver.findElement(By.id("search-icon-legacy")).click();
		
		 WebElement lupica=driver.findElement(By.id("search-icon-legacy"));
		 lupica.click();
		
		driver.close();
		
	}

}
