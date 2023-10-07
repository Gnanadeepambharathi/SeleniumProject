package newselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver.exe");
		 WebDriver ab=new ChromeDriver();
		 
		 ab.get("https://demoqa.com/text-box" );
		 
		 //single slash "/" --- To check the image at start of the page
		 
		 Boolean imgFlag = ab.findElement(By.xpath("/html/body/div/header/a/img")).isDisplayed();
		 System.out.println("The image is displayed: " + imgFlag);
		 
		 //Double slash "//" --- To check the image
		 
		 Boolean img_Flag = ab.findElement(By.xpath("//img")).isDisplayed();
		 System.out.println("The image ids displayed(Located by //): " + img_Flag);
		 
		 //Address sign "@" --- Full name text box
		 ab.findElement(By.xpath("//input[contains(@id,, 'userN')]")).sendKeys("Full Name");
		 
		 //Dot "." --- Full name text box
		 ab.findElement(By.xpath("//input[ontains(@id, 'userN')]/.")).sendKeys("Full Name");
		 
		 //Double dot ".." --- Full name label
		 String label = ab.findElement(By.xpath("//input[contains(@id, 'userN')]/../../div/label")).getText();
		 System.out.println("The label of full text is: " + label);
		 
		 //Asterisk "*" --- Full name text box
		 ab.findElement(By.xpath("//div[contains{@id, 'userName-wrapper')]/*")).sendKeys("Full Name");
		 
		 //Address and Asterisk "@*" --- Full name text box
		 ab.findElement(By.xpath("//input[@*='userName']")).sendKeys("Full Name");
		 
	}
}
