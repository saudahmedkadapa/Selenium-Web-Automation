import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.applitools.com/");
		
		
		driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input")).sendKeys("danishshaikhenus@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("123456");
		
		

	}

}
