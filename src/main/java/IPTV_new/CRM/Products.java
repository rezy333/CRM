package IPTV_new.CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Products {
	@Test(priority = 1, enabled = true)
	public void CreatProduct() {
		Login.login();
		WebDriver driver= Login.driver;
		if(driver==null) {
		System.out.println("driver is null");
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement e = driver.findElement(By.xpath("//*[text()='Products']"));
		e.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		
	
		driver.findElement(By.id("ember301")).sendKeys("Product1");
		driver.findElement(By.id("ember302")).sendKeys("Product Description");
		driver.findElement(By.id("ember304")).sendKeys("product@gmail.com");
		driver.findElement(By.id("ember323")).sendKeys("www.google.com");
		driver.findElement(By.id("name")).sendKeys("admin");
//		driver.findElement(By.id("select2-role_id-container")).click();
//		driver.findElement(By.xpath("//li[text()='netmaxtechnology']")).click();
//		
//		Select se = new Select(driver.findElement(By.xpath("//*[@id='group_id']")));
//		se.selectByIndex(2);
//		JavascriptExecutor js = (JavascriptExecutor) driver;  
//		 
//		   js.executeScript("window.scrollBy(0,1000)");
//		   
//		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
//		

		
	
		
		
	}

}
