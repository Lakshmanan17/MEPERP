package ERP_StepDefinition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ERP_login {
	
	  
    public static WebDriver driver;       
    public final static int TIMEOUT = 10;
	@Before
    public void setUp() {
 
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
       Set<String> windowHandles= driver.getWindowHandles();
  	 System.out.println("Window_id"+ windowHandles );

    }
 

	@Given("User is on ERP login {string}")
	public void user_is_on_erp_login(String url) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	    
	}
	@When("user enter usename as {string} and password as {string}")
	public void user_enter_usename_as_and_password_as(String userNAME, String passWORD) {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement username= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mat-input-0']")));
	               username.sendKeys(userNAME);
	     WebElement password= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mat-input-1']")));
	               password.sendKeys(passWORD);
	               
	
	}
	@Then("user able to see the message {string}")
	public void user_able_to_see_the_message(String Message) {
	    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/div/form/button")).click();
	 System.out.println("Login page with"+ Message );
	}

}
