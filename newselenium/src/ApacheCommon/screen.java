package ApacheCommon;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class screen {
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/commons-io-2.13.0-bin/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();		
			options.addArguments("--remote-allow-origins=*");
			//creating obj for web driver
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//creating reference is the first step
			TakesScreenshot tk=(TakesScreenshot)driver;
			//taking screenshot and storing it in the temporary file
			File source=tk.getScreenshotAs(OutputType.FILE);
			//creating destination file
			File des=new File("D:/facebook.png");
			//moving the file from source to destination
			FileUtils.copyFile(source, des);
		}
}