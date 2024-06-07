import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseSelenium {

	public static void main(String[] args) {
		
		WebDriverManager .chromedriver().setup();
		
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.google.co.in/");
		
		dr.manage().window().maximize();
		
		dr.switchTo().newWindow(WindowType.TAB);
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().getPosition();
	dr.findElement(By.xpath("//*[@data-test=\"username\"]")).sendKeys("Saud Ahmed");
		dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123");
		
		
		
//		dr.switchTo().newWindow(WindowType.WINDOW);
//		dr.manage().window().minimize();
//		dr.get("https://www.indiabix.com/");
		
		//dr.manage().window().minimize();
		
		
						
		
		
		
		
	
		
		
		

	}

}
