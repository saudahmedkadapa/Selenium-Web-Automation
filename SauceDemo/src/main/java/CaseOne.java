import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaseOne {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver= new ChromeDriver();                        
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@name=\"user-name\"]")).sendKeys("kadapasaud@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.manage().window().maximize();
		
		
		

	}

}
