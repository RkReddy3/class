package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdownsecondfromlast {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\rkreddy\\rkrworkspace\\drivers\\src\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		Select se=new Select(driver.findElement(By.id("loc_code")));
		Thread.sleep(2000);
		int size=se.getOptions().size();
//		List<WebElement> sele=se.getOptions();
//		System.out.println(sele.size());
		se.selectByIndex(size-2);
		
		

		
		

	}

}
