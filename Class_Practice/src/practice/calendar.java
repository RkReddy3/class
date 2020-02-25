package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\rkreddy\\rkrworkspace\\drivers\\src\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.switchTo().frame("rightMenu");
		System.out.println("frameswitched");
		Thread.sleep(2000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Reddy");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Ramkrishna");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("EditMain")))).click();
		driver.findElement(By.id("DOB")).sendKeys("2019-11-19");
		Select sel=new Select(driver.findElement(By.id("cmbMarital")));
		sel.selectByVisibleText("Unmarried");
		driver.findElement(By.id("txtLicExpDate")).sendKeys("2019-12-15");
		driver.findElement(By.id("chkSmokeFlag")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("EditMain")))).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("empname")).click();
		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
		driver.findElement(By.xpath("//div[@id='photo']/div/div[2]/div[2]/div/input")).click();
		
		
	}

}
