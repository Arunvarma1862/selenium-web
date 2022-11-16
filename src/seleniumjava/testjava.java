package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;



public class testjava {
	
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException 
	
	{
		//System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");      // driver executable set
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");

		//	 ChromeDriver cd = new ChromeDriver();
		//   WebDriver driver = new ChromeDriver();
		//   driver.get("https://www.google.co.in/?gws_rd=ssl");

		//	 System.setProperty("webdriver.gecko.driver","C:\\eckodriver-v0.30.0-win64\\geckodriver.exe");
		//	 FirefoxDriver fd = new FirefoxDriver();
		//	     
		//	     System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		//	     ChromeDriver driver = new ChromeDriver();
		//	     driver.manage().window().maximize();
		//	     driver.get("https://www.google.co.in/");
		//	     driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		//	     Thread.sleep(5000);
		//	      driver.close();
		//	    driver.quit();

		//    	 
		//    	 WebDriverManager.chromedriver().setup();
		//       WebDriver driver = new ChromeDriver();
		//    	 driver.get("https://www.google.co.in/");
		////	    


		//	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		//	  ChromeDriver driver = new ChromeDriver();
		//	  driver.manage().window().maximize();
		//	  driver.get("https://www.google.co.in/");
		//	 
		//	  driver.get("https://www.paypal.com/in/signin");
		//	  driver.findElement(By.id("email")).sendKeys("arunbabu");
		//	  Thread.sleep(5000);
		//	  driver.findElement(By.id("email")).clear();
		//	  Thread.sleep(5000);
		//	  driver.quit(); 



		//      System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		//      ChromeDriver driver = new ChromeDriver();
		//      
		//     
		//      driver.manage().window().maximize();
		//      driver.get("https://www.google.co.in/");
		//      driver.findElement(By.tagName("a")).click();
		//     
		//    driver.get("https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.co.in/&amp;ec=GAZAmgQ");
		//    driver.findElement(By.tagName("input")).sendKeys("arunbabu");
		//    Thread.sleep(5000);
		//    driver.findElement(By.tagName("input")).clear();

		//    driver.findElement(By.cssSelector("input[class=V67aGc]")).click();
		//    driver.findElement(By.xpath("//label[contains(text(),'VfPpkd-vQzf8d')]")).click();

		//     driver.findElement(By.name("q")).sendKeys("hello",Keys.ENTER);
		//     Thread.sleep(10000);
		//     driver.close();


		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		highLight(driver.findElement(By.id("login_field")));
		Thread.sleep(5000);
		driver.quit();

	}

	public static void highLight(WebElement element) 
	
	{
		JavascriptExecutor jsExcutor = (JavascriptExecutor)driver;

		jsExcutor.executeScript("document.getElementById('login_field').setAttribute ('style','border:10px solidred:background:yellow')");

	}
}

