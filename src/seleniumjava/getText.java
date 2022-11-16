package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
      public static void main(String[] args) throws InterruptedException
      {
    	  
    	  
    	//System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
//    	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
    	  
//		  ChromeDriver driver = new ChromeDriver();
//		  driver.get("https://github.com/login");
//		  driver.manage().window().maximize();
//		  System.out.println( driver.findElement(By.tagName("h1")).getText());
//		  Thread.sleep(5000);
//		  driver.quit();
//		  
    	  
    	  
//    	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
//		  ChromeDriver driver = new ChromeDriver();
//		  driver.get("https://github.com/login");
//		  driver.manage().window().maximize();
//		  System.out.println( driver.findElement(By.tagName("label")).getText());
//		  Thread.sleep(5000);
//		  driver.quit();
    	  
//    	  
//    	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
//		  ChromeDriver driver = new ChromeDriver();
//		  driver.get("https://github.com/login");
//		  driver.manage().window().maximize();
//		  WebElement usernametxt = driver.findElement(By.id("login_field"));
//		  usernametxt.sendKeys("arunbabu");
//		  Thread.sleep(5000);
//		  usernametxt.clear();
//		  Thread.sleep(5000);
//		   driver.quit();
    	  
    	  
    	  
//
//    	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
//		  ChromeDriver driver = new ChromeDriver();
//		  driver.get("https://github.com/login");
//		  driver.manage().window().maximize();
//		  System.out.println( driver.findElement(By.linkText("Forgot password?")).getText());
//		  Thread.sleep(5000);
//		  driver.quit();
    	  

//
//    	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
//		  ChromeDriver driver = new ChromeDriver();
//		  driver.get("https://github.com/login");
//		  driver.manage().window().maximize();
//		  System.out.println( driver.findElement(By.partialLinkText("Forgot pass")).getText());
//		  Thread.sleep(5000);
//		  driver.quit();
    	  
    	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
	       driver.get("https://github.com/login");
		  driver.manage().window().maximize();
		  System.out.println( driver.findElement(By.xpath("//label[normalize-space(text())=\"Password\"]")).getText());
		  Thread.sleep(5000);
		  driver.quit();
    	  
    	  
    	  
//
//    	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
//		  ChromeDriver driver = new ChromeDriver();
//		  driver.get("https://github.com/login");
//		  driver.manage().window().maximize();
//		   WebElement usernametxt= driver.findElement(By.name("login"));
//		   usernametxt.sendKeys("arunbabu");
//		   System.out.println(usernametxt.getAttribute("value"));
//		  Thread.sleep(5000);
//		  usernametxt.clear();
//		  Thread.sleep(5000);
//		  driver.quit();
//		  
		  
////
//    	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
//		  ChromeDriver driver = new ChromeDriver();
//		  driver.get("https://github.com/login");
//		  driver.manage().window().maximize();
//		  WebElement usernametxt= driver.findElement(By.name("login"));
//		  WebElement hidden= driver.findElement(By.name("ga_id"));
//    	  System.out.println(usernametxt.isDisplayed());
//    	  System.out.println(hidden.isDisplayed());
//    	  usernametxt.sendKeys("hello hii");
//    	  System.out.println(usernametxt.getAttribute("value"));
//    	  Thread.sleep(5000);
//    	  usernametxt.clear();
//    	  Thread.sleep(5000);
//    	  driver.close();
//    	  
    	  
//    	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
//		  ChromeDriver driver = new ChromeDriver();
//		  driver.manage().window().maximize();
//		  driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
//		  Thread.sleep(3000);
//		  driver.findElement(By.id("femalerb")).click();
//		  Thread.sleep(3000);
//		  driver.findElement(By.id("englishchbx")).click();
//		  Thread.sleep(3000);
//		  WebElement hindichk= driver.findElement(By.id("hindichbx"));
//		  hindichk.click();
//		  Thread.sleep(3000);
//		  if(hindichk.isSelected()) 
		  {
//			  hindichk.click();
//		  }
//		  Thread.sleep(3000);
//		  driver.findElement(By.id("registerbtn")).click();
//		  Thread.sleep(3000);
//		  driver.findElement(By.linkText("Click here to navigate to the home page")).click();
//		  Thread.sleep(5000);
//		  driver.close();
//		  
		    	  
		  
	}
      }   
}
