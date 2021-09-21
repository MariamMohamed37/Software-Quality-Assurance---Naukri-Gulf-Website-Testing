package TestNG_TestSuite;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class EditProfileProfessionalSection extends LogIn{
    //public static WebDriver driver=new ChromeDriver(); 
	//WebDriver driver;
	//WebDriver driver=new ChromeDriver(); 
	//Actions actions = new Actions(driver);
  @Test
  public void main() throws InterruptedException{
	  try {
		//click on view and edit profile
		driver.findElement(By.xpath("//*[@id=\"ngMnjHome\"]/div[2]/div[2]/div[1]/div/a")).click();
		
		//click on professional
		driver.findElement(By.xpath("//*[@id=\"formNavbar\"]/div/button[3]")).click();
		
		//click on edit icon
		driver.findElement(By.xpath("//*[@id=\"professional\"]/div[1]/span[1]")).click();
	
		
		
		//in Total Work Experience field, clear what was written before
		driver.findElement(By.xpath("//*[@id=\"totalExperience\"]")).clear();
		//enter years number in Total Work Experience field
		driver.findElement(By.xpath("//*[@id=\"totalExperience\"]")).sendKeys("3");

		//in Total Work Experience second field, clear what was written before
		driver.findElement(By.xpath("//*[@id=\"totalExperienceMonths\"]")).clear();
		//enter months number in Total Work Experience second field
		driver.findElement(By.xpath("//*[@id=\"totalExperienceMonths\"]")).sendKeys("7");
		
	
		
		// in industry Type drop down menu, select IT - Software services option
		//put industryType feild in web element variable
		WebElement ff = driver.findElement(By.id("industryType"));
		//click on the feild
		ff.click();
		//write IT -  in the feild so that IT options appears at the first of the list
		ff.sendKeys("IT - ");
		//wait 1 seconds until the result of IT appears
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//click down arrow of the pc mouse to choose IT - Software Services option
		ff.sendKeys(Keys.ARROW_DOWN);
		ff.sendKeys(Keys.ARROW_DOWN);
		ff.sendKeys(Keys.ARROW_DOWN);
		//click enter button of the pc mouse
		ff.sendKeys(Keys.ENTER);
		//I just was checking if the previous buttons are working, 
		//i have F2 in my pc to lower brightness, this code doesn't do that but it helped in 
		//Achieving my goal so I let it (it helped in pining the answers in the form). 
		ff.sendKeys(Keys.F2);
		ff.sendKeys(Keys.F2);
		ff.sendKeys(Keys.F2);
		
		
		//click anywhere in the form to solve element intercepted error
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/section[3]/div[1]/form")).click();

		//wait 20 seconds
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
		
		// in functional Area drop down menu, select IT - Software services option
		//put functional Area feild in web element variable
		WebElement fff = driver.findElement(By.id("functionalArea"));
		//click on the feild
		fff.click();
		//write IT Software  in the feild so that IT Software option appears at the first of the list
		fff.sendKeys("IT Software");
		//click down arrow of the pc mouse to choose ERP / CRM (IT Software)
		fff.sendKeys(Keys.ARROW_DOWN);
		fff.sendKeys(Keys.ARROW_DOWN);
		//click enter button of the pc mouse
		fff.sendKeys(Keys.ENTER);
		//I just was checking if the previous buttons are working, 
		//i have F2 in my pc to lower brightness, this code doesn't do that but it helped in 
		//Achieving my goal so I let it (it helped in pining the answers in the form). 
		fff.sendKeys(Keys.F2);
		fff.sendKeys(Keys.F2);
		fff.sendKeys(Keys.F2);
		
		//click anywhere in the form to solve element intercepted error
		driver.findElement(By.xpath("//*[@id=\"professionalForm\"]")).click();
		
		//wait 50 seconds
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//click anywhere in the form to solve element intercepted error
		driver.findElement(By.xpath("//*[@id=\"professionalForm\"]")).click();

		// in Current Work Level, which is button should be clicked to edit it and click another button
		//click already appeared button
		driver.findElement(By.cssSelector("#professionalForm > div:nth-child(4) > label.check-pill.display-true > span")).click();
		//wait 2 seconds until other buttons appear
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//click Managerial button
		driver.findElement(By.xpath("//*[@id=\"professionalForm\"]/div[4]/label[4]/span")).click();

		
		
		//monthly salary money type
		// in monthly salary drop down menu, select IT - Software services option
		//put currency feild in web element variable
		WebElement aa = driver.findElement(By.id("currency"));
		aa.click();
		//click down arrow of the pc mouse to choose UAE dirhams
		aa.sendKeys(Keys.ARROW_DOWN);
		aa.sendKeys(Keys.ARROW_DOWN);
		aa.sendKeys(Keys.ARROW_DOWN);
		//click enter button of the pc mouse
		aa.sendKeys(Keys.ENTER);
		//I just was checking if the previous buttons are working, 
		//i have F2 in my pc to lower brightness, this code doesn't do that but it helped in 
		//Achieving my goal so I let it (it helped in pining the answers in the form). 
		aa.sendKeys(Keys.F2);
		aa.sendKeys(Keys.F2);
		aa.sendKeys(Keys.F2);
		
		
		
		//change salary value
		//clear what was written before
		driver.findElement(By.id("salaryAmt")).clear();
		//write the new value
		driver.findElement(By.id("salaryAmt")).sendKeys("4000");
		
		
		//availability to join
		// in availability to join, which is button should be clicked to edit it and click another button
		//click already appeared button
		driver.findElement(By.cssSelector("#professionalForm > div:nth-child(6) > label.check-pill.display-true > span")).click();
		//wait 2 seconds until other buttons appear
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//choose 3 months
		driver.findElement(By.xpath("//*[@id=\"professionalForm\"]/div[6]/label[4]/span")).click();

		
		//wait 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//click save button	
		driver.findElement(By.xpath("//*[@id=\"professionalForm\"]/button[1]")).click();
		
		
		
		
		
		//assert value
		//Print Success Message to Console
		//check if salary feild have the value that i just updated
		//and check if industryType feild have the value that i just updated
		//and check if Popup in the left bottom of the page appear for 2 seconds saying “Profile updated successfully!” is displayed in the page
		if("4000" == driver.findElement(By.id("salaryAmt")).getAttribute("value")
				&& "IT - Software Services" == driver.findElement(By.id("industryType")).getAttribute("value")
				&& driver.findElement(By.xpath("//*[@id=\"react-toast\"]/span[4]/div/div/div/div")).isDisplayed()){
			System.out.println("Correct!");
			
		}else{
			System.out.println("Incorrect answer!");
			//if i'm wrong in predicting the values, print the actual ones in the console.
			System.out.println(driver.findElement(By.id("salaryAmt")).getAttribute("value"));
			System.out.println(driver.findElement(By.id("industryType")).getAttribute("value"));
		}
			
		}catch(Exception e) {
	  }
  }
  @BeforeMethod
  public void beforeMethod() throws Exception{

		// System Property for Chrome Driver 
	//   System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		//  driver = new ChromeDriver();

	    //to execute login funciton before this function 
      //LogIn log=new LogIn();
      //WebDriver driver=log.login();
	    
		//Puts an implicit wait, will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch Website
		//driver.navigate().to("https://www.naukrigulf.com/");
		
		//Maximize the Browser
		//driver.manage().window().maximize();
	
		//wait again for 20 seconds
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() throws Exception{
		//wait 73 seconds
		driver.manage().timeouts().implicitlyWait(73, TimeUnit.SECONDS);
		
		//navigate to the home page
		//driver.navigate().to("https://www.naukrigulf.com/");

  }

}
