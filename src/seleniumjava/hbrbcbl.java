package seleniumjava;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hbrbcbl
{
	static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//	  driver.get("https://www.google.co.in/?gws_rd=ssl");
		//	  System.out.println(driver.manage().window().getPosition());
		//	  System.out.println(driver.manage().window().getSize());
		//	  driver.manage().window().setPosition(new Point(80,20));
		//	  Thread.sleep(5000);
		//	  driver.manage().window().setSize(new Dimension(500,500));
		//	  Thread.sleep(3000);
		//	  driver.quit();




		//    driver.get("https://github.com/login");
		//    driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		      driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");


		driver.findElement(By.xpath("//input[@name= \"commit\"]")).click();
		driver.findElement(By.xpath("//input[@name= \"commit\"]")).submit();                        // form option in html
		driver.findElement(By.xpath("//input[@id=\"login_field\"]")).sendKeys("hello",Keys.ENTER);
		driver.findElement(By.id("login_field")).submit();
		driver.findElement(By.xpath("//a[text()=\"Forgot password?\"]")).click();

		//	    driver.findElement(By.xpath("//input[@name= \"commit\"]")).click();
		//	    System.out.println(driver.findElement(By.xpath("(//div[normalize-space(.)=\"Incorrect username or password.\"])[3]")).getText());
		//      System.out.println(driver.findElement(By.xpath("(//div[normalize-space(.)=\"Incorrect username or password.\"])[3]")).isDisplayed());

		//	    driver.findElement(By.id("femalerb")).click();
		//	    WebElement female= driver.findElement(By.id("femalerb"));
		//	    if(!female.isSelected()) 
		//     {
		//		 female.click();
		//	   }
		
		
		//		   WebElement english=    driver.findElement(By.id("englishchbx"));
		//		   if(!english.isSelected())
		//	         {
		//				english.click();
		//			 }
		//		 
		//	    WebElement spanish=   driver.findElement(By.id("spanishchbx"));
		//	    spanish.click();                                                                     // check
		//	    Thread.sleep(3000);
		
		//             if(spanish.isSelected()) 
		//           {
		//		         spanish.click();                                                              //uncheck
		//	         }
		//	         else
		////		   System.out.println("unchecked");
		//	  
		//	  WebElement female= driver.findElement(By.id("femalerb"));
		//	   if(!female.isSelected()) {
		//		 female.click();
		//	   }
		//	  
		//	  
		//	  WebElement english= driver.findElement(By.id("englishchbx"));
		//	  checkOrUncheckElement(english,true);
		//	  
		//	  WebElement spanish= driver.findElement(By.id("spanishchbx"));
		//	  checkOrUncheckElement(spanish,true);
		//	  
		//	
		//	  
		//	   WebElement latin= driver.findElement(By.id("latinchbx"));
		//	   latin.click();
		//     checkOrUncheckElement(latin,false);
		//	   Thread.sleep(3000);
		
		
		//	  
		//     System.out.println( getcell(4,6));
		//	   driver.quit();
		        

		
		
	}
	     public static WebElement getcell(int rowIndex,int colIndex) {
	     return  driver.findElement(By.xpath("//table[@id=\"contactList\"]//tr[\"+rowIndex+\"]/td[\"+colIndex+\"]"));

	}
	public static void checkOrUncheckElement(WebElement element ,boolean targetState)
	{
		if(element.isSelected())
		{
			if(! targetState)
				element.click();
		}
		else 
		{
			if(targetState) {
				element.click();
			}
		}
	}
}