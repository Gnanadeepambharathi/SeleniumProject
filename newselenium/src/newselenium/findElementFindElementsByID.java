package newselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementFindElementsByID {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver ab=new ChromeDriver();
		ab.get("https://www.amazon.in/");
		ab.findElement(By.id("pageContent"));
		
		
		
	}
}