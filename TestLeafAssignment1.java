package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafAssignment1 {

	public static void main (String[]args) {
		
		//Launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// manage the window - maximize/minimize the browser
		driver.manage().window().maximize();
		
		//enter password & username by finding the locator/xpath 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click the login button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click the hyperlink crm/sfa
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Navigate to leads
		
		driver.findElement(By.linkText("Leads")).click();
		
		//navigate to create leads
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		// enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//enter the firstname&last name
		
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sushma");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("gugan");
		
		//enter the title name

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Sushma_Assignment");
		
		// handle dropdown
		//step1:find element
		//webelement near name u change by changing/assigning to local variable
		
	//	WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
	
		//step2:create object for the select class
		//create variable name should be passed with the newSelect()
		
	//Select drodpown= new Select(sourceElement);
		
	//	Select dropdown = new Select(sourceElement);
		//step3: use the method to handle
	//dropdown.selectByIndex(2);
		
		//dropdown.selectByValue("LEAD_EMPLOYEE");
		
	//	dropdown.selectByVisibleText("Tradeshow");
		
		//click the submit button
		driver.findElement(By.xpath("//input[@name='submitButton']"));
		
	
	
	
		
		
		
		
		
	
	}
}
