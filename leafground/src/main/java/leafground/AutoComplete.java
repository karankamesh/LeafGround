package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement alertlink = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[17]/a"));
		alertlink.click();

		WebElement textbox = driver.findElement(By.id("tags"));
		textbox.sendKeys("S");
		
		Thread.sleep(3000);
		
		List<WebElement> optionlist = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		int size = optionlist.size();
		System.out.println(size);
		for (WebElement webElement : optionlist) {
			if (webElement.getText().equals("Selenium")) {
				webElement.click();
				break;
			}
		}
		
	}

}
