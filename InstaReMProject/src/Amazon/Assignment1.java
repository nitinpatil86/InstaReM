package Amazon;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Assignment1 {
	public static WebDriver driver;
	@Test
		public void Testcase1() {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Goomo setup files\\Selenium setup files\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
		 
		 driver.get("http://www.amazon.in");
		 List<WebElement> image=driver.findElements(By.tagName("img"));	
		 System.out.println("total no.of images are--:"+image.size());
		 System.out.println(image.get(0).getText());
		 for(int i =0; i <image.size();i++){
			  
			  System.out.println(i + "."+image.get(i).getAttribute("src"));
		 
		 }
		 driver.quit();
	}
	}

