package SeleniumSample;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {

	
	public static void main(String[]args) {
		
		ChromeDriver driver = new ChromeDriver();
	//	driver.get("https://leaftaps.com/opentaps/control/main");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
}
