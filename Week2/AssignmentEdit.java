package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentEdit {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bincy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Maria");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("bini");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("quality asurance");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("we preform both functional and regression testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bini.nithish25@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("we provide end to end testing without any quality miss");
		driver.findElement(By.className("smallSubmit")).click();
System.out.println("the title is :"+driver.getTitle());
System.out.println("the title is :"+ driver.getCurrentUrl());
System.out.println("the title is :"+ driver.getPageSource());
		
	driver.close();	
		
	}

}

