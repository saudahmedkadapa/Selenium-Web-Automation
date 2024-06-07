import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.saucedemo.com");
		drive.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Saud Ahmed");
		drive.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("7447287866");
		
		//drive.switchTo().newWindow(WindowType.TAB);
		WebElement lb=drive.findElement(By.xpath("//*[@id=\"login-button\"]"));
		lb.click();
		drive.manage().window().maximize();
		drive.switchTo().newWindow(WindowType.WINDOW);
		
		
		
		

	}

}
