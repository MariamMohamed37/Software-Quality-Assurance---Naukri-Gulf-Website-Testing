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

public class Remove_From_Cart {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


	
    // System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver","C:\\Users\\topgi\\Downloads\\chromedriver_win32\\chromedriver.exe");  
      
    // Instantiate a ChromeDriver class to establish a connection       
    //WebDriver driver=new ChromeDriver(); 
    
    //so the add to cart function execute before it
    Add_To_Cart aa=new Add_To_Cart();
    WebDriver driver=aa.add_To_Cart();
   

	//Puts an implicit wait, will wait for 10 seconds before throwing exception
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	//////////////////////////////////// The basic steps /////////////////////////////////////////////////
	/*
	
	//Launch Website
	driver.navigate().to("https://www.naukrigulf.com/");
	
	//Maximize the Browser
	driver.manage().window().maximize();
	
	//click on services button
	driver.findElement(By.xpath("//*[@id=\"ngHeader\"]/div/nav/div[3]/a")).click();
	
	//wait 20 seconds
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//wait 20 seconds by other way than implicitly wait
	WebDriverWait wait = new WebDriverWait(driver, 20);
	By ee = By.xpath("//*[@id=\\\"root\\\"]/div/div/div[1]/div[3]/div/ul/a/i");

	// wait until the cart icon appears
	WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(ee));
	
	//wait 3 seconds
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	//I tried the button several times and it is not working
	//click on cart icon 
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/ul/a/i")).click();
	
	//click on remove button
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[3]/div/a[2]")).click();

	*/
	
	
	
	
	
	
	////////////////////////The solution steps (means to avoid the no such element error)///////////////////////////////
	
	try {
	//go to cart page 
	driver.navigate().to("https://www.naukrigulf.com/resume-services/gulf-payment");
	

	
	//if the this element is written on it There are no items in this cart
	//and if "make payment" button is NOT enabled 
	if(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/p")).getText() == "There are no items in this cart" 
		&&	!driver.findElement(By.xpath("//*[@id=\"makePayment\"]")).isEnabled()){
			System.out.println("Correct!");
		}else{			
			System.out.println("Incorrect answer!");
			//if i'm wrong in predicting the element text, print the actual text in the console.
			System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/p")).getText());
		}
	

	
	//Finally you must Close and Quit the Browser
	driver.close();
	driver.quit();
	}catch(Exception e) {
		
	}
}

}
