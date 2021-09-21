
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
import org.openqa.selenium.Keys;



public class EditProfileEducationSection {
	public EditProfileEducationSection() {
		
	}
	
	public WebDriver editProfileEducationSection()  throws InterruptedException{
		
	    // System Property for Chrome Driver   
	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 

	    //to execute EditProfileProfessionalSection before this function
	    EditProfileProfessionalSection ed=new EditProfileProfessionalSection();
        WebDriver driver=ed.editProfileProfessionalSection();
        
        
        //wait 73 seconds
		driver.manage().timeouts().implicitlyWait(73, TimeUnit.SECONDS);

		
		//WebDriver driver = LogIn.driver;
        Actions actions = new Actions(driver);
	
		
		//Launch Website
		driver.navigate().to("https://www.naukrigulf.com/");
		
		//Maximize the Browser
		driver.manage().window().maximize();
	
		
		//wait 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	try {	
		//click on view and edit profile
		driver.findElement(By.xpath("//*[@id=\"ngMnjHome\"]/div[2]/div[2]/div[1]/div/a")).click();
		
		//click on education
		driver.findElement(By.xpath("//*[@id=\"formNavbar\"]/div/button[6]")).click();
		
		//click on add button
		driver.findElement(By.xpath("//*[@id=\"education\"]/button")).click();
		
		// wait 50 seconds until the form is loaded
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		

		//in qualification dropdown menu, select Basic
		//put qualification feild in web element variable
		WebElement ww = driver.findElement(By.id("qualification"));
		//write Basic in the feild so that Basic option appears at the first of the list
		ww.sendKeys("Basic");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//click down arrow of the pc mouse
		ww.sendKeys(Keys.ARROW_DOWN);
		//click enter button of the pc mouse
		ww.sendKeys(Keys.ENTER);
		ww.sendKeys(Keys.ENTER);
		//I just was checking if the previous buttons are working, 
		//i have F2 in my pc to lower brightness, this code doesn't do that but it helped in 
		//Achieving my goal so I let it (it helped in pining the answers in the form). 
		ww.sendKeys(Keys.F2);
		ww.sendKeys(Keys.F2);
		ww.sendKeys(Keys.F2);

		//just click any where in the education form to pin the answer 
		driver.findElement(By.xpath("//*[@id=\"education\"]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"education\"]/div[1]")).click();
		
		//wait 50 seconds 
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		

		// in course drop down menu, select the 3rd option
		//put course feild in web element variable
		WebElement www = driver.findElement(By.id("courseEdu"));	
		//click down arrow 3 times of the pc mouse
	    www.sendKeys(Keys.ARROW_DOWN);
	    www.sendKeys(Keys.ARROW_DOWN);
		//click enter button of the pc mouse
		www.sendKeys(Keys.ENTER);
		//I just was checking if the previous buttons are working, 
		//i have F2 in my pc to lower brightness, this code doesn't do that but it helped in 
		//Achieving my goal so I let it (it helped in pining the answers in the form). 
		ww.sendKeys(Keys.F2);
		ww.sendKeys(Keys.F2);
		ww.sendKeys(Keys.F2);
		
		//just click any where in the education form to pin the answer 
		driver.findElement(By.xpath("//*[@id=\"education\"]/div[1]")).click();
		
		//wait 70 seconds
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		
		// in Specialization drop down menu, select the first option 
		//put Specialization feild in web element variable
		WebElement f = driver.findElement(By.id("specEdu"));
		//click down arrow of the pc mouse
		f.sendKeys(Keys.ARROW_DOWN);
		//click enter button of the pc mouse
		f.sendKeys(Keys.ENTER);
		//I just was checking if the previous buttons are working, 
		//i have F2 in my pc to lower brightness, this code doesn't do that but it helped in 
		//Achieving my goal so I let it (it helped in pining the answers in the form). 
		f.sendKeys(Keys.F2);
		f.sendKeys(Keys.F2);
		f.sendKeys(Keys.F2);
		
		
		//wait 50 seconds
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//write BUE at institute Name feild
		driver.findElement(By.id("instituteName")).sendKeys("BUE");
		
		
		// in location drop down menu, select Egypt option
		//put institute location feild in web element variable
		WebElement ff = driver.findElement(By.id("instituteLoc"));
		//write Egypt in the feild so that Egypt appears at the first of the list
		ff.sendKeys("Egypt");
		//click down arrow of the pc mouse
		ff.sendKeys(Keys.ARROW_DOWN);
		//click enter button of the pc mouse
		ff.sendKeys(Keys.ENTER);
		//I just was checking if the previous buttons are working, 
		//i have F2 in my pc to lower brightness, this code doesn't do that but it helped in 
		//Achieving my goal so I let it (it helped in pining the answers in the form). 
		ff.sendKeys(Keys.F2);
		ff.sendKeys(Keys.F2);
		ff.sendKeys(Keys.F2);
		
		
		//wait 50 seconds
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//write in passing year feild 2021
		driver.findElement(By.id("passingYear")).sendKeys("2021");

		
		//click save button	
		driver.findElement(By.xpath("//*[@id=\"educationForm\"]/button[1]")).click();
		
		//wait 50 seconds
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		
		//click edit button to check the feilds values
		driver.findElement(By.xpath("//*[@id=\"education\"]/div[1]/div/div/button")).click();

		//check if value of passing year feild is 2021
		//and if there is enabled button to remove the education, it can't be existed without passing adding education
		//and if Popup in the left bottom of the page appear for 2 seconds saying “Details updated successfully!” is displayed
		if("2021" == driver.findElement(By.id("passingYear")).getAttribute("value")
				&& driver.findElement(By.xpath("//*[@id=\"educationForm\"]/button[2]")).isEnabled()
				&& driver.findElement(By.xpath("//*[@id=\"react-toast\"]/span[4]/div/div/div/div/bdi/div")).isDisplayed())
		{
			//Print Success Message to Console
			System.out.println("Correct!");
			
		}else{
		//if i'm wrong in predecting the passing year value, print the actual one in the console.
			System.out.println("Incorrect answer!");
			System.out.println(driver.findElement(By.id("passingYear")).getAttribute("value"));
		}		
	

		
		//click save button	
		driver.findElement(By.xpath("//*[@id=\"educationForm\"]/button[1]")).click();
		
		//wait 73 seconds
		driver.manage().timeouts().implicitlyWait(73, TimeUnit.SECONDS);
		
		return driver;
	}catch(Exception e) {
		return driver;
	}

	}
}
