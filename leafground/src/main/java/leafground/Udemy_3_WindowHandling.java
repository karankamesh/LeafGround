package assignments;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Udemy_3_WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com");
		

		List<WebElement> links = driver.findElements(By.xpath("//*[@id='content']/ul/li"));
		for (int i = 0; i < links.size(); i++) {
			String link = links.get(i).getText();
			if (link.equals("Multiple Windows")) {
				Thread.sleep(1000);
				driver.findElements(By.xpath("//*[@id='content']/ul/li/a")).get(i).click();
				break;
			}
		}

		Thread.sleep(2000);
		WebElement clicktext = driver.findElement(By.xpath("/html/body/div[2]/div/div/a"));
		clicktext.click();

		Set<String>window = driver.getWindowHandles();
		Iterator<String> iterate = window.iterator();
		String parentwindow = iterate.next();
		String childwindow = iterate.next();

		driver.switchTo().window(childwindow);
		Thread.sleep(1000);

		System.out.println(driver.findElement(By.tagName("h3")).getText());

		driver.switchTo().window(parentwindow);
		Thread.sleep(1000);

		System.out.println(driver.findElement(By.xpath("//*[@class='example']/h3")).getText());

	}

}
