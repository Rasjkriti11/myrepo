package Testjava1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//ChromeDriver driver=new ChromeDriver();
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://demoqa.com/automation-practice-form");


WebElement checkbox= driver.findElement(By.xpath("//input[@value='Male']"));
checkbox.click();
 if(checkbox.isSelected())
 {
	 System.out.println("slected");
 }
 else
 {
	 System.out.println("not selected");
 }
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//driver.quit();
	}

}
