//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//
//public class LoginDemoSteps {
//	WebDriver  driver = null;
//	@Given("Browser is open")
//	public void browser_is_open() {
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    
//	}
//
//	@And("User is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//
//	}
//
//	@When("User enters username and password")
//	public void user_enters_username_and_password() throws InterruptedException {
//		driver.findElement(By.id("name")).sendKeys("name1");
//		driver.findElement(By.id("password")).sendKeys("12345");
//		Thread.sleep(2000);
//		
//
//	}
//	@And("User clicks on login")
//	public void user_clicks_on_login() {
//		driver.findElement(By.id("login")).click();
//
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		driver.findElement(By.id("logout")).isDisplayed();
//		driver.close();
//
//	}
//
//
//}
