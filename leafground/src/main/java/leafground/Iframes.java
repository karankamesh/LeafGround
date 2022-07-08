package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement alertlink = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[10]/a"));
		alertlink.click();

		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("click"));
		frame1.click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement frame2 = driver.findElement(By.id("click1"));
		frame2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> frame3 = driver.findElements(By.tagName("iframe"));
		int totalframes = frame3.size();
		System.out.println("Total No.of Frames "+totalframes);
		
		driver.quit();
	}

}
