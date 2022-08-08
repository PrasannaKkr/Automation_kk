package check;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void newone() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseurl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = " ";

		driver.get(baseurl);
		driver.findElement(By.name("userName")).sendKeys("prasanna kkr");
		actualTitle = driver.getTitle();
	  
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
		driver.close();
		}
}
