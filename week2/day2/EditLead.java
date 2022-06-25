package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kajol");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Agarwal");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kaju");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Movie");
		WebElement description=driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("She is an actor");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kaju@gmail.com");
		WebElement state_element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state_dropdown = new Select(state_element);
		state_dropdown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		WebElement important_note = driver.findElement(By.id("updateLeadForm_importantNote"));
		important_note.sendKeys("This is imp");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
				
	}

}
