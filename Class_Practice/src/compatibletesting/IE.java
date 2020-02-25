package compatibletesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class IE {
	WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\rkreddy\\Drivers\\IEDriverServer.exe"); 
		WebDriver driver = new InternetExplorerDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify home page
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")){
			System.out.println("Home Page displayed");
		}
		//create object for UN,PWD
		WebElement objUN=wait.until(ExpectedConditions.elementToBeClickable(By.name("txtUserName")));
		WebElement objPWD=wait.until(ExpectedConditions.elementToBeClickable(By.name("txtPassword")));
		objUN.sendKeys("qaplanet1");
		objPWD.sendKeys("lab1");
//		//click on Login
//		driver.findElement(By.name("Submit")).click();
//		wait.until(ExpectedConditions.titleIs("OrangeHRM"));
//		//verify home page
//		assertEquals(driver.getTitle(), "OrangeHRM");
//		Reporter.log("OrangeHRM Page displayed");
//		//Get welcome Text
//		String WelText=driver.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
		driver.close();
		
	}


}
