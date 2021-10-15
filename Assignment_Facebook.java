package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Facebook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
						
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement createbutton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createbutton.click();
		driver.findElement(By.name("firstname")).sendKeys("SENTHILNATHAN");
		driver.findElement(By.name("lastname")).sendKeys("KALIYAPERUMAL");
		driver.findElement(By.name("reg_email__")).sendKeys("0123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("nathan26");
		Select pickday = new Select(driver.findElement(By.id("day")));
		pickday.selectByVisibleText("26");
		Select pickmonth = new Select(driver.findElement(By.id("month")));
		pickmonth.selectByVisibleText("Dec");
		Select pickyear = new Select(driver.findElement(By.id("year")));
		pickyear.selectByVisibleText("2002");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
			
		
	}

}
