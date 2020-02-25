package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frontaccounting {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\rkreddy\\rkrworkspace\\drivers\\src\\drivers\\chromedriver.exe");
		    WebDriver Driver = new ChromeDriver();
		    Driver.manage().window().maximize();
		    WebDriverWait wait = new WebDriverWait(Driver,20);
		    Driver.get("http://apps.qaplanet.in/erp/index.php");
		    System.out.println(Driver.getTitle());
		    wait.until(ExpectedConditions.elementToBeClickable(By.name("user_name_entry_field"))).sendKeys("qaplanet1");
		    wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("lab1");
		    Driver.findElement(By.name("SubmitUser")).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("P"
		    		+ ""))).click();
		    
	}

}
