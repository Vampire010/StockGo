package IntraDay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntraDayBracketTrigerPrice {

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

				//Click on Bracket
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary  col-xl-2 text-capitalize css-zytga1' and starts-with(@id,'simple-tab-1')]"))).click();
		

				//Select Triger Price
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[4]/div[3]/div/div[4]/div/div/div[2]/div/input[@id='allSelect']"))).click();

				
				//Enter Triger Price
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"simple-tabpanel-1\"]/div/div/div[1]/div[3]/input"))).sendKeys("16");
				
				
				//price
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"simple-tabpanel-1\"]/div/div/div[1]/div[2]/input"))).sendKeys("12");

				//Target price
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"simple-tabpanel-1\"]/div/div/div[3]/div/div[1]/div/input"))).sendKeys("12");

				//StopLoss
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"simple-tabpanel-1\"]/div/div/div[3]/div/div[2]/input"))).sendKeys("12");
				
				//Buy Button
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"simple-tabpanel-1\"]/div/div/div[4]/div[2]/div[1]"))).click();

	}

}
