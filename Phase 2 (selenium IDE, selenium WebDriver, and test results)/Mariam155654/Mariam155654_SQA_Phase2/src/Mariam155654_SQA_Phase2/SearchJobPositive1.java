
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



public class SearchJobPositive1 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

	
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
		//because "no such element: unable to locate element" error 
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/main/div[1]/div[1]/div")));
		
		//click on search button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div[1]/div[1]/div")).click();
		
		//enter software engineer in keywords
		driver.findElement(By.xpath("//*[@id=\"qsbKey\"]")).sendKeys("software engineer");

		//enter UAE in location
		driver.findElement(By.xpath("//*[@id=\"qsbLoc\"]")).sendKeys("UAE");

		//enter 2 years in work experience
		driver.findElement(By.xpath("//*[@id=\"qsbExp\"]")).sendKeys("2 Years");
		
		//click on "Search Jobs" button
		driver.findElement(By.xpath("//*[@id=\"ngQsbForm\"]/input")).click();

		
		
		//wait until the element of the search page appeared then check in if conditions
		WebDriverWait waitt = new WebDriverWait(driver, 10);
		waitt.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/main/div/section[2]/div[1]/form/div[1]/p")));
	
		
		
		
		
		



		
		//check if "Refine Search" element is displayed
		//also check if filter industry type button is enabled
		//also check if the title of the webpage contains "Software Engineer Jobs in Uae"
		if(driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section[2]/div[1]/form/div[1]/p")).isDisplayed()
		    && driver.findElement(By.xpath("//*[@id=\"filterindustryType\"]/div/label[2]/span[2]")).isEnabled()
		    && driver.getTitle().contains("Software Engineer Jobs in Uae")){
			System.out.println("Correct!");
		}else{
			System.out.println("Incorrect answer!");
			System.out.println(driver.getTitle());
		}
		

		
		//Finally you must Close and Quit the Browser
		driver.close();
		driver.quit();
	}catch(Exception e) {
		
	}
}
}
