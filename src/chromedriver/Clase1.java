package chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		//WebDriver drive = new FirefoxDriver();
		//WebDriver drive = new InternetExplorerDriver();
		
		drive.get("http://www.baidu.com");

	}

}
