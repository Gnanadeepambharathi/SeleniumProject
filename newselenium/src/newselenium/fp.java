package newselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class fp {
	
		public static void main(String[] args) throws InterruptedException {
			 
			 
			 System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver.exe");
			 WebDriver ab=new ChromeDriver();
			 ab.get("https://www.amazon.in/");
			 //Thread.sleep(6000);
			 //ab.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
}
}
