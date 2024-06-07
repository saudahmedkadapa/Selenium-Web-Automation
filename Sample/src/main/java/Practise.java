import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise {

	public static void main(String[] args)  {
	
		WebDriverManager .edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		//driver.get("https://www.google.com/");
		
//		driver.get("https://www.youtube.com");
		
		
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("HelloWorld");
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		driver.get("https://www.cricbuzz.com/");
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.programiz.com/cpp-programming/online-compiler/");
//		
	
		
		
		
		
		

	}

}
