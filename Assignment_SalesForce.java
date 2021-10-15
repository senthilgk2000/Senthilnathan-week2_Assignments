package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_SalesForce {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement salesField = driver.findElement(By.name("UserFirstName"));
		salesField.sendKeys("Senthil");
		driver.findElement(By.name("UserLastName")).sendKeys("Nathan");
		driver.findElement(By.name("UserEmail")).sendKeys("senthil.gk2000@gmail.com");

		Select pickTitle = new Select(driver.findElement(By.name("UserTitle")));
		pickTitle.selectByVisibleText("Sales Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("Thoughtworks");

		Select pickEmployees = new Select(driver.findElement(By.name("CompanyEmployees")));
		pickEmployees.selectByVisibleText("1 - 15 employees");

		driver.findElement(By.name("UserPhone")).sendKeys("+91 9087654312");
		Select pickCountry = new Select(driver.findElement(By.name("CompanyCountry")));
		pickCountry.selectByVisibleText("United States");

		Select pickState = new Select(driver.findElement(By.name("CompanyState")));
		pickState.selectByVisibleText("Alabama");
		driver.findElement(By.xpath("(//form/descendant::div[@class='checkbox-ui'])[1]")).click();
		driver.close();
	}

}
