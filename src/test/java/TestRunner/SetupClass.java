package TestRunner;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupClass {
	public static WebDriver driver;
	public static WebElement webelement;
	public static Logger log;
	@BeforeClass
	public static void before_Class() throws Exception {
		log = Logger.getLogger(BeforeClass.class.getName());
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(1000);

	}

	@AfterClass
	public static void after_Class() {
		try {
			driver.quit();
			Thread.sleep(2000);
		} catch (Exception closeBrowser) {

		}
	}
}
