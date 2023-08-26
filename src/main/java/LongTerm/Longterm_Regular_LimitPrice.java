package LongTerm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Longterm_Regular_LimitPrice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "C:/Users/giris/eclipse-workspace-web/StockGo/Drivers/chromedriver.exe");
		//webdriver.chrome.;->value of path
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://dev-trade.pocketful.in/trading/login");	
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[1]/div/div/button/span")).click();
		 
		 
		 driver.findElement(By.xpath("//*[@id=\":r0:\"]")).sendKeys("vranacse@gmail.com");

		 
		driver.findElement(By.xpath("//*[@id=\':r1:\']")).sendKeys("India@123");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/form/div/div[1]/div/div[1]/button[1]/span")).click();

		//MPIN
		//WebElement revealed = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq' and starts-with(@id,':r2:')]"));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq' and starts-with(@id,':r2:')]"))).sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq' and starts-with(@id,':r3:')]"))).sendKeys("2");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq' and starts-with(@id,':r4:')]"))).sendKeys("3");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq' and starts-with(@id,':r5:')]"))).sendKeys("4");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq' and starts-with(@id,':r6:')]"))).sendKeys("5");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq' and starts-with(@id,':r7:')]"))).sendKeys("6");
		
		
		// Buy Stock
				Thread.sleep(5000);
				WebElement eleStock = driver.findElement(By.xpath("//div[@class='d-flex flex-column pkt-cursor-pointer pkt-padding-right-4' and starts-with(@id,'row-0')]"));
				
				//MouseHur
				Actions act = new Actions(driver);
				act.moveToElement(eleStock).build().perform();
				//click on Buy Button
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div[3]"))).click();
				
				Thread.sleep(5000);

				//Click on LongTerm
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='pkt-font-size-14 pkt-font-weight-400 pkt-line-height-16 text-center'  and starts-with(text(),'LONGTERM') ] "))).click();
		
				//Increase the Quantity ( Units )
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='simple-tabpanel-0']/div/div/div[1]/div[1]/div[1]/div[2]/img"))).click();
				
				//Select Limit Price CheckBox
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[4]/div[3]/div/div[3]/div/div/div[2]/div[1]/input[@id='allSelect']"))).click();
				
				//Select Trigger Price CheckBox
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[4]/div[3]/div/div[3]/div/div/div[2]/div[2]/input[@id='allSelect']"))).click();
				
				//Enter the Price
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='simple-tabpanel-0']/div/div/div[1]/div[2]/input"))).clear();

				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='simple-tabpanel-0']/div/div/div[1]/div[2]/input"))).sendKeys("12");
				
				
				//Enter the Triger Price
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='simple-tabpanel-0']/div/div/div[1]/div[3]/input"))).clear();

				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='simple-tabpanel-0']/div/div/div[1]/div[3]/input"))).sendKeys("12");
				
				
				
				//Buy Button
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='pkt-font-size-14 pkt-font-weight-500 pkt-line-height-18'  and starts-with(text(),'Buy') ] "))).click();

	}
}
