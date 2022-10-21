package IPTV_new.CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	public static WebDriver driver;
	@Test
	public static void login() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://Users//user//Downloads//chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://110.44.119.237:82/admin/login");
	driver.manage().window().maximize();
//	WebElement element = driver.findElement(By.className("zgh-login"));
//	element.click();
	driver.findElement(By.name("email")).sendKeys("resi@admin.com");
//	driver.findElement(By.id("nextbtn")).click();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.findElement(By.name("password")).sendKeys("qwertyui");
	WebElement element= driver.findElement(By.cssSelector(".btn.btn-primary.btn-block.btn-flat"));
	element.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
//	driver.findElement(By.cssSelector(".btn.btn-default")).click();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	driver.findElement(By.xpath("//html")).click();
//	JavascriptExecutor js = (JavascriptExecutor) driver;  
//	 js.executeScript("window.scrollBy(0,500)");
	 Thread.sleep(4000);
	
	 WebElement smsMenu= driver.findElement(By.xpath("//p[contains(text(),'Subscriptions')]"));	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", smsMenu);
		smsMenu.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(By.linkText("Add New")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		driver.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[2]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Select salutation = new Select(driver.findElement(By.name("salutation")));
		salutation.selectByVisibleText("Miss.");
		driver.findElement(By.name("first_name")).sendKeys("test");
		driver.findElement(By.name("last_name")).sendKeys("test2");
		driver.findElement(By.name("company")).sendKeys("testcompany");
		driver.findElement(By.name("display_name")).sendKeys("test test2");
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("9812365478");
		driver.findElement(By.name("phone")).sendKeys("41085558");
		driver.findElement(By.name("notes")).sendKeys("notes123456");
		Select payment = new Select(driver.findElement(By.name("salutation")));
		payment.selectByVisibleText("Miss.");
		
		

	

	
	
	
	
	
	

}
}
