package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	  static ChromeDriver driver;
      public static void main(String[] args) throws InterruptedException {
      
  	           System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
               driver = new ChromeDriver();
               driver.manage().window().maximize();
        
//             driver.get("https://github.com/login");
               driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//             driver.get("https://www.google.co.in/?gws_rd=ssl");
//             driver.get("https://www.facebook.com/");
          
//             highLight(driver.findElement(By.id("login_field")));
          
//     WebElement username=driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[4]/form/input[2]"));
//     Thread.sleep(3000);
          
//     WebElement signIn=driver.findElement(By.xpath("//input[@name=\"commit\"]"));
//     WebElement signIn=driver.findElement(By.xpath("//input[@class=\"btn btn-primary btn-block js-sign-in-button\"]"));
//     WebElement signIn=driver.findElement(By.xpath("//input[@id=\"login_field\"]"));
//     WebElement username= driver.findElement(By.xpath("/html//body/div[3]/main/div[1]/div[4]/form/input[2]"));
//     WebElement username= driver.findElement(By.xpath("//a[@class=\"label-link position-absolute top-0 right-0\"]"));
//     WebElement username= driver.findElement(By.xpath("(//label)[last()]"));
//     WebElement username= driver.findElement(By.xpath("(//label)[last()]"));
//     WebElement username= driver.findElement(By.xpath(("(//table[@id=\"contactList\"]/tbody/tr[7]/td)[2]")));
                                           //                (//table[@id="contactList"]/tbody/tr)[last()]/td[2]
        
//     WebElement username = driver.findElement(By.xpath("//input[@name=\"name\" and @maxlength=10]"));
//     WebElement username= driver.findElement(By.xpath("//input[@type=\"submit\"]"));
//          
//     highLight(driver.findElement(By.xpath("//a[text()='Sign in into account']")));
       highLight(driver.findElement(By.xpath("//button[text()=\"Reset\"]")));
//          
//     highLight(driver.findElement(By.xpath("//label[contains(text(),'Name')]")));
//     highLight(driver.findElement(By.xpath("//input[contains(@type,'mit')]")));
//          
//     highLight(driver.findElement(By.xpath("//label[starts-with(text(),'Repeat')]")));
//    highLight(driver.findElement(By.xpath("//div[starts-with(@class,'conta')]")));
//     highLight(driver.findElement(By.xpath("(//table[@id=\"contactList\"]/tbody/tr)[position()=2]")));
//     highLight(driver.findElement(By.xpath("(//table[@id=\"contactList\"]/tbody/tr)[last()]/td[2]")));
//     highLight(driver.findElement(By.xpath("//h1[normalize-space(text())='XPath Practice']")));
//     highLight(driver.findElement(By.xpath("//table[@id='contactList']")));
//     WebElement username =driver.findElement(By.xpath("//input[starts-with(@class,\"inputtext _55r1 _6luy _\")]"));
 //      WebElement username =driver.findElement(By.xpath("//label[normalize-space(text())=\"First Name\"]/following::div[3]/child::button[3]/following::input[@type=\"submit\"]"));
       
//     username.click();
 //      highLight(username);
       
//     username.sendKeys("ab");
//     Thread.sleep(3000);
//     username.clear();
//     highLight(username);
//     highLight(signIn);
       Thread.sleep(5000);
       driver.quit();
        
    }
        
         public static void highLight(WebElement element) 
         {
      	 JavascriptExecutor jsExcutor = (JavascriptExecutor)driver;
      	
      	 jsExcutor.executeScript("arguments[0].setAttribute ('style','border:5px solid red;background:yellow')",element);
         
	}
}
