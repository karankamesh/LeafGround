package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement alertlink = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[14]/a"));
		alertlink.click();
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		WebElement Box = driver.findElement(By.id("mydiv"));
		Actions draganddrop = new Actions(driver);
		draganddrop.clickAndHold(draggable).moveToElement(droppable).release(droppable).build().perform();
		draganddrop.dragAndDrop(draggable, Box).build().perform();

	}

}
