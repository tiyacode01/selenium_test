package automationtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.Assert;			
import org.testng.annotations.Test;		

public class TestCases {				
		WebDriver driver= new ChromeDriver();					

		// Test to pass as to verify listeners .		
		@Test		
		public void Login() throws InterruptedException				
		{		
		    driver.get("http://demo.guru99.com/V4/");					
		    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
		    driver.findElement(By.name("password")).sendKeys("amUpenu");							
		    driver.findElement(By.name("btnLogin")).click();
		    Thread.sleep(3000);
		    Alert alert = driver.switchTo().alert();
		    String alertMessage = driver.switchTo().alert().getText();
		    System.out.println(alertMessage);
		    Thread.sleep(3000);
		    alert.accept();
		}		

		// Forcefully failed this test as to verify listener.		
//		@Test		
//		public void TestToFail() throws InterruptedException				
//		{		
//		    System.out.println("This method to test fail");					
//		    Assert.assertTrue(false);			
//		}
//		

}