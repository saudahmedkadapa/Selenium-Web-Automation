import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
public class Practise {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com");

        driver.manage().window().maximize();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        
        username.sendKeys("himanshu@gmail.com");
        try {
    			Thread.sleep(1000);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
//        try {
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        
        password.sendKeys("123456");
        try {
    			Thread.sleep(1000);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        WebElement lb=driver.findElement(By.xpath("//input[@value='Log In']"));
      lb.click();
        

      

//        Optional: Close the browser
        driver.quit();
	}
}