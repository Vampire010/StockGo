package Demo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Pocket {

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
	
		
		
		//Notification 
		/*Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[3]/div[3]/div/div[1]/div[2]/img"))).click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/div/button[2]"))).click();
		
		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/div/button[3]"))).click();
		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/div/button[1]"))).click();
		*/
		
		
		//calender
		Thread.sleep(10000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[3]/div[3]/div/div[1]/div[1]/img"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Track all markets on TradingView']"))).click(); 
				
		
		// Add to Watch list
		/*Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SearchStock\"]"))).sendKeys("YES BANK LIMITED");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"search-row-0\"]/div[2]/img"))).click();
		
		
		// Buy Stock
		Thread.sleep(3000);
		WebElement eleStock = driver.findElement(By.xpath("//*[@id=\"search-row-0]"));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.moveToElement(eleStock).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"search-row-0\"]/div[2]/div/div[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/div[4]/div[2]/div[1]"))).click();
		
		//Limit Price
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allSelect\"]"))).click();
		Thread.sleep(3000);

		WebElement lmtPrice = driver.findElement(By.xpath("//*[@id='simple-tabpanel-0']/div/div/div[1]/div[2]/input"));
		lmtPrice.clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/div[1]/div[2]/input"))).sendKeys("16.5");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/div[4]/div[2]/div[1]"))).click();


		//Sell
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[4]/div[3]/div/div[2]/div[2]/div/div/div[3]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/div[4]/div[2]/div[1]"))).click();
		
		//untick limit
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"allSelect\"]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/div[4]/div[2]/div[1]"))).click();
		
		*/

		
	}

}
