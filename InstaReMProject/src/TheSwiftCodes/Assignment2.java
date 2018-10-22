package TheSwiftCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment2 {
	  
		public static String url;
		public static WebDriver driver;
		public static String excptedBankName,ActualBankName,SwiftCodes;	

		@Test


		public void TestCase2() throws InterruptedException {
			
			url="https://www.theswiftcodes.com/malaysia/";
		
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Goomo setup files\\Selenium setup files\\geckodriver-v0.20.1-win64\\geckodriver.exe");		
	
		   driver=new FirefoxDriver();
			
			driver.get(url);
			Thread.sleep(4000);
			
			List<WebElement> tableRows = driver.findElements(By.xpath("//table//tr"));

			for (int i= 0 ; i < tableRows.size(); i ++){
				List<WebElement> cells = tableRows.get(i).findElements(By.tagName("td"));
				for(int j = 0 ; j < cells.size(); j++){

					if (j == 1)
						System.out.print("Bank Name : " + cells.get(j).getText());
					if (j == 4)
						System.out.print("\t"+"Swift Code : " + cells.get(j).getText());
				}
				System.out.println();
			}

			driver.quit();
		}

	}
	
