package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textHandle {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("hello world k");
		Thread.sleep(3000);
		driver.findElement(By.id("login_field")).clear();
		Thread.sleep(5000);
		driver.close();


		//     WebElement usernametxt= driver.findElement(By.id("login_field"));
		//     if(usernametxt.isDisplayed()) 
		//     {
		//    	 if(usernametxt.isEnabled()) 
		// 	        {
		//    		 usernametxt.sendKeys("abcd");
		//    		 String enteredtxt= usernametxt.getAttribute("value");
		//    		 System.out.println(enteredtxt);
		//    		 Thread.sleep(5000);
		//    		 usernametxt.clear();
		//           driver.quit();
		//    		 
		//      	 }
		//    	 else
		//    		 System.err.println("username textbox is not enabled");
		//     }
		//     else
		//    	System.out.println("username textbox is not displayed  ") ;
	}
}

