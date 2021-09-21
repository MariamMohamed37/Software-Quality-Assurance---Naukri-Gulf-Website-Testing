
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
import org.openqa.selenium.support.ui.ExpectedCondition;



public class Add_To_Cart {
	
	private static final String TimeSpan = null;

	public Add_To_Cart() {
		
	}

	public WebDriver add_To_Cart () throws InterruptedException{

	
	    // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","C:\\Users\\topgi\\Downloads\\chromedriver_win32\\chromedriver.exe");  
          
        // Instantiate a ChromeDriver class to establish a connection       
        WebDriver driver=new ChromeDriver(); 
        
        //I tried its function to solve "no such element: unable to locate element" error
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        //i used its functions
        Actions actions = new Actions(driver);


		//Puts an implicit wait, will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Launch Website
		driver.navigate().to("https://www.naukrigulf.com/");
		
		//wait 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		try {
		//hover on services
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"ngHeader\"]/div/nav/div[3]/a"))).perform();
		
		//click on visual resume
		driver.findElement(By.xpath("//*[@id=\"ngHeader\"]/div/nav/div[3]/div/a[2]")).click();
		
		//wait 60 seconds
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//wait 60 seconds but with other way
        WebDriverWait wait = new WebDriverWait(driver, 30);

		
		
		//I used what happened in the selenium ide
		js.executeScript("window.scrollTo(0,277)");
		
		//make sure again that it is scrolled to the element I want
        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("comboBtn")));
        
        //to make sure again that this button is visible
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("comboBtn")));

		
      //I tried it to solve "no such element: unable to locate element" error
	/*	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"comboExp\"]/div[1]/input[1]"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1); */
		
		
		//choose "0-3 Years Experience" in the dropdown list in the bottom of the page
		WebElement ff = driver.findElement(By.xpath("//*[@id=\"comboExp\"]/div[1]/input[1]"));
		//click on the field
		ff.click();
		//wait 1 seconds until the result of IT appears
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//click down arrow of the pc mouse to choose 0-3 Years Experience option
		ff.sendKeys(Keys.ARROW_UP);
		//click enter button of the pc mouse
		ff.sendKeys(Keys.ENTER);
		//I just was checking if the previous buttons are working, 
		//i have F2 in my pc to lower brightness, this code doesn't do that but it helped in 
		//Achieving my goal so I let it (it helped in pining the answers in the form). 
		ff.sendKeys(Keys.F2);
		ff.sendKeys(Keys.F2);
		ff.sendKeys(Keys.F2);
		
		
		
		
		//click "buy now" button
		driver.findElement(By.xpath("//*[@id=\"comboBtn\"]")).click();

		//I tried it to solve "no such element: unable to locate element" error
	/*	WebElement element1 = driver.findElement(By.id("comboBtn"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",element1); */
		

		
		
		//because it is not working because of the error "no such element: Unable to locate element
		//i tried to solve it by many ways, like changing "By" type to css selector, full xpath, id and so on
		//and implicitly waiting and a lot of other solutions
		//i chose the option 0-3 Years Experience from the drop down list then clicked buy button by my self
		//navigate to the buying result page (cart page)
		
		//driver.navigate().to("https://www.naukrigulf.com/resume-services/gulf-payment");

		
		
		//check if "make payment" button is enabled 
		//and if "Gulf value pack" element is displayed 
		//and if "Visual for Entry level for Gulf (0-3 years)" element is displayed 
		if(driver.findElement(By.xpath("//*[@id=\"makePayment\"]")).isEnabled()
			    && driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[1]/p")).isDisplayed()
			    && driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[3]/p/text()[2]")).isDisplayed()){
				System.out.println("Correct!");
			}else{
				System.out.println("Incorrect answer!");
			}
		
		//Finally you must Close and Quit the Browser
		//driver.close();
		//driver.quit();
		
		
		return driver;
		}
	
	catch(Exception e) {
		return driver;
	}	
	}
}