package Testjava1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement checkbox= driver.findElement(By.xpath("//input[@value='Male']"));
		
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		//Verify selection
		System.out.println("Checkbox selected : "+checkbox.isSelected());
		
		driver.quit();
	}

}
