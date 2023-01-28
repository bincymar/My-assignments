package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass3LeafGround {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Bincy");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("Guduvanchery");
	WebElement elem=driver.findElement(By.xpath("//input[@name=\'j_idt88:j_idt93\']"));
    elem.isDisplayed();
	 driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
     driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getText();
     WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		email.sendKeys("bini.nithish25@gmail.com");
		email.sendKeys(Keys.TAB);
		WebElement editor  = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
				editor.sendKeys("welcome to automation");
				
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@name='j_idt106:auto-complete_input']")).click();
		//driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt122']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Close the keypad']")).click();
		driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("hello");
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']")).isEnabled();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-24']")).click();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement tool =driver.findElement(By.className("ui-selectonemenu")); 
		Select automation= new Select(tool);
		automation.selectByVisibleText("Puppeteer");
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'][4]")).click();
}
}
