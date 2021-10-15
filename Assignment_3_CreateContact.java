package week2.Day2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_3_CreateContact {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();		
	driver.findElement(By.linkText("Contacts")).click();		
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("senthilnathan");
	driver.findElement(By.id("lastNameField")).sendKeys("Kannan");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Senthil");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K");
	driver.findElement(By.name("departmentName")).sendKeys("Testing");
	driver.findElement(By.id("createContactForm_description")).sendKeys("Basic information provided");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("senthil.gk2000@gmail.com");
	Select pickState = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
	pickState.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.className("subMenuButton")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testing courses information");
	driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	System.out.println(driver.getTitle());
			
	}

}
