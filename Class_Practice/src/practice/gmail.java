package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail 
{
	public static void main(String[] args) throws Exception

    {
    System.setProperty("webdriver.chrome.driver", "D:\\rkreddy\\rkrworkspace\\drivers\\src\\drivers\\chromedriver.exe");
    WebDriver Driver = new ChromeDriver();
    Driver.manage().window().maximize();
    WebDriverWait wait = new WebDriverWait(Driver,20);
    Driver.get("https://www.google.com/gmail");
    wait.until(ExpectedConditions.elementToBeClickable(Driver.findElement(By.id("identifierId")))).sendKeys("rkreddy.p369@gmail.com");
    Driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();    
    wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("rkr@krishna3");
    Driver.close();
    Driver.quit();
    }

}


