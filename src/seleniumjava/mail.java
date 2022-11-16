package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class mail {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//   driver.get("https://www.google.co.in/");
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//    driver.findElement(By.xpath("//a[@class=\"gb_d\"]")).click();
		Thread.sleep(3000);
		//   driver.findElement(By.xpath("//input[@class=\"whsOnd zHQkBf\" and@ type=\"text\"]")).sendKeys("arunbabu");
		driver.findElement(By.id("identifierId")).sendKeys("arunbabu120894");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=\"VfPpkd-vQzf8d\"]")).click();
		Thread.sleep(3000);

	}
}
