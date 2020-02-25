package practice_R;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calender_R {

	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\RkReddy3\\rkreddy\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait= new WebDriverWait(driver, 60);
	driver.get("http://apps.qaplanet.in/hrm/index.php");
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Add Employee")).click();
	driver.switchTo().frame("rightMenu");
	Thread.sleep(2000);
	driver.findElement(By.id("txtEmpLastName")).sendKeys("R_C");
	driver.findElement(By.id("txtEmpMiddleName")).sendKeys("R_H");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("R_A");
	driver.findElement(By.name("txtEmpNickName")).sendKeys("R_R");
	driver.findElement(By.id("btnEdit")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("btnEditPers")).click();
	//driver.findElement(By.name("btnDOB")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("DOB")).sendKeys("2017-06-12");
	driver.findElement(By.name("txtLicExpDate")).sendKeys("2019-07-12");
	driver.findElement(By.id("chkSmokeFlag")).click();
	driver.findElement(By.name("txtNICNo")).sendKeys("R_Y");
	driver.findElement(By.id("txtOtherID")).sendKeys("R_ID1");
	driver.findElement(By.id("txtLicenNo")).sendKeys("R_Licence123");
	driver.findElement(By.id("txtMilitarySer")).sendKeys("R_Service_No");
	
	//Select marital status by using drop down list
	Select select=new Select(driver.findElement(By.id("cmbMarital")));
	select.selectByVisibleText("Married");
	
	//Select gender
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	Thread.sleep(2000);
	
	//Click save button
	driver.findElement(By.id("btnEditPers")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.id("empname")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
	driver.findElement(By.xpath("//div[@id='photo']//input[@type='button']")).click();
	
	driver.findElement(By.xpath("//input[@class='backbutton']")).click(); 
	
	driver.switchTo().parentFrame();
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Logout")))).click();		
		}
	
}