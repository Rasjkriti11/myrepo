package WindowHandles;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");//parent window
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentID=driver.getWindowHandle();//parent windowID
		
		System.out.println(parentID); //82562F822D0556882063C47BF0BD737D
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(2000);
		driver.findElement(By.id("newTabBtn")).click(); //child windowID
		
	Set<String> windowIDs=driver.getWindowHandles();//returns parent+child windowID
	 //note manually child window opened but we are still on parent window so need to swtich selenium is still controlling parent
	System.out.println(windowIDs);
	
	for(String win :windowIDs)
	{
		
	//	String title=driver.switchTo().window(win).getTitle();
		if(!win.equals(parentID))
		{
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
		
	driver.switchTo().window(parentID);
	System.out.println(driver.getTitle());
		
		
		
	}

}
