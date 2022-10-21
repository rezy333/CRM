package IPTV_new.CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class customer {
	@Test(priority = 1, enabled = true)
	public void CreateCustomer() {
		Login.login();
		WebDriver driver= Login.driver;
		if(driver==null) {
		System.out.println("driver is null");
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;  
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//html")).click();
		 
		   js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.linkText("Customer")).click();
		

	}
}
