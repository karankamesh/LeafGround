package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWaitToDisppear {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");
		WebElement Disappear = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[21]/a"));
		Disappear.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = driver.findElement(By.id("btn"));
		boolean visible = wait.until(ExpectedConditions.invisibilityOf(button));
		//boolean visible = button.isDisplayed();
		if (visible==false) {
			System.out.println("Is Displayed");
		}else{
			System.out.println("Is DisAppeared");
		}
		

	}

}
