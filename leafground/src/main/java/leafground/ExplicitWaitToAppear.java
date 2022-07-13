package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitToAppear {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");
		WebElement appear = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[22]/a"));
		appear.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = driver.findElement(By.id("btn"));
		WebElement visible = wait.until(ExpectedConditions.visibilityOf(button));
		Dimension size = visible.getSize();
		if (size.getHeight()==0) {
			System.out.println("The Button is Not Visible");
		}else {
			System.out.println("The Button is Visible");
		}

	}

}
