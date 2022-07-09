package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement alertlink = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[15]/a"));
		alertlink.click();
		
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int size = selectable.size();
		System.out.println(size);
		
		Actions select =  new Actions(driver);
		select.keyDown(Keys.CONTROL).click(selectable.get(0)).
		click(selectable.get(1)).
		click(selectable.get(2)).
		click(selectable.get(3)).build().perform();
		
		
		// We Can also Use Click And Hold
		
		select.clickAndHold(selectable.get(4));
		select.clickAndHold(selectable.get(5));
		select.clickAndHold(selectable.get(6));
		select.release().build().perform();

	}

}
