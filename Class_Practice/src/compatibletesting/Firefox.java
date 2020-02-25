package compatibletesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\rkreddy\\Drivers\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify home page
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) 
		{
			System.out.println("Home Page displayed");
		}
		
		//create object for UN,PWD
		WebElement objUN=wait.until(ExpectedConditions.elementToBeClickable(By.name("txtUserName")));
		WebElement objPWD=wait.until(ExpectedConditions.elementToBeClickable(By.name("txtPassword")));
		objUN.sendKeys("qaplanet1");
		objPWD.sendKeys("lab1");
		//click on Login
		driver.findElement(By.name("Submit")).click();
		wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		//verify home page
		if(driver.getTitle().equals("OrangeHRM"))
			System.out.println("OrangeHRM Page displayed");
		//Get welcome Text
		String WelText=driver.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
		System.out.println(WelText);
		System.out.println("Ramkrishna Reddy");
		driver.close();
		
	}

}
