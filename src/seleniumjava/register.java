package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		  ChromeDriver  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		  driver.get("https://www.google.co.in/?gws_rd=ssl");
		  driver.findElement(By.xpath("(//input[1])[1]")).sendKeys("hiii",Keys.ENTER);
		  
//		  driver.findElement(By.id("firstName")).sendKeys("rahul");
//		  Thread.sleep(2000);
//		  driver.findElement(By.xpath("//input[@class=\"bcTextBox\" and @name=\"lName\"]")).sendKeys("kumar");
//		  Thread.sleep(2000);
//		  driver.findElement(By.id("femalerb")).click();
//		  Thread.sleep(2000);
//		  driver.findElement(By.xpath("//input[@name=\"language\" and @class=\"bcCheckBox\"][1]")).click();
//		  Thread.sleep(2000);
//		  driver.findElement(By.xpath("//input[@name=\"language\" and @class=\"bcCheckBox\"][2]")).click();
//		  Thread.sleep(2000);
//		  driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]")).sendKeys("rahulkumar55555");
//		  Thread.sleep(2000);
//		  driver.findElement(By.xpath("(//input[normalize-space(@placeholder=\"Enter Password\")])[12]")).sendKeys("rahul12345");
//		  Thread.sleep(2000);
//		  driver.findElement(By.xpath("//button[text()='Register']")).click();
//		  Thread.sleep(2000);
//		  driver.findElement(By.linkText("Click here to navigate to the home page")).click();
//		  
		  Thread.sleep(5000);
		  driver.quit();
	}
}
