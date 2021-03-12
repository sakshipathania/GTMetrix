package TestRunner.loginSteps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepository.GtmetricObject;
import ObjectRepository.PerformAction;
import TestRunner.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Pageload_step_definition extends SetupClass {
	PerformAction wait1 = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebDriverWait wait = new WebDriverWait(driver,50);
	Random rad = new Random();
public static String speedtime;
public static String location;
public static String actualTitle;
	// Open web site URl
	@Given("^Navigate to the website url\\.$")
	public void navigates_to_website_url() throws InterruptedException {
		// Maximize Windows
		driver.get("https://gtmetrix.com/");
		Thread.sleep(3000);
	}

	@Then("^Click on the Login button\\.$")
	public void click_on_Download_this_presentation_link() throws InterruptedException {
		webelement = driver.findElement(GtmetricObject.Login_button);
		Thread.sleep(5000);
		webelement.click();
		Thread.sleep(1000);
	}

	@Then("^Enter user email address \"([^\"]*)\"\\.$")
	public void enter_user_email_address_as(String email) {

		webelement = driver.findElement(GtmetricObject.email);
		webelement.click();
		Thread.sleep(5000);
		webelement.clear();
	Thread.sleep(5000);
		webelement.sendKeys("test147@gmail.com");
		Thread.sleep(5000);
	}

	@Then("^Insert the user Password \"([^\"]*)\"\\.$")
	public void enter_user_password_as(String passwd) throws Throwable {
		webelement = driver.findElement(GtmetricObject.password);
		webelement.click();
		Thread.sleep(5000);
		webelement.clear();
		Thread.sleep(5000);
		webelement.sendKeys("Qwerty");
		Thread.sleep(5000);
	}

	@Then("^Click on Login\\.$")
	public void click_on_Login_button() throws Throwable {
		webelement = driver.findElement(GtmetricObject.login);
		Thread.sleep(5000);
		webelement.click();
		Thread.sleep(5000);
		Thread.sleep(2000);
	}

	@Given("^Fills the Analyze Performance of app \"([^\"]*)\"\\.$")
	public void after_signup_redirect_to_price_page(String URL) throws Throwable {
		webelement = driver.findElement(GtmetricObject.URL);
		Thread.sleep(5000);
		webelement.click();
		Thread.sleep(5000);
		webelement.sendKeys(URL);
		Thread.sleep(5000);
		Thread.sleep(1000);
	}

	@Then("^Select the USA country\\.$")
	public void select_USA() throws Throwable {

		WebElement listin = driver.findElement(GtmetricObject.country);
		listin.click();
		Thread.sleep(5000);
		Thread.sleep(500);
	}

	@Then("^Select London country\\.$")
	public void select_London() throws Throwable {
		for (int i = 0; i <3; i++){
			 //click the button
			WebElement listin = driver.findElement(GtmetricObject.country);
		listin.click();
		Thread.sleep(5000);
		Thread.sleep(500);
	}
	}
	@Then("^Select India country\\.$")
	public void select_India() throws Throwable {
		for (int i = 0; i <4; i++){
			 //click the button
			WebElement listin = driver.findElement(GtmetricObject.country);
		listin.click();
		Thread.sleep(5000);
		Thread.sleep(500);
		}
	}


	@Then("^click on Analyze cta\\.$")
	public void card_page() throws InterruptedException {
		webelement = driver.findElement(GtmetricObject.analyze);
		Thread.sleep(5000);
		webelement.click();
		Thread.sleep(500);
		Thread.sleep(5000);
		WebElement sucess = new WebDriverWait(driver, 160)
				.until(ExpectedConditions.visibilityOfElementLocated(GtmetricObject.completed));
		Thread.sleep(5000);
		Thread.sleep(500);
	}
	
	@Then ("^Get fully loaded Time,location and title URL\\.$")
	public void get_data() {
		 speedtime = driver.findElement(By.cssSelector("div.report-page-details>div>div:first-child>span")).getText();
		Thread.sleep(5000);
		actualTitle = driver.getCurrentUrl();
		Thread.sleep(5000);
		location = driver.findElement(By.cssSelector("div.report-details-info > div:nth-child(2) > div"))
				.getText();
		Thread.sleep(5000);
	}

	@Then("^After Analyze the app see result for Vancouver, Canada\\.$")
	public void after_Analyze_the_app_see_result_for_Vancouver_Canada() throws Throwable {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\home\\canada.png"));
		Thread.sleep(500);
		System.err.println("Get Current location from the home page= " + location);
		System.err.println("HOME PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Home Page = " + actualTitle);
		setDataFromFile("Get Current location from the home page= "+ location);
		setDataFromFile("HOME PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Home Page= " + actualTitle);
	}

	@Then("^After Analyze the app see result for San Antonio, USA\\.$")
	public void after_Analyze_the_app_see_result_for_San_Antonio_USA() throws Throwable {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\home\\Dallas.png"));
		Thread.sleep(500);
		Thread.sleep(500);
		System.err.println("Get Current location from the home page= " + location);
		System.err.println("HOME PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Home Page = " + actualTitle);
		setDataFromFile("Get Current location from the home page= "+ location);
		setDataFromFile("HOME PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Home Page= " + actualTitle);
	}



	@Then("^After Analyze the app see result for London, UK\\.$")
	public void after_Analyze_the_app_see_result_for_London_UK() throws Throwable {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\home\\London.png"));
		Thread.sleep(500);
		System.err.println("Get Current location from the home page= " + location);
		System.err.println("HOME PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Home Page = " + actualTitle);
		setDataFromFile("Get Current location from the home page= "+ location);
		setDataFromFile("HOME PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Home Page= " + actualTitle);
	}

	@Then("^After Analyze the app see result for Mumbai, India\\.$")
	public void after_Analyze_the_app_see_result_for_Mumbai_India() throws Throwable {
		Thread.sleep(5000);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\home\\Mumbai.png"));
		Thread.sleep(500);
		System.err.println("Get Current location from the home page= " + location);
		System.err.println("HOME PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Home Page = " + actualTitle);
		setDataFromFile("Get Current location from the home page= "+ location);
		setDataFromFile("HOME PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Home Page= " + actualTitle);
	}

	
//sample page time
	@Then("^After Analyze the smaple free app see result for Vancouver, Canada\\.$")
	public void after_Analyze_the_smaple_free_app_see_result_for_Vancouver_Canada() throws Throwable {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\sample\\Canada.png"));
		Thread.sleep(500);
		System.err.println("Get Current location from the smaple free page" + location);
		System.err.println("SAMPLE free PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for SAMPLE free Page = " + actualTitle);
		setDataFromFile("Get Current location from the SAMPLE Free page= " + location);
		setDataFromFile("SAMPLE Free PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for SAMPLE free page= " + actualTitle);
	}

	@Then("^After Analyze the smaple free app see result for San Antonio, USA\\.$")
	public void after_Analyze_the_smaple_free_app_see_result_for_San_Antonio_USA() throws Throwable {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\sample\\USA.png"));
		Thread.sleep(500);
		System.err.println("Get Current location from the smaple free page" + location);
		System.err.println("SAMPLE free PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for SAMPLE free Page = " + actualTitle);
		setDataFromFile("Get Current location from the SAMPLE Free page= " + location);
		setDataFromFile("SAMPLE Free PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for SAMPLE free page= " + actualTitle);

	}

	

	@Then("^After Analyze the smaple free app see result for London, UK\\.$")
	public void after_Analyze_the_smaple_free_app_see_result_for_London_UK() throws Throwable {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\sample\\London.png"));
		Thread.sleep(500);
		System.err.println("Get Current location from the smaple free page" + location);
		System.err.println("SAMPLE free PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for SAMPLE free Page = " + actualTitle);
		setDataFromFile("Get Current location from the SAMPLE Free page= " + location);
		setDataFromFile("SAMPLE Free PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for SAMPLE free page= " + actualTitle);

	}

	@Then("^After Analyze the smaple free app see result for Mumbai, India\\.$")
	public void after_Analyze_the_smaple_free_app_see_result_for_Mumbai_India() throws Throwable {
		System.err.println("Get Current location from the smaple free page" + location);
		System.err.println("SAMPLE free PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for SAMPLE free Page = " + actualTitle);
		setDataFromFile("Get Current location from the SAMPLE Free page= " + location);
		setDataFromFile("SAMPLE Free PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for SAMPLE free page= " + actualTitle);
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\sample\\Mumbai.png"));
		Thread.sleep(500);
	}

	
// share and download URL

	@Then("^After Analyze the share and download app see result for Vancouver, Canada\\.$")
	public void after_Analyze_the_share_and_download_app_see_result_for_Vancouver_Canada() throws Throwable {
		System.err.println("Get Current location from the Share And Download page" + location);
		System.err.println("Share And Download PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Share And Download Page = " + actualTitle);
		setDataFromFile("Get Current location from the Share And Download page= " + location);
		setDataFromFile("Share And Download PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Share And Download page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\share and download\\Canada.png"));
		Thread.sleep(500);
	}

	@Then("^After Analyze the share and download app see result for San Antonio, USA\\.$")
	public void after_Analyze_the_share_and_download_app_see_result_for_San_Antonio_USA() throws Throwable {
		System.err.println("Get Current location from the Share And Download page" + location);
		System.err.println("Share And Download PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Share And Download Page = " + actualTitle);
		setDataFromFile("Get Current location from the Share And Download page= " + location);
		setDataFromFile("Share And Download PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Share And Download page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\share and download\\USA.png"));
		Thread.sleep(500);

	}

	
	@Then("^After Analyze the share and download app see result for London, UK\\.$")
	public void after_Analyze_the_share_and_download_app_see_result_for_London_UK() throws Throwable {
		System.err.println("Get Current location from the Share And Download page" + location);
		System.err.println("Share And Download PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Share And Download Page = " + actualTitle);
		setDataFromFile("Get Current location from the Share And Download page= " + location);
		setDataFromFile("Share And Download PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Share And Download page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\share and download\\London.png"));
		Thread.sleep(1000);
	}

	@Then("^After Analyze the share and download app see result for Mumbai, India\\.$")
	public void after_Analyze_the_share_and_download_app_see_result_for_Mumbai_India() throws Throwable {
		System.err.println("Get Current location from the Share And Download page" + location);
		System.err.println("Share And Download PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Share And Download Page = " + actualTitle);
		setDataFromFile("Get Current location from the Share And Download page= " + location);
		setDataFromFile("Share And Download PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Share And Download page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\share and download\\Mumbai.png"));
		Thread.sleep(1000);
	}

	
//downloaded  most link
	@Then("^After Analyze the Most Downloaded app see result for Vancouver, Canada\\.$")
	public void after_Analyze_the_Most_Downloaded_app_see_result_for_Vancouver_Canada() throws Throwable {
		System.err.println("Get Current location from the Most Downloaded page" + location);
		System.err.println("Most Downloaded PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Most Downloaded Page = " + actualTitle);
		setDataFromFile("Get Current location from the Most Downloaded page= " + location);
		setDataFromFile("Most Downloaded PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Most Downloaded page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\Most Downloaded\\canada.png"));
		Thread.sleep(500);
	}
	@Then("^After Analyze the Most Downloaded app see result for San Antonio, USA\\.$")
	public void after_Analyze_the_Most_Downloaded_app_see_result_for_San_Antonio_USA() throws Throwable {
		System.err.println("Get Current location from the Most Downloaded page" + location);
		System.err.println("Most Downloaded PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Most Downloaded Page = " + actualTitle);
		setDataFromFile("Get Current location from the Most Downloaded page= " + location);
		setDataFromFile("Most Downloaded PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Most Downloaded page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\Most Downloaded\\USA.png"));
		Thread.sleep(500);
	}
	

	@Then("^After Analyze the Most Downloaded app see result for London, UK\\.$")
	public void London() throws Throwable {
		System.err.println("Get Current location from the Most Downloaded page" + location);
		System.err.println("Most Downloaded PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Most Downloaded Page = " + actualTitle);
		setDataFromFile("Get Current location from the Most Downloaded page= " + location);
		setDataFromFile("Most Downloaded PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Most Downloaded page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\Most Downloaded\\London.png"));
		Thread.sleep(500);
	}

	@Then("^After Analyze the Most Downloaded app see result for Mumbai, India\\.$")
	public void after_Analyze_the_Most_Downloaded_app_see_result_for_Mumbai_India() throws Throwable {
		System.err.println("Get Current location from the Most Downloaded page" + location);
		System.err.println("Most Downloaded PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Most Downloaded Page = " + actualTitle);
		setDataFromFile("Get Current location from the Most Downloaded page= " + location);
		setDataFromFile("Most Downloaded PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Most Downloaded page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\Most Downloaded\\India.png"));
		Thread.sleep(500);
	}

	
//Newly Added
	@Then("^After Analyze the Newly Added app see result for Vancouver, Canada\\.$")
	public void after_Analyze_the_Newly_Added_app_see_result_for_Vancouver_Canada() throws Throwable {
		System.err.println("Get Current location from the Newly Added page" + location);
		System.err.println("Newly Added PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Newly Added Page = " + actualTitle);
		setDataFromFile("Get Current location from the Newly Added page= " + location);
		setDataFromFile("Newly Added PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Newly Added page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\Newly Added\\canada.png"));
		Thread.sleep(1000);

	}

	@Then("^After Analyze the Newly Added app see result for San Antonio, USA\\.$")
	public void after_Analyze_the_Newly_Added_app_see_result_for_San_Antonio_USA() throws Throwable {
		System.err.println("Get Current location from the Newly Added page" + location);
		System.err.println("Newly Added PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Newly Added Page = " + actualTitle);
		setDataFromFile("Get Current location from the Newly Added page= " + location);
		setDataFromFile("Newly Added PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Newly Added page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\Newly Added\\USA.png"));
		Thread.sleep(1000);
	}

	

	@Then("^After Analyze the Newly Added app see result for London, UK\\.$")
	public void after_Analyze_the_Newly_Added_app_see_result_for_London_UK() throws Throwable {
		System.err.println("Get Current location from the Newly Added page" + location);
		System.err.println("Newly Added PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Newly Added Page = " + actualTitle);
		setDataFromFile("Get Current location from the Newly Added page= " + location);
		setDataFromFile("Newly Added PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Newly Added page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\Newly Added\\London.png"));
		Thread.sleep(500);
	}
	@Then("^After Analyze the Newly Added app see result for Mumbai, India\\.$")
	public void after_Analyze_the_Newly_Added_app_see_result_for_Mumbai_India() throws Throwable {
		System.err.println("Get Current location from the Newly Added page" + location);
		System.err.println("Newly Added PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Newly Added Page = " + actualTitle);
		setDataFromFile("Get Current location from the Newly Added page= " + location);
		setDataFromFile("Newly Added PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Newly Added page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\Newly Added\\India.png"));
		Thread.sleep(500);
	}
//template Finder
	@Then("^After Analyze the template finder app see result for Vancouver, Canada\\.$")
	public void after_Analyze_the_template_finder_app_see_result_for_Vancouver_Canada() throws Throwable {
		System.err.println("Get Current location from the Template finder page" + location);
		System.err.println("Template finder PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Template finder Page = " + actualTitle);
		setDataFromFile("Get Current location from the Template finder page= " + location);
		setDataFromFile("Template finder PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Template finder page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\template finder\\canada.png"));
		Thread.sleep(500);
	}

	@Then("^After Analyze the template finder app see result for San Antonio, USA\\.$")
	public void after_Analyze_the_template_finder_app_see_result_for_San_Antonio_USA() throws Throwable {
		System.err.println("Get Current location from the Template finder page" + location);
		System.err.println("Template finder PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Template finder Page = " + actualTitle);
		setDataFromFile("Get Current location from the Template finder page= " + location);
		setDataFromFile("Template finder PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Template finder page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\template finder\\USA.png"));
		Thread.sleep(500);
	}
	
	@Then("^After Analyze the template finder app see result for London, UK\\.$")
	public void after_Analyze_the_template_finder_app_see_result_for_London_UK() throws Throwable {
		System.err.println("Get Current location from the Template finder page" + location);
		System.err.println("Template finder PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Template finder Page = " + actualTitle);
		setDataFromFile("Get Current location from the Template finder page= " + location);
		setDataFromFile("Template finder PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Template finder page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\template finder\\London.png"));
		Thread.sleep(500);
	}
	@Then("^After Analyze the template finder app see result for Mumbai, India\\.$")
	public void after_Analyze_the_template_finder_app_see_result_for_Mumbai_India() throws Throwable {
		System.err.println("Get Current location from the Template finder page" + location);
		System.err.println("Template finder PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Template finder Page = " + actualTitle);
		setDataFromFile("Get Current location from the Template finder page= " + location);
		setDataFromFile("Template finder PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Template finder page= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\template finder\\India.png"));
		Thread.sleep(500);
	}
	

	//Listig page
	@Then("^After Analyze the listing page app see result for Vancouver, Canada\\.$")
	public void after_Analyze_the_listing_page_app_see_result_for_Vancouver_Canada() throws Throwable {
		System.err.println("Get Current location from the Listing page" + location);
		System.err.println("Listing PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Listing Page = " + actualTitle);
		setDataFromFile("Get Current location from the Listing page= " + location);
		setDataFromFile("Listing PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Template Listing= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\listing page\\Canada.png"));
		Thread.sleep(500);
	}
	@Then("^After Analyze the listing page app see result for San Antonio, USA\\.$")
	public void after_Analyze_the_listing_page_app_see_result_for_San_Antonio_USA() throws Throwable {
		System.err.println("Get Current location from the Listing page" + location);
		System.err.println("Listing PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Listing Page = " + actualTitle);
		setDataFromFile("Get Current location from the Listing page= " + location);
		setDataFromFile("Listing PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Template Listing= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\listing page\\USA.png"));
		Thread.sleep(1000);
	}


	@Then("^After Analyze the listing page app see result for London, UK\\.$")
	public void after_Analyze_the_listing_page_app_see_result_for_London_UK() throws Throwable {
		System.err.println("Get Current location from the Listing page" + location);
		System.err.println("Listing PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Listing Page = " + actualTitle);
		setDataFromFile("Get Current location from the Listing page= " + location);
		setDataFromFile("Listing PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Template Listing= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\listing page\\London.png"));
		Thread.sleep(1000);

	}

	@Then("^After Analyze the listing page app see result for Mumbai, India\\.$")
	public void after_Analyze_the_listing_page_app_see_result_for_Mumbai_India() throws Throwable {
		System.err.println("Get Current location from the Listing page" + location);
		System.err.println("Listing PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Listing Page = " + actualTitle);
		setDataFromFile("Get Current location from the Listing page= " + location);
		setDataFromFile("Listing PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Template Listing= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\listing page\\India.png"));
		Thread.sleep(1000);
	}

	
//Product Page
	@Then("^After Analyze the product page app see result for Vancouver, Canada\\.$")
	public void after_Analyze_the_product_page_app_see_result_for_Vancouver_Canada() throws Throwable {
		System.err.println("Get Current location from the Product page" + location);
		System.err.println("Product PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Product Page = " + actualTitle);
		setDataFromFile("Get Current location from the Product page= " + location);
		setDataFromFile("Product PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Product= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\product page\\Canada.png"));
		Thread.sleep(500);

	}

	@Then("^After Analyze the product page app see result for San Antonio, USA\\.$")
	public void after_Analyze_the_product_page_app_see_result_for_San_Antonio_USA() throws Throwable {
		System.err.println("Get Current location from the Product page" + location);
		System.err.println("Product PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Product Page = " + actualTitle);
		setDataFromFile("Get Current location from the Product page= " + location);
		setDataFromFile("Product PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Product= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\product page\\USA.png"));
		Thread.sleep(500);
	}

	
	@Then("^After Analyze the product page app see result for London, UK\\.$")
	public void after_Analyze_the_product_page_app_see_result_for_London_UK() throws Throwable {
		System.err.println("Get Current location from the Product page" + location);
		System.err.println("Product PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Product Page = " + actualTitle);
		setDataFromFile("Get Current location from the Product page= " + location);
		setDataFromFile("Product PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Product= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\product page\\London.png"));
		Thread.sleep(1000);
	}

	@Then("^After Analyze the product page app see result for Mumbai, India\\.$")
	public void after_Analyze_the_product_page_app_see_result_for_Mumbai_India() throws Throwable {
		System.err.println("Get Current location from the Product page" + location);
		System.err.println("Product PAGE Loaded TIME for= " + speedtime);
		System.err.println("Get URL Link for Product Page = " + actualTitle);
		setDataFromFile("Get Current location from the Product page= " + location);
		setDataFromFile("Product PAGE Loaded TIME FOR = " + speedtime);
		setDataFromFile("Get URL Link for Product= " + actualTitle);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\target\\cucumber-html-report\\product page\\India.png"));
		Thread.sleep(500);
	}
	
	@Then("^write time on location in excelsheet\\.$")
	public void write_text() throws Exception {
	
	putDataInExcel(1);
		
	}

	@Then("^write location in excelsheet\\.$")
	public void write() throws Exception {

		putDataInExcel(2);
	
	}

	@Then("^London location and time loaded in excelsheet\\.$")
	public void London_location() throws Exception {
		putDataInExcel(3);
	}

	@Then("^India location and time loaded in excelsheet\\.$")
	public void Indialocation() throws Exception {
		putDataInExcel(4);
	}


	@Then("^Sample page location and loaded time for Canada country\\.$")
	public void sample_location_time() throws Exception {
		putDataInExcel(5);
	}

	@Then("^Sample page location and loaded time for USA country\\.$")
	public void sample_page_location_and_loaded_time_for_USA_country() throws Throwable {
		putDataInExcel(6);
	}


	@Then("^Sample page location and loaded time for UK country\\.$")
	public void sample_page_location_and_loaded_time_for_UK_country() throws Throwable {
		putDataInExcel(7);
	}

	@Then("^Sample page location and loaded time for India country\\.$")
	public void sample_page_location_and_loaded_time_for_India_country() throws Throwable {
		putDataInExcel(8);
	}


	@Then("^Share and download page location and loaded time for Canada country\\.$")
	public void share_and_download_page_location_and_loaded_time_for_Canada_country() throws Throwable {
		putDataInExcel(9);
	}

	@Then("^Share and download page location and loaded time for USA country\\.$")
	public void share_and_download_page_location_and_loaded_time_for_USA_country() throws Throwable {
		putDataInExcel(10);
	}


	@Then("^Share and download page location and loaded time for UK country\\.$")
	public void share_and_download_page_location_and_loaded_time_for_UK_country() throws Throwable {
		putDataInExcel(11);
	}

	@Then("^Share and download page location and loaded time for India country\\.$")
	public void share_and_download_page_location_and_loaded_time_for_India_country() throws Throwable {
		putDataInExcel(12);
	}


	@Then("^Most Downloaded page location and loaded time for Canada country\\.$")
	public void most_Downloaded_page_location_and_loaded_time_for_Canada_country() throws Throwable {
		putDataInExcel(13);
	}

	@Then("^Most Downloaded page location and loaded time for USA country\\.$")
	public void most_Downloaded_page_location_and_loaded_time_for_USA_country() throws Throwable {
		putDataInExcel(14);
	}



	@Then("^Most Downloaded page location and loaded time for UK country\\.$")
	public void most_Downloaded_page_location_and_loaded_time_for_UK_country() throws Throwable {
		putDataInExcel(15);
	}

	@Then("^Most Downloaded page location and loaded time for India country\\.$")
	public void most_Downloaded_page_location_and_loaded_time_for_India_country() throws Throwable {
		putDataInExcel(16);
	}


	@Then("^Newly Added page location and loaded time for Canada country\\.$")
	public void newly_Added_page_location_and_loaded_time_for_Canada_country() throws Throwable {
		putDataInExcel(17);
	}

	@Then("^Newly Added page location and loaded time for USA country\\.$")
	public void newly_Added_page_location_and_loaded_time_for_USA_country() throws Throwable {
		putDataInExcel(18);
	}


	@Then("^Newly Added page location and loaded time for UK country\\.$")
	public void newly_Added_page_location_and_loaded_time_for_UK_country() throws Throwable {
		putDataInExcel(19);
	}

	@Then("^Newly Added page location and loaded time for India country\\.$")
	public void newly_Added_page_location_and_loaded_time_for_India_country() throws Throwable {
		putDataInExcel(20);
	}


	@Then("^Template Finder page location and loaded time for Canada country\\.$")
	public void template_Finder_page_location_and_loaded_time_for_Canada_country() throws Throwable {
		putDataInExcel(21);
	}

	@Then("^Template Finder page location and loaded time for USA country\\.$")
	public void template_Finder_page_location_and_loaded_time_for_USA_country() throws Throwable {
		putDataInExcel(22);
	}


	@Then("^Template Finder page location and loaded time for UK country\\.$")
	public void template_Finder_page_location_and_loaded_time_for_UK_country() throws Throwable {
		putDataInExcel(23);
	}

	@Then("^Template Finder page location and loaded time for India country\\.$")
	public void template_Finder_page_location_and_loaded_time_for_India_country() throws Throwable {
		putDataInExcel(24);
	}


	@Then("^Listing page location and loaded time for Canada country\\.$")
	public void listing_page_location_and_loaded_time_for_Canada_country() throws Throwable {
		putDataInExcel(25);
	}

	@Then("^Listing page location and loaded time for USA country\\.$")
	public void listing_page_location_and_loaded_time_for_USA_country() throws Throwable {
		putDataInExcel(26);
		
//		sh1.getRow(1).createCell(0).setCellValue("https://slideteam.net");
	}


	@Then("^Listing page location and loaded time for UK country\\.$")
	public void listing_page_location_and_loaded_time_for_UK_country() throws Throwable {
		putDataInExcel(27);
	}

	@Then("^Listing page location and loaded time for India country\\.$")
	public void listing_page_location_and_loaded_time_for_India_country() throws Throwable {
		putDataInExcel(28);
	}


	@Then("^Product page location and loaded time for Canada country\\.$")
	public void product_page_location_and_loaded_time_for_Canada_country() throws Throwable {
		putDataInExcel(29);
	}

	@Then("^Product page location and loaded time for USA country\\.$")
	public void product_page_location_and_loaded_time_for_USA_country() throws Throwable {
		putDataInExcel(30);
	}


	@Then("^Product page location and loaded time for UK country\\.$")
	public void product_page_location_and_loaded_time_for_UK_country() throws Throwable {
		putDataInExcel(31);
	}

	@Then("^Product page location and loaded time for India country\\.$")
	public void product_page_location_and_loaded_time_for_India_country() throws Throwable {
		putDataInExcel(32);
	}

// write get text value in excel sheet
public void putDataInExcel(int row) throws Exception {
	File src = new File("C:\\Users\\Administrator\\eclipse-workspace\\loaded result\\gtmetrixloaded\\LoadTest.xlsx");
	String cellValue[] = {location, speedtime};
	int count = 0;
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh1 = wb.getSheetAt(0);
	
		      Row row1 = sh1.getRow(row);
		     
		         // Row "rn" has data
		    	/*  System.out.println("cell number count"+row1.getLastCellNum());*/
		    	  if(row1.getLastCellNum()>=2) {
		    		  int cnlast=row1.getLastCellNum();
		    		  Cell cell = row1.getCell(cnlast);
			            if (cell == null) {
			            	String cellValue2[] = {speedtime};
			              // This cell is empty/blank/un-used, handle as needed
			            	DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
			        		
			        		Date date = new Date();
			        		
			        		String systemdateandtime= dateFormat.format(date);
			            	Row row0 = sh1.getRow(0);
			            	row0.createCell(cnlast).setCellValue(systemdateandtime);
			            	row1.createCell(cnlast).setCellValue(cellValue2[count]);
			            	count ++;
			            } else {
			             //System.out.println("load test data");
			               // Do something with the value
			            }
		    	  }
		    	  else {
		    		  for (int cn=row1.getLastCellNum(); cn<3; cn++) {
				            Cell cell = row1.getCell(cn);
				            if (cell == null) {
				              // This cell is empty/blank/un-used, handle as needed
				            	if (cn==2) {
					            	DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
					        		
					        		Date date = new Date();
					        		
					        		String systemdateandtime= dateFormat.format(date);
					            	Row row0 = sh1.getRow(0);
					            	row0.createCell(cn).setCellValue(systemdateandtime);
				            	}
				            	row1.createCell(cn).setCellValue(cellValue[count]);
				            	count ++;
				            } else {
				            // System.out.println("load test data");
				               // Do something with the value
				            }
				         
				      }
		    	  }
		    		  
	FileOutputStream fout = new FileOutputStream(src);
	wb.write(fout);
	wb.close();
}



//Write get text in txt folder
public void setDataFromFile(String speeed) {
	File file = new File("C:\\Users\\Administrator\\.jenkins\\workspace\\Test Slideteam Loaded Time\\Write.txt");
	BufferedReader br;
	try {
		br = new BufferedReader(new FileReader(file));

		String st;
		String data = "";

		while ((st = br.readLine()) != null) {

			data += st + "\r\n";

		}
		data += speeed;
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(data);
		fileWriter.close();
	} catch (IOException e) {

	}
}
}
