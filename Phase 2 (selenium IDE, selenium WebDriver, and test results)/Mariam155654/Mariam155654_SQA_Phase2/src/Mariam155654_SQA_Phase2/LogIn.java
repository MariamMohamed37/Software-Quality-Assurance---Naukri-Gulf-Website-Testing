
package Mariam155654_SQA_Phase2;

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
	//public static WebDriver driver;
	
    public LogIn(){
        
    }
    
    public WebDriver login() throws InterruptedException{
    	

    	//download chromedriver.exe for ChromeDriver to work properly	
	    // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","C:\\Users\\topgi\\Downloads\\chromedriver_win32\\chromedriver.exe");  
          
        // Instantiate a ChromeDriver class to establish a connection       
        WebDriver driver=new ChromeDriver(); 
       
	
		//Puts an implicit wait, will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch Website
		driver.navigate().to("https://www.naukrigulf.com/");
		
		//Maximize the Browser
		driver.manage().window().maximize();
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

		//wait 60 seconds
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
        return driver;
        
	}
	   catch(Exception e) {
		   return driver;
	    }
	}
 
}

