package Testjava1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/automation-practice-form");

//multiple checkbox
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> checkboxes = driver.findElements( By.xpath("//div[@id='hobbiesWrapper']//label"));
		
		
for (int i = 0; i < checkboxes.size(); i++) {

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 js.executeScript("arguments[0].click();", checkboxes.get(i));
}
System.out.println("All checkboxes selected");
	

}
}
