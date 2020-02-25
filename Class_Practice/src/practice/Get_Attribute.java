package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\rkreddy\\rkrworkspace\\drivers\\src\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		
		
		System.out.println(driver.findElement(By.name("txtUserName")).getAttribute("name"));
		System.out.println(driver.findElement(By.name("txtUserName")).getAttribute("type"));
		System.out.println(driver.findElement(By.name("txtUserName")).getAttribute("class"));
		System.out.println(driver.findElement(By.name("txtUserName")).getAttribute("tabindex"));
		
		
	}

}
