package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement ele = driver.findElement(By.id("createLeadForm_companyName"));
		ele.sendKeys("amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bincy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Maria");
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("bini");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("quality asurance");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("we preform both functional and regression testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bini.nithish25@gmail.com");
		WebElement eleSub= driver.findElement(By.className("smallSubmit"));
		eleSub.click();
		System.out.println("the title is :"+driver.getTitle());
		driver.findElement(By.className("subMenuButton")).click();
		WebElement ele1 = driver.findElement(By.id("createLeadForm_companyName"));
		ele1.clear();
		ele1.sendKeys("zoho");
		WebElement eleFirst=driver.findElement(By.id("createLeadForm_firstName"));
		eleFirst.clear();
		eleFirst.sendKeys("Binixavier");
		driver.findElement(By.className("smallSubmit"));
		System.out.println("the title is :"+driver.getTitle());
		driver.close();
	}

}
