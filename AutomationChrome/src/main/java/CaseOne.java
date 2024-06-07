import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.saucedemo.com");
		drive.manage().window().maximize();
		drive.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Saudahmed");
		drive.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		WebElement lb=drive.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
		drive.switchTo().newwindow(windowType.TAB);
		lb.click();
		
		
		
		
		
		
		
		

	}

}
