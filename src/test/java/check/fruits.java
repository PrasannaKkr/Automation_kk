package check;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class fruits {
	
	@Test
	public void fruits() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		String baseurl = "http://demo.guru99.com/test/newtours/register.php";
//		driver.get(baseurl);
	//	
//		Select drpcountry = new Select(driver.findElement(By.name("country")));
//		drpcountry.selectByVisibleText("ANTARCTICA");
		
		//selecting items in a Multiple SELECT  elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(2);
		fruits.deselectByVisibleText("Banana");
		fruits.deselectByIndex(2);
	   System.out.println(fruits.isMultiple());
		
	}
}
