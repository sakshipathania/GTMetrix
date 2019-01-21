package ObjectRepository;

import org.openqa.selenium.By;

public class GtmetricObject {
	public static By Login_button=By.cssSelector("#user-nav-login>a");
	public static By email=By.id("li-email");
	public static By password=By.id("li-password");
	public static By login=By.xpath("//button[text()='Log In']");
	public static By URL=By.name("url");
	public static By country=By.cssSelector(".analyze-form-state>span #af-info-region");
	public static By analyze=By.xpath("//button[text()='Analyze']");
	public static By completed=By.cssSelector("div.report-details>h1");		
}
	
