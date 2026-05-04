package Testjava1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onlyrequiredclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");
	        
	        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
	        
	        for(int i=0;i<checkboxes.size();i++)
	        {
	        	
	        	String input=checkboxes.get(i).getAttribute("value");
	        	System.out.println(input);
	        	if(input.equals("two"))
	        	{
	        		checkboxes.get(i).click();
	        	}
	        }
	        System.out.println(checkboxes.size());
	}

}
