package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver.exe");
		 WebDriver ab=new ChromeDriver();
		 
		 ab.get("https://demoqa.com/text-box" );
		 
		 //Locating and Clicking a check box by using ID
		 ab.findElement(By.id("hobbies-checkbox-1")).click();
		 
		 //selecting the first check box using x path
		 ab.findElement(By.xpath("//label[text()='Sports']")).click();
		 
		 //selecting the second check box using x path
		 ab.findElement(By.xpath("//label[text()='Reading']")).click();
		 
		 //selecting the first check box using CSS selectors
		 ab.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
		 
		 //selecting the second check box using CSS selectors
		 ab.findElement(By.cssSelector("label[for='hobbies-checkbox-2']")).click();
		 
		//selecting the third check box using CSS selectors
		 ab.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();
		 
		//To check the check box isSelected method and click
		WebElement checkBoxElement = ab.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isSelected = checkBoxElement.isSelected();
		if(isSelected == false) {
			checkBoxElement.click();
		}
		
		//To check the check box isDisplayed method and click
		WebElement checkBoxEle = ab.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isDisplayed = checkBoxEle.isDisplayed();
		if(isDisplayed == true) {
			checkBoxEle.click();
		}
		
		//To check the check box isEnabled method and click
				WebElement checkBoxE = ab.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
				boolean isEnabled = checkBoxE.isEnabled();
				if(isEnabled == true) {
					checkBoxE.click();
				}
				
		
		 
		 
		 
		 
	}
}
