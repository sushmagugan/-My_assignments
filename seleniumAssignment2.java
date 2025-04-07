package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumAssignment2 {
	
	public static void main(String[]args) {
	
		//initialize the webdriver(chromedriver)
		
		ChromeDriver driver = new ChromeDriver();
		// launch url
		
		driver.get("http://leaftaps.com/opentaps/");
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//enter username/password
		
		
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click the login button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click crm/sfa
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click accounts
		
		driver.findElement(By.linkText("Accounts")).click();
		
		// click create accounts
		
		driver.findElement(By.linkText("Create Account")).click();
		
		// enter account name
		
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		
	//	WebElement sourceElement1 = driver.findElement(By.name("industryEnumId"));
		
		WebElement sourceElement1 = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		
		Select dropdown1 = new Select(sourceElement1);
		
		dropdown1.selectByIndex(3);
		
	//	WebElement sourceElement2 = driver.findElement(By.name("ownershipEnumId"));
		
		WebElement sourceElement2 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		
		Select dropdown2 = new Select(sourceElement2);
		dropdown2.selectByVisibleText("S-Corporation");
		
	//	WebElement sourceElement3 = driver.findElement(By.id("dataSourceId"));
		
		WebElement sourceElement3 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		
		Select dropdown3 = new Select(sourceElement3);
		dropdown3.selectByValue("LEAD_EMPLOYEE");
		
	//	WebElement sourceElement4 = driver.findElement(By.id("marketingCampaignId"));
		
		
		WebElement sourceElement4 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		
		Select dropdown4 = new Select (sourceElement4);
		dropdown4.selectByIndex(6);
		
	//	WebElement sourceElement5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		
		WebElement sourceElement5 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		
		Select dropdown5 = new Select(sourceElement5);
		dropdown5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
		
		
		
		
	}


}
