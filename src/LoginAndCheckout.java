import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAndCheckout {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	
	public void Setup ( ) {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	
	}
	
	
	@Test(priority = 1 )
	public void Log_in () throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
	}
	@Test(priority = 2)
	public void Add_tocart() throws InterruptedException {
		
		Thread.sleep(2000);

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();;
	}
	@Test(priority = 2)
	public void add_tocart() throws InterruptedException {
		
		Thread.sleep(2000);

		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();;
	}
	@Test(priority=3)
	public void CheckoutProcess() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.id("shopping_cart_container")).click();
		
	}
}
