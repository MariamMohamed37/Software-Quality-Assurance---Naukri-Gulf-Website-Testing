
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



public class EditProfileProfileSummarySection {
	public static WebDriver driver;
	
	//last class in the test suite should have the main function 
	public static void main(String[] args) throws InterruptedException {

	
	    // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","C:\\Users\\topgi\\Downloads\\chromedriver_win32\\chromedriver.exe");  
          
        
        //to execute EditProfileEducationSection function before this function
        EditProfileEducationSection ed=new EditProfileEducationSection();
        WebDriver driver=ed.editProfileEducationSection();
       
        //wait 73 seconds
        driver.manage().timeouts().implicitlyWait(73, TimeUnit.SECONDS);
        
		//Puts an implicit wait, will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch Website
		driver.navigate().to("https://www.naukrigulf.com/");
		
		//Maximize the Browser
		driver.manage().window().maximize();

		
		
		try {

		//click on view and edit profile
		driver.findElement(By.xpath("//*[@id=\"ngMnjHome\"]/div[2]/div[2]/div[1]/div/a")).click();
	
		//click on Profile Summary
		driver.findElement(By.xpath("//*[@id=\"profileSummary\"]/button")).click();
		
		//click on edit button
		driver.findElement(By.xpath("//*[@id=\"formNavbar\"]/div/button[7]")).click();
		

		//wait until the profileSummary element is visible
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.id("profileSummary")));

		//enter profile summary words
		//i solved "element not interactable" error by putting full xpath not xpath by itslef		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/section[7]/form/div/div/textarea")).sendKeys(" Software Qualityy assurance, Hard Worker");


		//click on save button
		driver.findElement(By.xpath("//*[@id=\"profileSummaryForm\"]/button[1]")).click();

		
		//click on edit button
		driver.findElement(By.xpath("//*[@id=\"formNavbar\"]/div/button[7]")).click();

		

		
		//check if the field contains what I have just entered
		//and if the element do not have text 999 "characters remaining" which means I didn't enter anything
		//and if Popup in the left bottom of the page appear for 2 seconds saying “Profile updated successfully!” is displayed
		if(driver.findElement(By.xpath("//*[@id=\"profileSummary\"]/p[3]")).getText().contains(" Software Qualityy assurance, Hard Worker")
				&& driver.findElement(By.xpath("xpath=//form[@id='profileSummaryForm']/div/div/p")).getText() != "999 characters remaining"
				&& driver.findElement(By.xpath("//*[@id=\"react-toast\"]/span[4]/div/div/div/div")).isDisplayed()){
			//Print Success Message to Console
			System.out.println("Correct!");
		}else{
			System.out.println("Incorrect answer!");
		}		

		
		//click on save button
		driver.findElement(By.xpath("//*[@id=\"profileSummaryForm\"]/button[1]")).click();
		

		
		//Finally you must Close and Quit the Browser
		driver.close();
		driver.quit();
		}catch(Exception e) {
			
		}
		}
}
