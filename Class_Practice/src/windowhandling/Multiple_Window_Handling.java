package windowhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiple_Window_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\rkreddy\\rkrworkspace\\drivers\\src\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    driver.get("http://qaplanet.in");
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='popmake-8889']/button"))).click();
	    
	    //===================Twitter=========================
	    driver.findElement(By.xpath("//div[@id='section-tophat']//img[@title='Twitter']")).click();
	    Set<String> IDS=driver.getWindowHandles();
	    Iterator<String> ITR=IDS.iterator();
	    String qaplanet=ITR.next();
	    System.out.println("Qaplanet ID="+qaplanet);
	    String twitter=ITR.next();
	    System.out.println("Twitter ID="+twitter);
	    driver.switchTo().window(twitter);	
	    System.out.println(driver.getTitle());
	    //driver.findElement(By.name("q")).sendKeys("Rkreddy");
	    Thread.sleep(2000);
	    driver.close();
	    driver.switchTo().window(qaplanet);
	    Thread.sleep(2000);
	  //===================Facebook=========================
	    driver.findElement(By.xpath("//div[@id='section-tophat']//img[@title='Facebook']")).click();
	    Set<String> IDS2=driver.getWindowHandles();
	    Iterator<String> ITR2=IDS2.iterator();
	    String qaplanet2=ITR2.next();
	    System.out.println("Qaplanet ID2="+qaplanet2);
	    String fb=ITR2.next();
	    System.out.println("fb ID="+fb);
	    driver.switchTo().window(fb);
	    System.out.println(driver.getTitle());
	    //driver.findElement(By.name("email")).sendKeys("Rkreddy");
	    Thread.sleep(2000);
	    driver.close();
	    driver.switchTo().window(qaplanet2);
	    Thread.sleep(2000);
	  //===================Linkedin=========================
	    driver.findElement(By.xpath("//div[@id='section-tophat']//img[@title='LinkedIn']")).click();
	    Set<String> IDS3=driver.getWindowHandles();
	    Iterator<String> ITR3=IDS3.iterator();
	    String qaplanet3=ITR3.next();
	    System.out.println("Qaplanet ID3="+qaplanet3);
	    String linkedin=ITR3.next();
	    System.out.println("linkedin ID="+linkedin);
	    driver.switchTo().window(linkedin);
	    System.out.println(driver.getTitle());
	    //driver.findElement(By.name("firstName")).sendKeys("Rkreddy");
	    Thread.sleep(2000);
	    driver.close();
	    driver.switchTo().window(qaplanet3);
	    
}

}
