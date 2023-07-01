package automationscript;//package//

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTesting { //class//

	public static void main(String[] args) {  //Main//
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.wipro.com/");
		
		

	}

}
