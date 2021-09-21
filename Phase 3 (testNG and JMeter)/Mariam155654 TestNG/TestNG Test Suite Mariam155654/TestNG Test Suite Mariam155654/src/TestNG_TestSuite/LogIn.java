package TestNG_TestSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;



public class LogIn {
    
    //public static WebDriver driver=new ChromeDriver(); 
    public static WebDriver driver;

	  @BeforeMethod
	  public void beforeMethod() throws Exception {
		 	//download chromedriver.exe for ChromeDriver to work properly	
		    // System Property for Chrome Driver   
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\topgi\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        
		  driver = new ChromeDriver();
	      // Instantiate a ChromeDriver class to establish a connection       
	     
			//Puts an implicit wait, will wait for 10 seconds before throwing exception
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Launch Website
			driver.navigate().to("https://www.naukrigulf.com/");
			
			//Maximize the Browser
			driver.manage().window().maximize();
			
	  }
	  
  @Test
  public void main() throws InterruptedException{
	  try {
		//click on login on the navigation bar
		driver.findElement(By.xpath("//*[@id=\"ngHeader\"]/div/nav/div[5]/p")).click();
		
		//enter email id
		driver.findElement(By.id("loginModalLoginEmail")).sendKeys("mariammohamed3799@gmail.com");

		//enter password
		driver.findElement(By.id("loginPassword")).sendKeys("37993799");

		//click on Login button to submit
		driver.findElement(By.xpath("//*[@id=\"loginModalLoginSubmit\"]")).click();


		
		//assert element present
		//check if "Mariam Mohamed" element is in the page or no
		//Print Success Message to Console
		if(driver.findElement(By.xpath("//*[@id=\"ngMnjHome\"]/div[2]/div[2]/div[1]/a[1]/span[2]/span[1]")).isDisplayed()){
			System.out.println("Correct!");
		}else{
			System.out.println("Incorrect answer!");
		}	
	  }catch(Exception e) {
		  
	  }
  }


  @AfterMethod
  public void afterMethod() throws Exception {
	  
  }

}
