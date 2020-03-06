package itbootcampSeleniumVezbe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumVezbeDrugiCas {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resourses/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		WebElement ime=driver.findElement(By.name("firstname"));
		ime.click();//moze i ne mora sa klikom
		ime.sendKeys("Irma");
		
		WebElement prezime=driver.findElement(By.name("lastname"));
		prezime.sendKeys("Salihovic");

		WebElement pol=driver.findElement(By.id("sex-1"));
		pol.click();
		
		WebElement iskustvo=driver.findElement(By.id("exp-3"));
		iskustvo.click();
		
		WebElement datum=driver.findElement(By.id("datepicker"));
		datum.sendKeys("27.07.1993.");
		
		WebElement profesija=driver.findElement(By.id("profession-1"));
		profesija.click();
		
		WebElement automationTools=driver.findElement(By.id("tool-2"));
		automationTools.click();
		
		WebElement kontinent=driver.findElement(By.id("continents"));
		kontinent.click();
		kontinent.sendKeys("Europe");
		kontinent.click();
		
		WebElement submit, link;
		
		submit=driver.findElement(By.id("submit"));
		submit.click();
		
		link=driver.findElement(By.linkText("Selenium Webdriver Tutorials Series"));
		link.click();
				
	}

}
