package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement alertlink = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[16]/a"));
		alertlink.click();
		
		List<WebElement> sortable = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		int size = sortable.size();
		System.out.println(size);
		WebElement item7 = sortable.get(6);
		WebElement item6 = sortable.get(5);
		WebElement item5 = sortable.get(4);
		WebElement item4 = sortable.get(3);
		WebElement item3 = sortable.get(2);
		WebElement item2 = sortable.get(1);
		WebElement item1 = sortable.get(0);
		
		Actions sort = new Actions(driver);
		sort.clickAndHold(item7).moveToElement(item1).release().build().perform();
		sort.clickAndHold(item6).moveToElement(item1).release().build().perform();
		sort.clickAndHold(item5).moveToElement(item1).release().build().perform();
		sort.clickAndHold(item4).moveToElement(item1).release().build().perform();
		sort.clickAndHold(item3).moveToElement(item1).release().build().perform();
		sort.clickAndHold(item2).moveToElement(item1).release().build().perform();
		sort.clickAndHold(item1).moveToElement(item1).release().build().perform();
				
		
	}

}
