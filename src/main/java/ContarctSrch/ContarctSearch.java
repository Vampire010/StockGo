package ContarctSrch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContarctSearch {
	public static void main(String[] args) throws InterruptedException 
	{
		String ShareName = "RELIANCE";
		
		System.setProperty("Webdriver.chrome.driver", "C:/Users/giris/eclipse-workspace-web/StockGo/Drivers/chromedriver.exe");
		//webdriver.chrome.;->value of path
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://dev-trade.pocketful.in/api/space/v2/contractdetails/searchScrip?searchText="+ ShareName +"&page=1");	
		
		WebElement sharetxt = driver.findElement(By.xpath("/html/body/pre"));
		
		String shareData = sharetxt.getText();
		System.out.println(shareData);
		
		
		
	}
}
