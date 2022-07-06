package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hyperlink {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement hyperlink = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[3]/a"));
		hyperlink.click();
		
		WebElement link = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/a"));
		link.click();
		driver.navigate().back();
		
		WebElement findlink = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/a"));
		String value = findlink.getAttribute("href");
		System.out.println("The Link is "+value);
		
		WebElement brokenlink = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/a"));
		brokenlink.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("The link is broken");
		}else {
			System.out.println("The link is broken");
		}
		driver.navigate().back();
		
		WebElement linktext = driver.findElement(By.linkText("Go to Home Page"));
		linktext.click();
		driver.navigate().back();
		
		List<WebElement> totallink = driver.findElements(By.tagName("a"));
		int total = totallink.size();
		System.out.println("Total links "+total);
		
		
	}

}
