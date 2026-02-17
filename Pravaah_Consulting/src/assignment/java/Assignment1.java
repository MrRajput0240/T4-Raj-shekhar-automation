package assignment.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    // *************** LOGIN ***************
	    driver.get("https://dev.octopussaas.com/");

	    driver.findElement(By.id("login-email")).sendKeys("henry@test.com");
	    driver.findElement(By.id("login-password")).sendKeys("Nayan123!@");
	    driver.findElement(By.xpath("//button[text()='Log In']")).click();

	    System.out.println("Login Successful");

	    // *************** GENERATOR MANAGEMENT ***************
	    driver.findElement(By.xpath("//h6[text()='Add New']")).click();

	    driver.findElement(By.xpath("//li[text()='Generator']")).click();

	    // *************** GENERATOR INFO ***************
	    driver.findElement(By.xpath("//input[@placeholder='Enter generator name']")).sendKeys("shekhar07");
	    driver.findElement(By.xpath("//input[@placeholder='Enter internal account number']")).sendKeys("8210827945896");
	    driver.findElement(By.xpath("//button[text()='Add new generator']")).submit();
	    Thread.sleep(2000);
	    System.out.println("Done");
	    
	    // *************** BILLING INFO ***************
    driver.findElement(By.xpath("//input[@placeholder='Select Industry Type']")).click();
    driver.findElement(By.xpath("//span[text()='Urgent Care Clinics']")).click();
    driver.findElement(By.xpath("//input[@id='serviceAddress-street']")).sendKeys("Qspider, Sector V, Bidhannagar, 700091");
    driver.findElement(By.xpath("//input[@id='serviceAddress-city']")).sendKeys("Kolkata");
    driver.findElement(By.xpath("//input[@placeholder='Select State']")).click();
    driver.findElement(By.xpath("//span[text()='IN']")).click();
    driver.findElement(By.xpath("//input[@placeholder='ZIP Code']")).sendKeys("700091");
    driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("raj0240@gmail.com");
    driver.findElement(By.xpath("//input[@placeholder='(123) 456-7890']")).sendKeys("8210827900");
    Thread.sleep(2000);
    System.out.println("Providing  billing information successfully");
    
    
//   ***************     Generate latitude and longitude and verify that ***************
    driver.findElement(By.xpath("//button[text()='Edit Position On Map']")).click();
    WebElement lati = driver.findElement(By.xpath("(//input[@type='number' and @step='1'])[1]"));
    lati.sendKeys("22.57");
    WebElement longi = driver.findElement(By.xpath("(//input[@type='number' and @step='1'])[2]"));
    longi.sendKeys("88.43");
    driver.findElement(By.xpath("//button[text()='Update Address']")).click();
    if(lati.isDisplayed())
    	System.out.println("Verify the latitide successfully");
    if(longi.isDisplayed())
    	System.out.println("Verify the longitude successfully");
    Thread.sleep(2000);
    
//    ***************  Copy the billing information  ***************   
	driver.findElement(By.xpath("//button[@class='enabled:hover:text-primary']")).click();
	System.out.println("Copy the billing address");
	Thread.sleep(2000);
	
//         ***************  Fill the service hours  ***************
	driver.findElement(By.xpath("//input[@placeholder='Monday Opening Time']")).click();
	driver.findElement(By.xpath("//span[text()='9:00 AM']")).click();
	System.out.println("Sucessfull");
	driver.findElement(By.xpath("//input[@placeholder='Monday Lunch Start Time']")).click();
	driver.findElement(By.xpath("//span[text()='1:00 PM']")).click();
	System.out.println("Sucessfull");
	driver.findElement(By.xpath("//input[@placeholder='Monday Lunch End Time']")).click();
	driver.findElement(By.xpath("//span[text()='2:00 PM']")).click();
	System.out.println("Sucessfull");
	driver.findElement(By.xpath("//input[@placeholder='Monday Closing Time']")).click();
	driver.findElement(By.xpath("//span[text()='6:00 PM']")).click();
	System.out.println("Done");
	driver.findElement(By.xpath("(//span[@class='w-1/4 flex items-center justify-center'])[1]")).click();
	driver.findElement(By.xpath("(//span[@class='w-1/4 flex items-center justify-center'])[4]")).click();
	driver.findElement(By.xpath("(//span[@class='w-1/4 flex items-center justify-center'])[6]")).click();
	driver.findElement(By.xpath("(//span[@class='w-1/4 flex items-center justify-center'])[8]")).click();
	driver.findElement(By.xpath("(//span[@class='w-1/4 flex items-center justify-center'])[10]")).click();
    System.out.println(" service hours successfully");
    driver.findElement(By.xpath("(//div[@class='flex items-center rounded-lg  justify-center ' and @tabindex='0'])[6]")).click();
    driver.findElement(By.xpath("(//div[@class='flex items-center rounded-lg  justify-center ' and @tabindex='0'])[7]")).click();
    System.out.println("Successful");
	Thread.sleep(2000);


  
// *************** Route Assignment ***************
	
 driver.findElement(By.xpath("(//button[text()='...'])[1]")).click();
 driver.findElement(By.xpath("//button[text()='Route Assignment']")).click();
 WebElement btn1 = driver.findElement(By.xpath("//button[contains(text(),'Go Back to Generator Profile')]"));
 Actions act1 = new Actions(driver);
 act1.moveToElement(btn1).click().perform();
 System.out.println("successfull");
 Thread.sleep(2000);
 WebElement check1 = driver.findElement(By.xpath("(//div[contains(@class,'cursor-pointer min-w-[26px]')])[1]"));
act1.moveToElement(check1).click().perform();
driver.findElement(By.xpath("//button[text()='Yes']")).click();
Thread.sleep(2000);
WebElement ele11 = driver.findElement(By.xpath("(//button[text()='...'])[1]"));
act1.moveToElement(ele11).click().perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='Route Assignment']")).click();
Thread.sleep(7000);
WebElement ele21 = driver.findElement(By.xpath("//span[text()='Add a Service']"));
act1.moveToElement(ele21).click().perform();
System.out.println("Successfull 3");
Thread.sleep(2000);

driver.findElement(By.xpath("//button[@id='route']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//span[@class='w-3 h-3 rounded-full flex-shrink-0'])[8]")).click();
driver.findElement(By.xpath("//span[text()='Service Frequency']")).click();
driver.findElement(By.xpath("//div[text()='Multiple Times Weekly (MTW)']")).click();
driver.findElement(By.xpath("//span[text()='Select Weekdays']")).click();
Thread.sleep(2000);
WebElement check11 = driver.findElement(By.xpath("(//input[@class='mr-2'])[4]"));
act1.moveToElement(check11).click().perform();
WebElement check2 = driver.findElement(By.xpath("(//input[@class='mr-2'])[5]"));
act1.moveToElement(check2).click().perform();
WebElement check3 = driver.findElement(By.xpath("(//input[@class='mr-2'])[6]"));
act1.moveToElement(check3).click().perform();
WebElement check4 = driver.findElement(By.xpath("(//input[@class='mr-2'])[7]"));	
act1.moveToElement(check4).click().perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(@class,'bg-inputBg rounded-full h-9 text-cardTextGray')]")).click();
driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, February 21st, 2026']")).click();
driver.findElement(By.xpath("//button[@id='service-input-0']")).click();
driver.findElement(By.xpath("//div[text()='Medical Waste']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//span[text()='Scope Of Work (SOW)'])[2]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox' and @class='mr-2'])[4]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox' and @class='mr-2'])[5]")).click();
for (int i = 0; i <=3; i++) {
driver.findElement(By.xpath("(//button[@class='absolute right-2 top-1 text-gray-500 hover:text-gray-700'])[1]")).click();
driver.findElement(By.xpath("(//button[@class='absolute right-2 top-1 text-gray-500 hover:text-gray-700'])[2]")).click();
}
driver.findElement(By.xpath("//button[text()='Add to Route']")).click();
System.out.println("Successfull 4");
Thread.sleep(2000);
    
    

//*************** Price Book ***************

driver.findElement(By.xpath("//a[text()='Price Book']")).click();
driver.findElement(By.xpath("//button[@class='bg-[#898989] z-0 relative flex items-center h-7 w-[49px] rounded-full transition-colors focus:outline-none cursor-pointer']")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm' and text()='Yes']")).click();
Thread.sleep(3000);
WebElement SP1 = driver.findElement(By.xpath("(//input[@class='bg-transparent text-sm text-gray-700 w-full pl-1 outline-none '])[265]"));
SP1.click();
SP1.sendKeys(Keys.CONTROL + "a");
SP1.sendKeys(Keys.DELETE);
SP1.sendKeys("13.35");
WebElement SP2 = driver.findElement(By.xpath("(//input[@class='bg-transparent text-sm text-gray-700 w-full pl-1 outline-none '])[268]"));
SP2.click();
SP2.sendKeys(Keys.CONTROL + "a");
SP2.sendKeys(Keys.DELETE);
SP2.sendKeys("17.35");
System.out.println("Sucessful 5");
Thread.sleep(2000);

// *************** Logout  ***************
WebElement logout = driver.findElement(By.xpath("//img[@class='rounded-full w-full h-full object-cover']"));
act1.moveToElement(logout).click().perform();
driver.findElement(By.xpath("//button[text()='Logout']")).click();
System.out.println("Sucessful 6");
Thread.sleep(2000);
//driver.quit();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
